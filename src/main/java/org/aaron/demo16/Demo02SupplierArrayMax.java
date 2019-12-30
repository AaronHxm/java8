package org.aaron.demo16;

import java.util.function.Supplier;

public class Demo02SupplierArrayMax {

    public static void main(String[] args) {
        int[] array = {10, 20, 306, 478, 30};

        showMax(() -> {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        });
    }

    private static void showMax(Supplier<Integer> supplier) {
        int max = supplier.get();
        System.out.println("最大值：" + max);
    }

}
