/*
 * @class FilterAppleLambda
 * @package org.mindidea.java8
 * @date 2020/11/14 23:31
 * Copyright (c) 2020 MindIdea.org, All Rights Reserved.
 */
package org.mindidea.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tsingyun(青雲)
 * @version V1.0
 * @createTime 2020/11/14 23:31
 * @blog https://mindidea.org
 */
public class FilterAppleLambda {

    /**
     * 一个接口中只有一个方法，则这个接口称为 Functional
     *
     * @author Tsingyun(青雲)
     * @version V1.0
     * @createTime 2020/11/14 23:33
     * @blog https://mindidea.org
     */
    @FunctionalInterface
    public interface AppleFilter {
        boolean filter(Apple apple);
    }

    public static List<Apple> findApple(List<Apple> appleList, AppleFilter filter) {
        ArrayList<Apple> list = new ArrayList<>();
        for (Apple a: appleList) {
            if (filter.filter(a)) {
                list.add(a);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("green", 150),
                new Apple("red", 300),
                new Apple("yellow",200),
                new Apple("green", 220));

        List<Apple> result = findApple(
                list,
                apple -> "green".equals(apple.getColor()) && apple.getWeight() > 180
        );

        System.out.println("=====================================\n" + result);
    }
}
