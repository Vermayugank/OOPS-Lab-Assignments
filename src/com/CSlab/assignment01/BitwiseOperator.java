package com.CSlab.assignment01;

public class BitwiseOperator {
    public static void main(String[] args){
        int a = 5,b=8;
        System.out.println("Bitwise AND operation for a>2 & b>10 is " + (a>2 & b>10));
        System.out.println("Bitwise OR operation for a>2 & b>10 is " + (a>2 | b>10));
        System.out.println("Bitwise XOR operation for a>2 & b>10 is " + (a>2 ^ b>10));
        System.out.println("Bitwise LEFT SHIFT operation for a<<2 is " + (a<<2));
        System.out.println("Bitwise RIGHT SHIFT operation for a>>2 is " + (a>>2));
        System.out.println("Bitwise Zero fill right shift operation for a>>>2 is " + (a>>>2));
    }
}
