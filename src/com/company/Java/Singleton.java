package com.company.Java;

public class Singleton {
    public String str;

    private static final Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getSingleInstance() {
        return singleton;
    }
}
