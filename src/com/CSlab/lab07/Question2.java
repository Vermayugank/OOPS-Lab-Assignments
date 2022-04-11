package com.CSlab.lab07;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x");
        int x= sc.nextInt();
        System.out.println("Enter value of y");
        int y = sc.nextInt();
        try{
            System.out.println(x/y);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
