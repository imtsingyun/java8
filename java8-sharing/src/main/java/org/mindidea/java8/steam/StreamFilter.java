/*
 * @class StreamFilter
 * @package org.mindidea.java8.filter
 * @date 2020/11/15 17:54
 * Copyright (c) 2020 MindIdea.org, All Rights Reserved.
 */
package org.mindidea.java8.steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author Tsingyun(青雲)
 * @version V1.0
 * @createTime 2020/11/15 17:54
 * @blog https://mindidea.org
 */
public class StreamFilter {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 9, 9);
        // 获取偶数
        List<Integer> collect = list.stream().filter(i -> i % 2 == 0).collect(toList());
        System.out.println(collect);

        // 去重
        List<Integer> collect1 = list.stream().distinct().collect(toList());
        System.out.println(collect1);

        // skip
        List<Integer> collect2 = collect1.stream().skip(5).collect(toList());
        System.out.println(collect2);

        // limit
        List<Integer> collect3 = collect1.stream().limit(5).collect(toList());
        System.out.println(collect3);
    }
}
