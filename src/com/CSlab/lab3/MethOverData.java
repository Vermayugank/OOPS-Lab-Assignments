package com.CSlab.lab3;

import java.util.Scanner;

public class MethOverData {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the parameters of figure.");
        float r=sc.nextFloat();
        area((int)r);
        area(r);

    }
    static void area(int ra){
        double a = ra*ra;
        System.out.println("the area with float return is "+ (float)a);

    }
    static void area(float ra){
        double a = ra*ra;
        System.out.println("the area with float return is "+ (float)a);
    }
    }

