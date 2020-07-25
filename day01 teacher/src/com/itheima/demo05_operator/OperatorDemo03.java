package com.itheima.demo05_operator;

/*
    案例: 演示赋值运算符.

    分类:
        基本的赋值运算符:
            =
        扩展的赋值运算符;
            +=, -=, *=, /=, %=
        例如:
            +=的意思是, 把左边和右边的数据相加, 结果赋值给左边.
        细节:
            1. 赋值运算符的左边不能是常量.
            2. 扩展的赋值运算符默认包含了 强制类型转换.
 */
public class OperatorDemo03 {
    public static void main(String[] args) {
        //基本的赋值运算符,  把常量10赋值给 int类型的变量a
        int a = 10;
        System.out.println(a);
        System.out.println("------------");

        int b = 20;
        b += a;     //等价于 b = (int)(b + a)
        System.out.println(b);
        System.out.println("------------");

        byte b1 = 3;
        //b1++;   //等价于: b1 += 1
        b1 += 1;
        System.out.println(b1);
    }
}
