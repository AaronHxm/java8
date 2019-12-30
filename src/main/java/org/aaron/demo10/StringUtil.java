package org.aaron.demo10;

public class StringUtil {

    public static boolean isBlank(String str) {
        // "   a   b   "
        // trim就是去掉左右两端的空格
        // trim --> "a   b"
        return str == null || "".equals(str.trim());
    }

}
