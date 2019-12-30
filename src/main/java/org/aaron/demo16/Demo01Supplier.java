package org.aaron.demo16;

import java.util.function.Supplier;

/*
JDK当中已经提供好了的很多常用的函数式接口，全都位于java.util.function包中。

Supplier<T>代表提供者，唯一的抽象方法：
    T get()：对外提供一个对象。
 */
public class Demo01Supplier {

    public static void main(String[] args) {
        String a = "AAA";
        String b = "BBB";
        method(() -> a + b);
    }

    private static void method(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

}
