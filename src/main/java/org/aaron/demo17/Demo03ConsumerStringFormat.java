package org.aaron.demo17;

import java.util.function.Consumer;

public class Demo03ConsumerStringFormat {

    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "玛尔扎哈,男"};

        // 要求输出：“姓名：迪丽热巴。性别：女。”
        // 第一个动作：根据原始字符串，切分得到左边姓名。
        // 第二个动作，根据原始字符串，切分得到右边性别。

        method(s -> System.out.print("姓名：" + s.split(",")[0] + "。"),
                s -> System.out.println("性别：" + s.split(",")[1] + "。"),
                array);
    }

    /**
     * 这个方法专门用来根据数组和两个动作，打印输出题目要求的字样。
     *
     * @param one   代表每个字符串要进行的第一个消费动作
     * @param two   代表每个字符串要进行的第二个消费动作
     * @param array 代表字符串所在的数组
     */
    private static void method(Consumer<String> one, Consumer<String> two, String[] array) {
        for (String str : array) {
            one.andThen(two).accept(str);
        }
    }

}
