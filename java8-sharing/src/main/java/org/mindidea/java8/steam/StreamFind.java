/*
 * @class StreamFind
 * @package org.mindidea.java8.steam
 * @date 2020/11/15 18:24
 * Copyright (c) 2020 MindIdea.org, All Rights Reserved.
 */
package org.mindidea.java8.steam;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Tsingyun(青雲)
 * @version V1.0
 * @createTime 2020/11/15 18:24
 * @blog https://mindidea.org
 */
public class StreamFind {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 9, 9);
        Stream<Integer> stream = list.stream();

        Optional<Integer> result = stream.filter(i -> i % 2 == 0).findAny();

        stream = list.stream();
        result = stream.filter(i -> i % 2 == 0).findFirst();

        result.ifPresent(System.out::println);

        int i1 = find(new Integer[]{1, 2, 3, 4, 5, 6, 7}, -1, i -> i > 100);
        System.out.println(i1);
    }

    private static int find(Integer[] values, int defaultValue, Predicate<Integer> predicate) {
        for (int i : values) {
            if (predicate.test(i))
                return i;
        }
        return defaultValue;
    }
}
