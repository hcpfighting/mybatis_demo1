package com.atguigu.mybatis.test;

import org.junit.Test;

import java.util.function.Consumer;

public class lambda {
    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱天安门");
            }
        };
        r1.run();
        System.out.println("==========================");
        Runnable r2 = () -> System.out.println("我爱北京故宫");
        r2.run();
    }

    @Test
    public void test2() {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("111");
        System.out.println("==================================");
        Consumer<String> con1 = (String s) ->{
            System.out.println(s);
        };
        con1.accept("222");
    }

    @Test
    public void test3() {

        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("111");
        System.out.println("==================================");
        Consumer<String> con1 = (s) ->{
            System.out.println(s);
        };
        con1.accept("222");
    }



}
