package com.itheima.demo04_case;

//需求: 演示ASCII码表, 目前先了解.
//ASCII码表: 就是用来描述字符 及其 对应的数字之间的关系的.
/*
    记忆, 常用字符对应关系如下
        'a'      97
        'A'      65
        '0'      48
 */
public class ASCIIDemo04 {
    public static void main(String[] args) {
        System.out.println('c' + 0);
        System.out.println('A' + 0);
        System.out.println('0' + 0);
        System.out.println('夯' + 0);

        int a = 22831;
        char ch = (char)a;
        System.out.println(ch);
    }
}
