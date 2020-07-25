package com.itheima.demo04_case;

//扩展: 变量和常量的运算规则
public class CaseDemo03 {
    public static void main(String[] args) {
        /*
            Java中针对于常量, 有常量优化机制:
                针对于byte类型:
                    常量相加: 会直接运算, 然后看结果在不在左边的数据类型范围内, 在不报错, 不在就报错.
                    变量相加: 会自动提升数据类型, 然后在运算, 提升规则:
                              byte, short, char -> int -> long -> float -> double
                针对于String类型
                    后边API解释.
         */
        byte b1 = 3;
        byte b2 = 4;
        byte b3 = 3 + 4;                //不报错.
        //byte b4 = b1 + b2;            //报错
        byte b4 = (byte)(b1 + b2);      //不报错

        //byte b5 = b1 + 4;               //报错, 变量和常量运算, 按照变量的规则走.
    }
}
