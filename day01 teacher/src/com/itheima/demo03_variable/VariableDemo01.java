package com.itheima.demo03_variable;

//自定义一个类, 类名叫: VariableDemo01, 用来演示: 变量的入门案例的.
public class VariableDemo01 {
    //定义main方法, 作为程序的主入口.
    public static void main(String[] args) {
        //需求: 定义变量, 记录班级的学生人数, 并将结果打印到控制台上.
        /*
            前奏知识:
                1. 变量的格式
                    数据类型 变量名 = 初始化值;
                2. 变量的格式解释:
                    数据类型: 用来限定变量的值的变化范围的.
                    变量名:   方便我们快速获取和操作变量的.
                    初始化值: 可以理解为变量 = 内存中的一块空间, 而初始化值就是放到该空间中的值.
         */

        //1. 定义一个int类型的变量, 变量名叫: personNumber, 用来表示班级的初始化人数.
        int personNumber = 35;

        //2. 修改班级人数
       personNumber = 1000;

        //3. 输出结果
        System.out.println("personNumber");  //输出结果是; 字符串常量值.
        System.out.println(personNumber);   //输出结果是: int类型的变量值
    }
}
