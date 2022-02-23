package com.spring.biz;
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {                                 
        System.out.println("싱글톤패턴 연습 3.");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
