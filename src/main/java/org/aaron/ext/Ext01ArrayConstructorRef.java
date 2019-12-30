package org.aaron.ext;

import java.util.ArrayList;
import java.util.List;

public class Ext01ArrayConstructorRef {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("赵丽颖");
        list.add("赵丽蓉");
        list.add("林志颖");
        list.add("张靓颖");

        Object[] arr1 = list.toArray();

        // 提前准备一个长度正好的String数组
        String[] arr2 = new String[list.size()];
        list.toArray(arr2);

        // 参数数组长度为0，无法存放任何数据，但是仍然可以告知具体泛型是String类型。
        // 如果toArray拿到的参数长度不用，将会创建更大的数组，作为新的返回值。
        // 如果够用，将会返回原数组。
        String[] arr3 = list.toArray(new String[0]);

        // 涉及一点明天学习的知识：
        String[] arr4 = list.stream().toArray(String[]::new);
    }

}
