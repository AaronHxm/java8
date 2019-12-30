package org.aaron.demo10;

/*
第二个方法引用，通过类名称引用静态方法，格式：

类名称::静态方法名
 */
public class Demo01MethodRef2nd {

    public static void main(String[] args) {
        // Lambda
        method("   Hello   ", s -> s == null || "".equals(s.trim()));

        // 方法引用
        method("   World   ", StringUtil::isBlank);
    }

    private static void method(String str, StringChecker checker) {
        boolean isBlank = checker.checkBlank(str);
        System.out.println("是不是空：" + isBlank);
    }

}
