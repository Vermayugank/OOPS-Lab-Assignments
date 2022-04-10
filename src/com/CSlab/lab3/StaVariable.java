package com.CSlab.lab3;

public class StaVariable {
    static int x = 1;
    public static void main(String[] args){
        System.out.println("The value of x is 1 initially. ");
        StaVariable o1= new StaVariable();
        StaVariable o2= new StaVariable();
        StaVariable o3= new StaVariable();
        o1.counter();
        o2.counter();
        o3.counter();
    }
    void counter(){
        x++;
        display();
    }
    static void display(){
        System.out.println("The value of x "+x);
    }
}
