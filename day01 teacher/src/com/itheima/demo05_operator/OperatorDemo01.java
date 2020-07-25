package com.itheima.demo05_operator;

//案例: 演示算术运算符
/*
    概述:
        用来进行算术操作的符号.
    分类:
        +, -, *, /, %, ++, --
    注意事项:
        1. Java中整数相除结果还是整数, 要想获取小数, 必须有浮点型参与.
        2. 关于+号
            如果是数字相加:    就是加法运算.
            如果是字符串相加:  就是拼接字符串, 会获取到一个新的字符串.
                //细节: 任何数据和字符串拼接, 结果都将是一个新的字符串.
 */
public class OperatorDemo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        //System.out.println(10 + 3);
        System.out.println(a + b);      //13
        System.out.println(a - b);      //7
        System.out.println(a * b);      //30
        System.out.println(a / b);      //3
        System.out.println(a % b);      //1
        System.out.println("---------------");

        //要想获取小数, 必须有浮点型参与.
        System.out.println(10 / 3.0);
        System.out.println("---------------");

        //如果是字符串相加:  就是拼接字符串, 会获取到一个新的字符串.
        System.out.println("hello" + 5 + 5);    //"hello55"
        System.out.println("hello" + (5 + 5));  //hello10

        //代码是按照: 从上往下, 从左往右的顺序依次逐行执行的.
        System.out.println(5 + 5 + "hello" + 5 + 5);  //10hello55
    }
}
