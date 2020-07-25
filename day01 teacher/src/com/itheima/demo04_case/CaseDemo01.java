package com.itheima.demo04_case;

//案例: 演示自动类型转换, 也叫: 隐式类型转换.
//格式: 无特殊格式, 直接写即可.
//规则: 范围小的数据 可以自动转成 范围大的数据, 前提: 类型要兼容.
public class CaseDemo01 {
    public static void main(String[] args) {
        //1.定义两个int类型的变量a和b, 分别赋值为10, 20.
        int a = 10;
        int b = 20;
        //2.通过输出语句打印变量a和b的和.
        System.out.println(a + b);
        //3.定义int类型的变量c, 接收变量a和b的和.
        int c = a + b;
        //4.打印变量c的值.
        System.out.println(c);
        System.out.println("--------------------");
        //提示: byte的范围 < int类型的范围
        //5.定义两个变量aa和bb, 一个是int类型的数据, 另一个是byte类型的数据.
        int aa = 11;
        byte bb = 22;
        //6.定义变量cc接收 变量aa和bb的和.
        //7.分别设置变量cc的数据类型为byte类型和int类型, 观察结果并打印.
        int cc = aa + bb;     //不报错.
        //       4个字节    +       4个字节
        //byte cc = aa         +      bb;     //报错.
        System.out.println(cc);
        System.out.println("--------------------");

        char a2 = 'a' + 1;
        System.out.println(a2);
        System.out.println("--------------------");

        //System.out.println(false + 1);  报错, 类型不兼容.

    }
}
