package com.CSlab.lab3;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int s = sum(a,b,c);
        float w= avg(s);
        System.out.println("The sum of three numbers are "+s+" and average is"+w);

    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }

    static float avg(int x){
        return x/3;
    }
}
