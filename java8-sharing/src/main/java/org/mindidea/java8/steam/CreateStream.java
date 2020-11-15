/*
 * @class CreateStream
 * @package org.mindidea.java8.steam
 * @date 2020/11/15 13:56
 * Copyright (c) 2020 MindIdea.org, All Rights Reserved.
 */
package org.mindidea.java8.steam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author Tsingyun(青雲)
 * @version V1.0 中华民国 中华人民共和国
 * @createTime 2020/11/15 13:56
 * @blog https://mindidea.org
 */
public class CreateStream {

    public static void main(String[] args) {
//        createStreamFromCollection().forEach(System.out::println);
//        createStreamFromFile();
//        createStreamFromIterator().forEach(System.out::println);
//        createStreamFromGenerate().forEach(System.out::println);
        createObjStreamFromGenerate().forEach(System.out::println);
    }

    /**
     * generate the stream from Collection
     *
     * @return Stream
     * @author Tsingyun(青雲)
     * @createTime 2020/11/15 13:58
     */
    private static Stream<String> createStreamFromCollection() {
        List<String> list = Arrays.asList("hello", "world", " is ", "world");
        return list.stream();
    }

    /**
     * generate the stream from values
     *
     * @return Stream
     * @author Tsingyun(青雲)
     * @createTime 2020/11/15 14:01
     */
    private static Stream<String> createStreamFromValue() {
        return Stream.of("Hello1, ", "hello2");
    }

    /**
     * generate the stream object from Array
     *
     * @return Stream
     * @author Tsingyun(青雲)
     * @createTime 2020/11/15 14:02
     */
    private static Stream<String> createStreamFromArrays() {
        return Arrays.stream(new String[]{"Hello", "world", "!"});
    }

    /**
     * generate the stream object from file
     *
     * @return Stream
     * @author Tsingyun(青雲)
     * @createTime 2020/11/15 14:58
     */
    private static Stream<String> createStreamFromFile() {
        Path path = Paths.get("E:\\Github\\java8\\java8-sharing\\" +
                "src\\main\\java\\org\\mindidea\\java8\\steam\\CreateStream.java");

        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
            return lines;
        } catch (IOException e) {
            throw new RuntimeException("");
        }
    }

    /**
     * generate the stream object from iterator
     *
     * @return Stream
     * @author Tsingyun(青雲)
     * @createTime 2020/11/15 15:00
     */
    private static Stream<Integer> createStreamFromIterator() {
        return Stream.iterate(0, n -> n + 2).limit(20);
    }

    /**
     * generator the stream object from generate
     *
     * @return Stream
     * @author Tsingyun(青雲)
     * @createTime 2020/11/15 15:02
     */
    private static Stream<Double> createStreamFromGenerate() {
        return Stream.generate(Math::random).limit(10);
    }

    /**
     * generator the stream object from generate
     *
     * @return Stream
     * @author Tsingyun(青雲)
     * @createTime 2020/11/15 17:47
     */
    private static Stream<Obj> createObjStreamFromGenerate() {
        return Stream.generate(new ObjSupplier()).limit(10);
    }

    static class ObjSupplier implements Supplier<Obj> {
        private final Random random = new Random(System.currentTimeMillis());

        @Override
        public Obj get() {
            int index = random.nextInt(100);
            return new Obj(index, "name->" + index);
        }
    }

    static class Obj {
        private final int id;
        private final String name;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Obj(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Obj{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
