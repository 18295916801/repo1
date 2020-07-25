package com.itheima.demo03_variable;

//案例: 用来演示Java中的数据类型的.
/*
    Java中数据类型的划分:
        基本数据类型(简称: 基本类型)    //四类八种
            整型:
                byte        1个字节, -128 到 127
                short       2个字节
                int         4个字节
                long        8个字节            10
            浮点型:
                float       4个字节
                double      8个字节            10.3
            字符型:
                char        2个字节
            布尔型:
                boolean     1个字节

        引用数据类型(简称: 引用类型)
            字符串类型:  String
            自定义的类
            自定义的接口
            数组

     记忆:
        1. byte的范围是-128到127, char的范围是: 0到65535
        2. 默认的整形是int, 默认的浮点型是double.
        3. 定义long类型值的时候, 值最后要加字母L(大小写均可)
        4. 定义float类型值的时候, 值最后要加字母F(大小写均可)
 */
public class VariableDemo02 {
    public static void main(String[] args) {
        //需求: 定义变量, 分别记录上述的8种基本类型数据, 并将变量值打印到控制台上.
        //1. byte
        //方式一: 直接初始化变量.
        //定义一个byte类型的变量, 变量名叫a, 初始化值为: 10
        byte a = 10;
        //方式: 先声明, 后赋值.
        //声明一个byte类型的变量, 变量名叫a2
        byte a2;     //声明
        //把20赋值给变量a2
        a2 = 20;    //赋值                    细节:  初始化 = 声明 + 赋值
        System.out.println(a);
        System.out.println(a2);
        System.out.println("------------");
        //2. short
        short s = 10;
        System.out.println(s);
        System.out.println("------------");
        //3. int
        int a3 = 20;
        System.out.println(a3);
        System.out.println("------------");
        //4. long
        long a4 = 10000000000L;
        System.out.println(a4);
        System.out.println("------------");
        //5. float
        float f = 10.3F;
        System.out.println(f);
        System.out.println("------------");
        //6. double
        double d = 20.1;
        System.out.println(d);
        System.out.println("------------");
        //7. char
        char ch = '女';
        System.out.println(ch);
        System.out.println("------------");
        //8. boolean
        boolean b = false;
        System.out.println(b);
    }
}
