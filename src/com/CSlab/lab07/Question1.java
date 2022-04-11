package com.CSlab.lab07;

public class Question1 {
    public static void main(String[] args) {
        int x =5;
        try {
            Integer y = Integer.valueOf(x);
            System.out.println(y);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
