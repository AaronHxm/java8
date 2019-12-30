package org.aaron.demo15;

import java.util.Arrays;

/*
构造器引用当中还有一种数组构造器引用，格式：

数组类型::new

小结一下方法引用的格式：
对于类来说：
    1. 对象名::成员方法
    2. 类名称::静态方法
    3. super::父类方法
    4. this::本类方法
对于构造器来说：
    1. 类名称::new
    2. 数组类型::new
 */
public class Demo01ArrayConstrctorRef {

    public static void main(String[] args) {
        double[] arr = new double[3];

        method(len -> new double[len]); // 冗余的Lambda

        method(double[]::new); // 推荐的方法引用
    }

    private static void method(ArrayBuilder builder) {
        double[] arr = builder.buildArray(3);
        System.out.println(Arrays.toString(arr));
    }

}
