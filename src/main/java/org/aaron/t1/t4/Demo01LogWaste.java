package org.aaron.t1.t4;

/*
记日志，在没有Lambda的情况下，有可能浪费性能。

现在的步骤是：
1. 首先进行三个字符串的拼接。
2. 将拼接之后的结果传递进入方法。
3. 方法内部进行条件判断。
4. 条件成立，我就打印字符串；否则条件不成立，我的字符串没用上（意味着刚才白拼了）
 */
public class Demo01LogWaste {

    public static void main(String[] args) {
        String a = "Hello";
        String b = "Java";
        String c = "World";

        log(2, a + b + c);
    }

    private static void log(int level, String msg) {
        if (level == 1) {
            System.out.println(msg);
        }
    }

}
