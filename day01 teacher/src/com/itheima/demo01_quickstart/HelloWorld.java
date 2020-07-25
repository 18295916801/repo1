package com.itheima.demo01_quickstart;

/*
    注释的解释:
        概述:
            就是用来对程序进行解释和说明的文字, 给程序员看的, 在程序执行的时候, 不会被执行.
        分类:
            单行注释
            多行注释
            文档注释
 */

//这是在定义一个类, 类名叫: HelloWorld
public class HelloWorld {
    /*
        这是main方法, 它是程序的主入口,
        所有的代码都是从这里开始执行的.
     */
    public static void main(String[] args) {
        //这个是输出语句, 里边的内容会被打印到控制台上.
        int a = 10;
        int b = 10;
        System.out.println("输出结果"+(a+b));
        System.out.println("Hello World!1");
        System.out.println("Hello World!2");
        System.out.println("Hello World!3");

    }
}
