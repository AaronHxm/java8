package org.aaron.demo14;

/*
类的构造器引用，格式：

类名称::new
 */
public class Demo01ConstructorRef {

    public static void main(String[] args) {
        Person one = new Person("赵丽颖", 18);

        method((name, age) -> {
            Person p = new Person();
            p.setName(name);
            p.setAge(age);
            return p;
        });

        method((name, age) -> new Person(name, age));

        method(Person::new);
    }

    private static void method(PersonBuilder builder) {
        Person person = builder.build("赵丽蓉", 28);
        System.out.println(person);
    }

}
