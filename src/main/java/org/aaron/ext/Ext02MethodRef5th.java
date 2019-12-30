package org.aaron.ext;


import java.util.Arrays;
import java.util.Comparator;
import org.aaron.demo01.Person;

/*
第五种方法引用形式，通过类名称引用成员方法，格式：

类名称::成员方法

注意事项：
这种方法引用的使用前提是：函数式接口当中的抽象方法，必须保证第一个参数为真正执行目标方法的对象。
 */
public class Ext02MethodRef5th {

    public static void main(String[] args) {
        method((obj, str) -> obj.printUpperCase(str));
//        method((str, obj) -> obj.printUpperCase(str));

        method(MyClass::printUpperCase);

        Person[] array = {
                new Person("鹿晗", 20),
                new Person("吴亦凡", 25),
                new Person("张艺兴", 23)
        };

        // 一个Person对象，怎么才能变成int数字呢？
        // 方法引用：Person::getAge
        // 把每一个Person对象都去找到其中的成员方法getAge，就能变成int
        Arrays.sort(array, Comparator.comparingInt(Person::getAge));
    }

    private static void method(MyPrinter printer) {
        printer.printLine(new MyClass(), "Hello");
    }

}
