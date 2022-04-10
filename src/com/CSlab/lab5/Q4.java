package com.CSlab.lab5;

public class Q4 {
    public static void main(String[] args){
        Details A= new Details();
        A.info("Yugank Verma");
        A.info("Yugank Verma",2002033);
    }
}
class Details{
    void info(String s){
        System.out.println("Name:"+s);
    }
    void info(String s, int r){
        System.out.println("Name:"+s+"\nRoll no:"+r);
    }
}

