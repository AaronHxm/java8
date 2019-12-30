package org.aaron.demo06;

public class Demo03MySupplier {

    public static void main(String[] args) {
        method(() -> "Hello");

        MySupplier supplier = getSupplier();
        System.out.println(supplier.get());
    }

    private static MySupplier getSupplier() {
//        MySupplier ms = () -> "World";
//        return ms;

        return () -> "World";
    }

    // 使用Lambda作为方法的参数，其实就是使用函数式接口作为参数
    private static void method(MySupplier lambda) {
        Object obj = lambda.get();
        System.out.println(obj);
    }

}
