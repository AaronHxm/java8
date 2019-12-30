package org.aaron.demo01;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02LambdaSort {

    public static void main(String[] args) {
        Person[] array = {
                new Person("赵丽颖", 28),
                new Person("赵丽蓉", 18),
                new Person("林志颖", 48)
        };

        // 匿名内部类
        Arrays.sort(array, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // Lambda标准格式
        Arrays.sort(array, (Person a, Person b) -> {
            return a.getAge() - b.getAge();
        });

        // Lambda省略格式
        Arrays.sort(array, (a, b) -> a.getAge() - b.getAge());

        // 方法引用
        Arrays.sort(array, Comparator.comparingInt(Person::getAge));
    }

}
