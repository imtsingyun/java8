/*
 * @class StreamMap
 * @package org.mindidea.java8.steam
 * @date 2020/11/15 18:01
 * Copyright (c) 2020 MindIdea.org, All Rights Reserved.
 */
package org.mindidea.java8.steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author Tsingyun(青雲)
 * @version V1.0
 * @createTime 2020/11/15 18:01
 * @blog https://mindidea.org
 */
public class StreamMap {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 9, 9);

        List<Integer> res1 = list.stream().map(i -> i * 2).collect(toList());
        System.out.println(res1);

        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );
        menu.stream().map(Dish::getName).forEach(System.out::println);
        System.out.println("===========================================");
        // flatmap
        String[] words = {"hello", "world", "java"};
        // {h,e,l,l,o}, {w,o,r,l,d},{j,a,v,a}
        Stream<String[]> stream = Arrays.stream(words).map(w -> w.split(""));
        // h,e,l,l,o,w,o,r,l,d
        Stream<String> stringStream = stream.flatMap(Arrays::stream);
        stringStream.distinct().forEach(System.out::print);
    }
}
