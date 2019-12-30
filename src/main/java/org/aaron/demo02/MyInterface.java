package org.aaron.demo02;

/*
函数式接口
    概念：有且仅有一个需要实现的抽象方法，这样的接口叫做函数式接口。
    用法：
        1. 可以当做普通接口使用：implements
        2. 当做Lambda的使用前提
    注解（Annotation @）：
        @FunctionalInterface：用来检测一个接口是不是函数式接口。
    注意：只要满足概念定义的要求，就算不写这个注解，也照样是函数式接口。
 */
@FunctionalInterface
public interface MyInterface {

    void method();

}
