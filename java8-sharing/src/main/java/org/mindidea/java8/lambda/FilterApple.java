/*
 * @class FilterApple
 * @package org.mindidea.java8
 * @date 2020/11/14 20:47
 * Copyright (c) 2020 MindIdea.org, All Rights Reserved.
 */
package org.mindidea.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tsingyun(青雲)
 * @version V1.0
 * @createTime 2020/11/14 20:47
 * @blog https://mindidea.org
 */
public class FilterApple {

    interface AppleFilter {
        boolean filter(Apple apple);
    }

    public static List<Apple> findApple(List<Apple> apples, AppleFilter filter) {
        ArrayList<Apple> list = new ArrayList<>();
        for (Apple a: apples) {
            if (filter.filter(a)) {
                list.add(a);
            }
        }
        return list;
    }

    public static class GreenAnd180WeightFilter implements AppleFilter {

        @Override
        public boolean filter(Apple apple) {
            return "green".equals(apple.getColor()) && apple.getWeight() > 180;
        }
    }

    public static List<Apple> findGreenApple(List<Apple> apples) {
        ArrayList<Apple> list = new ArrayList<>();
        for (Apple a: apples) {
            if ("green".equals(a.getColor())) {
                list.add(a);
            }
        }
        return list;
    }

    public static List<Apple> findApple(List<Apple> apples, String color) {
        ArrayList<Apple> list = new ArrayList<>();

        for (Apple a: apples) {
            if (color.equals(a.getColor())) {
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

        List<Apple> greenApple = findGreenApple(list);
        assert greenApple.size() == 2;

        System.out.println(greenApple);

        GreenAnd180WeightFilter filter = new GreenAnd180WeightFilter();
        List<Apple> apple = findApple(list, filter);
        System.out.println(apple);
    }
}
