package com.spring.biz;
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("싱글톤 패턴 연습 1 .");
        } else {
            System.out.println("싱글톤 패턴 연습 2.");
        }
        System.out.println("End.");
    }

}