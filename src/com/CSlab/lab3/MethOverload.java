package com.CSlab.lab3;

import java.util.Scanner;

public class MethOverload {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the parameters of figure.");
            int r=sc.nextInt();
            int r1 = sc.nextInt();
            area(r);
            area(r,r1);
        }
        static void area(float ra){
            double a = ra*ra;
            System.out.println("It is a square and its area is "+ (float)a);
        }
        static void area(float ra,float rb){
            double a = ra*rb;
            System.out.println("It is a rectangle and its area is "+ (float)a);
        }
}

