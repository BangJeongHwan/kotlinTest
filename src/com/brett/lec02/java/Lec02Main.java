package com.brett.lec02.java;

public class Lec02Main {
    public static void main(String[] args) {
        System.out.println("hello java");
    }

    // return Type이 boolean
    public boolean startsWithA1(String str){
        if(str==null){
            throw new IllegalArgumentException("null이 들어왔습니다.");
        }
        return str.startsWith("A");
    }

    // return Type이 Boolean
    public Boolean startsWithA2(String str){
        if(str==null){
            return null;
        }
        return str.startsWith("A");
    }

    // return Type이 boolean
    public boolean startsWithA3(String str){
        if(str==null){
            return false;
        }
        return str.startsWith("A");
    }
}
