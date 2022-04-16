package com.CSlab.assignment07;

public class question2 {
    public static void main(String[] args) {
        Integer I = 5;                                                   //autoboxing
        String str = I.toString();
        System.out.println("After Autoboxing : String is "+str);
        int y = I;                                                       //unboxing
        System.out.println("After Unboxing : "+y);
    }
}
