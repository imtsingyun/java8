/*
 * @class StreamReduce
 * @package org.mindidea.java8.steam
 * @date 2020/11/15 18:35
 * Copyright (c) 2020 MindIdea.org, All Rights Reserved.
 */
package org.mindidea.java8.steam;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * 聚合
 *
 * @author Tsingyun(青雲)
 * @version V1.0
 * @createTime 2020/11/15 18:35
 * @blog https://mindidea.org
 */
public class StreamReduce {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> stream = list.stream();

//        Integer reduce = stream.reduce(0, (i, j) -> i + j);
        Integer reduce = stream.reduce(0, Integer::sum);
        System.out.println(reduce);


        stream = list.stream();
//        stream.reduce((i, j) -> i > j ? i : j).ifPresent(System.out::println);
        stream.reduce(Integer::max).ifPresent(System.out::println);

    }

}
