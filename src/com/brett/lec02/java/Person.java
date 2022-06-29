package com.brett.lec02.java;

import org.jet

public class Person {
    private final String name;

    public Person(String name){
        this.name=name;
    }

    @Nullable
    public String getName(){
        return name;
    }
}
