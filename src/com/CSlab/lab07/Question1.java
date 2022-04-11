package com.CSlab.lab07;

public class Question1 {
    public static void main(String[] args) {
        try {
            int x =5;
            Integer y = Integer.valueOf(x);
            Integer w = x;     //autoboxing
            System.out.println("Initial value :"+x+" Value after autoboxing :"+w);
            boolean b = true;
            Boolean B= Boolean.valueOf(b);
            Boolean B1 = b;
            System.out.println("Initial value :"+b+" Value after autoboxing :"+B1);
            float f = 10.00f;
            Float F = Float.valueOf(f);
            Float F1= f;
            System.out.println("Initial value :"+f+" Value after autoboxing :"+F1);
            long l= 515336;
            Long L = Long.valueOf(l);
            Long L1= l;
            System.out.println("Initial value :"+l+" Value after autoboxing :"+L1);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
