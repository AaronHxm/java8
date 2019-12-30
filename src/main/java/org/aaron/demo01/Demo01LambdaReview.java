package org.aaron.demo01;

/*
复习一下此前学习的Lambda相关知识。

省略的宗旨是：可推导即可省略。
() -> {}

省略规则：
1. 接口名称可以省略。
2. 唯一的抽象方法名称可以省略。
3. 参数的类型可以省略。（如果有多个参数，那么要么全都省略类型，要么全都不省略类型，不能只省略一部分类型。）
4. 如果参数有且仅有一个，那么小括号可以省略。
5. 如果语句有且仅有一个，那么无论有没有返回值，return、大括号、分号都可以省略。

前提条件：
1. 必须有接口，而且其中有且仅有一个需要实现的抽象方法。
2. 必须有上下文推导。（要么等号左边的局部变量是接口类型，要么方法传递参数形式参数是接口类型。）
 */
public class Demo01LambdaReview {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类执行！");
            }
        }).start();

        // Lambda的标准格式：
        new Thread(() -> {
            System.out.println("Lambda标准格式执行！");
        }).start();

        // Lambda省略格式：
        new Thread(() -> System.out.println("Lambda省略格式执行！")).start();
    }

}
