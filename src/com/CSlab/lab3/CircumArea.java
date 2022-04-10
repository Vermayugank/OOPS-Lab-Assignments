package com.CSlab.lab3;

import java.util.Scanner;

public class CircumArea {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int r=sc.nextInt();
        area(r);
        circum(r);
    }
    static void area(float ra){
        double a = 3.14 * ra * ra;
        System.out.println("The area of circle is "+ (float)a);
    }
    static void circum(float ra){
        double a = 3.14 * 2 * ra;
        System.out.println("The area of circle is "+ (float)a);
    }
}
