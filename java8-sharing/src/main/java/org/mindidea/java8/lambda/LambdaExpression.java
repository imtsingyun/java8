/*
 * @class LambdaExpression
 * @package org.mindidea.java8
 * @date 2020/11/15 0:57
 * Copyright (c) 2020 MindIdea.org, All Rights Reserved.
 */
package org.mindidea.java8.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Tsingyun(青雲)
 * @version V1.0
 * @createTime 2020/11/15 0:57
 * @blog https://mindidea.org
 */
public class LambdaExpression {

    public static void main(String[] args) {
        Comparator<Apple> byColor = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        };

        List<Apple> list = Collections.emptyList();
        list.sort(byColor);


        Comparator<Apple> byColor2 = (o1, o2) -> o1.getColor().compareTo(o2.getColor());

        Function<String, Integer> funcLambda = s -> s.length();
        System.out.println(funcLambda.apply("Hello, world"));

        Predicate<Apple> p = a -> a.getColor().equals("green");
        System.out.println(p.test(new Apple("red", 123)));
    }
}
