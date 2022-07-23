package com.java.jdk8;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;


public class stream {

    @Test
    public void streamFilter() {
        List<Integer> list = Arrays.asList(6,7,8,9);
        Stream<Integer> stream = list.stream();
        stream.filter(x -> x>5).forEach(System.out::println);
    }

    @Test
    public void streamMap() {
        Stream.of("a:10", "b:19").map(new Function<String, People>() {
            @Override
            public People apply(String s) {
                String[] str = s.split(":");
                People people = new People(str[0], Integer.valueOf(str[1]));
                return people;
            }
        }).forEach(people -> System.out.println(people.getName() + "=" + people.getAge()));
    }

    @Data
    @AllArgsConstructor
    class People {
        private String name;
        private int age;
    }

    /**
     * 默认升序
     */
    @Test
    public void streamSort() {
        Stream<Integer> stream = Stream.of(5,3,22,44,11,3,56,1,0);
        stream.sorted().forEach(System.out::println);

        stream.sorted((x1, x2) -> {
            return x2.compareTo(x1);
        }).forEach(System.out::println);

    }

    @Test
    public void testOptional() {
        Integer value1 = null;
        Integer value2 = new Integer(10);

        // Optional.ofNullable - 允许传递为 null 参数
        Optional<Integer> a = Optional.ofNullable(value1);

        // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
        Optional<Integer> b = Optional.of(value2);
        System.out.println(sum(a,b));
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b){

        // Optional.isPresent - 判断值是否存在

        System.out.println("第一个参数值存在: " + a.isPresent());
        System.out.println("第二个参数值存在: " + b.isPresent());

        // Optional.orElse - 如果值存在，返回它，否则返回默认值
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - 获取值，值需要存在
        Integer value2 = b.get();
        return value1 + value2;
    }
}
