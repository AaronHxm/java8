package org.aaron.demo03;

/*
无参数、无返回值的函数式接口，说的是其中唯一的抽象方法没有参数、没有返回值。
 */
public class Demo01Eatable {

    public static void main(String[] args) {
        keepAlive(() -> System.out.println("吃了一个大包子！嗝儿！"));
    }

    private static void keepAlive(Eatable lambda) {
        lambda.eat();
    }

}
