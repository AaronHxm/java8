package org.aaron.demo07;

/*
Java 8除了Lambda表达式以外，还有一个与之对应的孪生兄弟“方法引用”。
可以在某些情况下，省去Lambda表达式当中的的重复逻辑。
如果Lambda要求的事情，在某一个方法当中已经有了，那么无需Lambda倒手，可以直接使用方法引用。

方法引用符“::”两个英文冒号连着写，
这个符号所在的表达式，叫做“方法引用”。

备注：
即便使用了方法引用，在多个重载的方法之间，谁能够直接匹配，就优先用谁。
所以，即便System.out::println没有参数，
但是只有(String x)才能匹配上，其他人都不是直接匹配。

方法的引用的用法很多：

对于类来说：
    1. 通过对象名引用成员方法
    2. 通过类名称引用静态方法
    3. 通过super引用父类方法
    4. 通过this引用本类方法

对于构造器（构造方法）来说：
    1. 类的构造器引用
    2. 数组的构造器引用
 */
public class Demo01MyPrinter {

    public static void main(String[] args) {
        method(s -> System.out.println(s)); // Lambda只是将参数原封不动地交给了sout语句，Lambda很冗余

        method(System.out::println);
    }

    private static void method(MyPrinter lambda) {
        lambda.printLine("Hello");
    }

}
