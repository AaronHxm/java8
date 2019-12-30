package org.aaron.demo08;

/*
第一种方法引用，通过对象名引用成员方法，格式：

对象名::成员方法名
 */
public class Demo01MethodRef1st {

    public static void main(String[] args) {
        // Lambda写法
        method(s -> System.out.println(s.toUpperCase()));

        MyClass obj = new MyClass();
        method(obj::printUpperCase);
    }

    private static void method(Printer lambda) {
        lambda.printLine("Hello");
    }

}
