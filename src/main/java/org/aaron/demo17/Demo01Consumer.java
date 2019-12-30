package org.aaron.demo17;

import java.util.function.Consumer;

/*
又一个常用的函数式接口：java.util.function.Consumer<T>

其中的抽象方法：
    void accept(T t)：参数代表消费的数据，没有返回值。
 */
public class Demo01Consumer {

    public static void main(String[] args) {
        method(s -> System.out.println(s));
        method(System.out::println);

        method(s -> System.out.println(s.toUpperCase()));
    }

    private static void method(Consumer<String> consumer) {
        consumer.accept("Hello");
    }

}
