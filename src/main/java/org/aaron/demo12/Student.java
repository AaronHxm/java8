package org.aaron.demo12;

/*
第三种方法引用，通过super引用父类方法，格式：

super::父类方法名
 */
public class Student extends Human {

    @Override
    public void sayHello() {
        method(() -> System.out.println("雷猴"));
        method(() -> super.sayHello());
        method(super::sayHello);
    }

    private void method(Greeter greeter) {
        greeter.greet(); // 和大家打了一个招呼
        System.out.println("我是一个可恶的小学生！");
    }
}
