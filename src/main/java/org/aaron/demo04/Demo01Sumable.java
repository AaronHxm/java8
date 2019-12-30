package org.aaron.demo04;

public class Demo01Sumable {

    public static void main(String[] args) {
        method((a, b) -> a + b);
        methodNum(10 + 20);
    }

    // 参数是一个函数式接口的Lambda，不代表最终结果，而是代表如何拿到结果的规则。
    private static void method(Sumable lambda) {
        int result = lambda.sum(10, 20);
        System.out.println("结果是：" + result);
    }

    // 参数是一个int数字，代表结果
    private static void methodNum(int num) {
        System.out.println(num);
    }

}
