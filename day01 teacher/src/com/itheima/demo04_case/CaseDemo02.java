package com.itheima.demo04_case;

//案例: 演示强制类型转换.
//规则: 取值范围大的数据, 赋值给 取值范围小的数据, 需要通过特定的格式实现.
//格式: 数据类型 变量名 = (目标数据类型)初始化值;
public class CaseDemo02 {
    public static void main(String[] args) {
        double d = 10;
        System.out.println(d);

        int a = (int)d;         //标准写法
        System.out.println(a);

        //int aa = (int)"张三";    //报错, 类型不兼容.
        System.out.println("------------------------");

        //byte, short, char -> int -> long -> float -> double
        //默认的整形是int
        short s = 11;
        System.out.println(s);    //11
        s = (short)(s + 3);      //结果是int类型的数据, 这样写, 会报错.
        System.out.println(s);
        System.out.println("------------------------");


        double dd = 1.5;
        int a3 = (int)dd;
        System.out.println(a3);

    }
}
