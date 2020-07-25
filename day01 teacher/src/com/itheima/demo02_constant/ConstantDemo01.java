package com.itheima.demo02_constant;

//自定义一个类, 类名叫: ConstantDemo01, 用来演示常量的.

/*
    Java中的常量解释:
        概述:
            在程序的执行过程中, 其值不能发生改变的量就叫: 常量.
        分类:
            1. 自定义常量(目前先了解)
            2. 字面值常量
                整数常量        直接写
                小数常量        直接写
                字符常量        值要用''包裹
                字符串常量      值要用""包裹
                布尔常量        值只有true和false
                空常量          值只有一个: null
 */
public class ConstantDemo01 {
    //定义main方法, 作为程序的主入口
    public static void main(String[] args) {
        //1. 输出整数常量
        System.out.println(10);
        System.out.println(20);
        System.out.println("-------------------");
        //2. 输出小数常量
        System.out.println(5.21);
        System.out.println("-------------------");
        //3. 输出字符常量, 要求值有且只能有一个
        System.out.println('男');
        //System.out.println('10');   //这样写会报错, 10 =  1 和 0 拼接, 是两个字符
        //System.out.println('');     //这样写会报错
        System.out.println("-------------------");
        //4. 输出字符串常量
        System.out.println("夯哥");
        System.out.println("");
        System.out.println("-------------------");
        //5. 输出布尔常量
        System.out.println(true);
        System.out.println(false);
        System.out.println("-------------------");
        //6. 输出空常量,  在Java中, 空常量不能直接输出, 会报错
        //System.out.println(null);
    }
}
