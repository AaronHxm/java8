package org.aaron.demo06;

/*
使用Lambda作为方法的参数，其实就是使用对应的函数式接口，作为方法的参数。
 */
public class Demo01LambdaParam {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Lambda!")).start();

        Runnable target = () -> System.out.println("Lambda!!!");
        new Thread(target).start();
    }

}
