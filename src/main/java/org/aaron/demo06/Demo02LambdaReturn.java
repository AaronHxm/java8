package org.aaron.demo06;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02LambdaReturn {

    public static void main(String[] args) {
        String[] array = {"aaa", "bbbbbbb", "ccccc"}; // 3, 7, 5

        // 匿名内部类
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, (a, b) -> a.length() - b.length());

        Comparator<String> comp1 = (a, b) -> a.length() - b.length();
        Arrays.sort(array, comp1);

        // 返回值是一个Lambda，也就是一个函数式接口。
        Comparator<String> comp2 = getComparator();
        Arrays.sort(array, comp2);
    }

    private static Comparator<String> getComparator() {
//        Comparator<String> comp = (a, b) -> a.length() - b.length();
//        return comp;
        return (a, b) -> a.length() - b.length(); // Lambda作为了方法的返回值
    }

}
