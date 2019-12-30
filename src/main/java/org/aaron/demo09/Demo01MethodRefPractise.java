package org.aaron.demo09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo01MethodRefPractise {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
// 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
    System.out.println(squaresList);
        // Lambda语义：给我来个字符串，然后我去拼接并且打印。
        work(file -> System.out.println("处理文件：" + file));

        Assistant assistant = new Assistant();
        // 方法引用的语义：去找assistant对象当中的dealFile。
        work(assistant::dealFile);
    }

    private static void work(WorkHelper lambda) {
        lambda.help("薪资流水.txt");
    }

}
