/*
 * @class Apple
 * @package org.mindidea.java8
 * @date 2020/11/14 20:45
 * Copyright (c) 2020 MindIdea.org, All Rights Reserved.
 */
package org.mindidea.java8.lambda;

/**
 * @author Tsingyun(青雲)
 * @version V1.0
 * @createTime 2020/11/14 20:45
 * @blog https://mindidea.org
 */
public class Apple {

    private String color;

    private long weight;

    public Apple(String color, long weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
