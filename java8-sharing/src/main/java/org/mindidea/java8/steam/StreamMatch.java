/*
 * @class StreamMatch
 * @package org.mindidea.java8.steam
 * @date 2020/11/15 18:19
 * Copyright (c) 2020 MindIdea.org, All Rights Reserved.
 */
package org.mindidea.java8.steam;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * nonematch anymatch allmatch
 * @author Tsingyun(青雲)
 * @version V1.0
 * @createTime 2020/11/15 18:19
 * @blog https://mindidea.org
 */
public class StreamMatch {

    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7});

        boolean b = stream.allMatch(i -> i > 4);
        System.out.println(b);

        stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        boolean b1 = stream.anyMatch(i -> i > 6);
        System.out.println(b1);

        stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        b1 = stream.noneMatch(i -> i > 8);
        System.out.println(b1);
    }
}
