package org.aaron.demo13;

public class Husband {

    private void buyHouse() {
        System.out.println("在天安门旁边买了一个大耗子");
    }

    private void marry(Richable lambda) {
        lambda.buy();
    }

    // 作为一个男人，要开心一下
    public void beHappy() {
        marry(() -> System.out.println("买了一个1024克拉的钻戒"));

        marry(this::buyHouse);
    }

}
