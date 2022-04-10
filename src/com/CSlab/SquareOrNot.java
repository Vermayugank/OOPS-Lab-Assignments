package com.CSlab;

import java.util.Scanner;

public class SquareOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length");
        float length = sc.nextFloat();
        System.out.println("Please enter breadth");
        float breadth = sc.nextFloat();
        if(length == breadth){
            System.out.println("Your measured surface is a Square");
        }
        else{
            System.out.println("Your measured surface is not a Square");
        }
    }
}
