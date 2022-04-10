package com.CSlab.assignment01;

import java.util.Scanner;

public class max3number {
    public static void main(String[] args){
        System.out.println("Enter three numbers");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = (a>b && a>c)?a:(b>c)?b:c;
        System.out.println("The max of three number is " + ans);
    }
}
