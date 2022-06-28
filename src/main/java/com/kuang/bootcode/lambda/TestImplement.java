package com.kuang.bootcode.lambda;

import java.util.Arrays;
import java.util.List;

public class TestImplement   {
    public void test1(TestInterface test){
        System.out.println(test.sum("1",2));
    }


    public static void main(String[] args) {
        Runnable a = ()-> System.out.println("test Runnable run");

        new Thread(a).start();
    }
}
