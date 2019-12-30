package org.aaron.demo05;

/*
Lambda在调用了抽象方法的时候，才会执行。否则不会执行。

现在的步骤：
1. 调用方法，传递进去int和Lambda。但是Lambda没有执行。
2. 在方法之内判断条件
3. 如果条件成立，那么调用抽象方法，则Lambda执行。
4. 如果条件不成立，那么抽象方法没有被调用，Lambda就不会执行。
 */
public class Demo02LogLambda {

    public static void main(String[] args) {
        String a = "Hello";
        String b = "Java";
        String c = "World";

//        log(2, () -> a + b + c);

        log(2, () -> {
            System.out.println("Lambda执行啦！");
            return a + b + c;
        });
    }

    private static void log(int level, MsgBuilder builder) {
        if (level == 1) {
            System.out.println(builder.build());
        }
    }

}
