package org.aaron.t1.t3;

/**
 * @author : Aaron
 *     <p>create at: 2019-12-23 18:52
 *     <p>description: 测试接口
 */
public class DemoTestSumble {

  public static void main(String[] args) {
    methond((a, b) -> a + b);
    methond2(10+20);

  }
  // 参数是一个函数是接口，不代表最后结果，而是代表如何拿到结果
  public static void methond(Sumble sumble) {

    int sum = sumble.sum(10, 20);
    System.out.println("结果是" + sum);
  }
  // 次数参数是int 代表结果
  public static void methond2(int sum) {

    System.out.println("结果是" + sum);
  }
}
