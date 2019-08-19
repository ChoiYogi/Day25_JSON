package com.choi.regex;

import org.junit.Test;

public class MyRegex {
    public static void main(String[] args) {
        String str = "1234567890abcedfgh";
        str =str.replaceAll("[a-zA-Z]","1");
        System.out.println(str);
    }
    @Test
    public void test01(){
        String str = "1234567@126.cn";
        boolean b = str.matches("\\w++[@]\\w++[.][c]([n]|([o][m]))" );
        System.out.println(b);
    }
}
