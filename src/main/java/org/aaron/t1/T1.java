package org.aaron.t1;

/**
 * @author : Aaron
 *
 * create at:  2019-12-10  16:46
 *
 * description: 接口
 */

/**
 * 函数接口：有且只有一个抽象方法
 * 当然接口可以包含其他方法(默认、静态、私有
 * @FunctionalInterface 检测接口是否是一个函数是接口
 *  是：编译成功
 *  否：编译失败，接口中没有抽象方法，或者抽象方法大于1
 */
@FunctionalInterface //此注解保证只有一个抽象接口
public interface T1 {
     abstract void method1();


 }
