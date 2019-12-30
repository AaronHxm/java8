package org.aaron.demo17;

import java.util.function.Consumer;

/*
Consumer当中除了抽象方法之外，还有一个默认方法：andThen
 */
public class Demo02ConsumerAndThen {

    public static void main(String[] args) {
        method(s -> System.out.println(s.toUpperCase()),
                s -> System.out.println(s.toLowerCase()));
    }

    private static void method(Consumer<String> one, Consumer<String> two) {
//        one.accept("Hello");
//        two.accept("Hello");

//        Consumer<String> total = one.andThen(two);
//        total.accept("Hello");

        one.andThen(two).accept("Hello");
    }

}
