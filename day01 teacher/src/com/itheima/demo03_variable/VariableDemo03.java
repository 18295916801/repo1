package com.itheima.demo03_variable;

//案例: 演示变量的注意事项
/*
    注意事项:
        1.变量未赋值，不能使用.
        2.变量只在它所属的范围内有效.
        3.一行上可以定义多个变量，但是不建议.
 */
public class VariableDemo03 {
    public static void main(String[] args) {
        //演示  变量未赋值，不能使用.
        /*int a;
        System.out.println(a);      //这样写会报错. */

        //演示 变量只在它所属的范围内有效.
        {
            int abc = 10;
            System.out.println(abc);    //这样写不报错
        }   //这行代码执行结束后, abc就从内存中消失了.
        //System.out.println(abc);    //这样写报错

        //演示 一行上可以定义多个变量，但是不建议.
        int a = 10, b = 20, c = 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
