/*
 * @class MethodReference
 * @package org.mindidea.java8
 * @date 2020/11/15 10:54
 * Copyright (c) 2020 MindIdea.org, All Rights Reserved.
 */
package org.mindidea.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author Tsingyun(青雲)
 * @version V1.0
 * @createTime 2020/11/15 10:54
 * @blog https://mindidea.org
 */
public class MethodReference {

    public static void main(String[] args) {
//        Consumer<String> consumer = (s) -> System.out.println(s);
//        useConsumer(consumer, "hello, world");

        useConsumer(System.out::println, "hello, world!");

        List<Apple> list = Arrays.asList(
                new Apple("yellow", 120),
                new Apple("green", 110),
                new Apple("red", 130)
        );
        System.out.println(list);
        list.sort(Comparator.comparing(Apple::getColor));
        System.out.println(list);

        list.stream().forEach(System.out::println);

        System.out.println("====================================");
        Function<String, Integer> f = Integer::parseInt;
        System.out.println(f.apply("123") + 4);

        BiFunction<String, Integer, Character> f2 = String::charAt;
        Character c = f2.apply("hello", 1);
        System.out.println(c);
    }

    private static <T> void useConsumer(Consumer<T> consumer, T t) {
        consumer.accept(t);
        consumer.accept(t);
    }
}
