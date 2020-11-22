/*
 * @class NumericStream
 * @package org.mindidea.java8.steam
 * @date 2020/11/15 18:44
 * Copyright (c) 2020 MindIdea.org, All Rights Reserved.
 */
package org.mindidea.java8.steam;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Tsingyun(青雲)
 * @version V1.0
 * @createTime 2020/11/15 18:44
 * @blog https://mindidea.org
 */
public class NumericStream {

    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6});

        Integer result = stream.filter(i -> i > 3).reduce(0, Integer::sum);
        System.out.println(result);

        stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6});
        // 转换 Integer -> int
        IntStream intStream = stream.mapToInt(i -> i.intValue());

    }
}
