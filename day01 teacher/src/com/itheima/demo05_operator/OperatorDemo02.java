package com.itheima.demo05_operator;

//案例: 演示自增自减运算符, 因为自减运算符的用法和自增类似, 所以这里用自增运算符举例.
/*
    自增运算符是(++), 运算规则如下:             //简单理解: a++ 相当于 a = a + 1
        场景1; 单独使用
            前加后加没有区别, 都是自身+1
        场景2: 参与操作
            前加: 先自身+1, 然后用新值参与运算.
            后加: 先以原值参与运算, 然后再自身+1
 */
public class OperatorDemo02 {
    public static void main(String[] args) {
        int a = 10;
        //单独使用
        //a++;        //后加
        //++a;          //前加

        //参与运算
        //后加: 先以原值参与运算, 然后再自身+1
        //int b = a++;    //b=10, a=11

        //前加: 先自身+1, 然后用新值参与运算.
        int b = ++a;        //a=11, b=11
        System.out.println(a);
        System.out.println(b);
        System.out.println("--------------------");

        //扩展: ++ 和 --其实都隐含了 强制类型转换
        byte b1 = 127;
        //byte b2 = b1 + 4;       //报错

        //b1 = (byte)(b1 + 1);    //不报错
        //上边的代码可以简写为
        b1++;       //等价于:  b1 = (byte)(b1 + 1)
        System.out.println(b1);     //-128


        /*System.out.println((byte)128);      //-128
        System.out.println((byte)129);      //-127
        System.out.println((byte)130);      //-126
        System.out.println((byte)131);      //-125
        System.out.println((byte)132);      //-124*/
    }
}
