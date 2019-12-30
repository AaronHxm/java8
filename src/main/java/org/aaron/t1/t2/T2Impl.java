package org.aaron.t1.t2;

/**
 * @author : Aaron
 *
 * create at:  2019-12-23  18:49
 *
 * description: s
 */
public class T2Impl {

  public static void main(String[] args) {

    keepAlive(() -> System.out.println("我开始吃了"));
  }


  public static void keepAlive(T2 t2){

    t2.eat();

  }
}

