package org.aaron.demo11;

public class Demo02MethodRefParactise {

    public static void main(String[] args) {
        method(n -> n < 0 ? -n : n);
        method(Math::abs);
    }

    private static void method(Calculator lambda) {
        int num = lambda.getAbsNum(-10);
        System.out.println("绝对值是：" + num);
    }

}
