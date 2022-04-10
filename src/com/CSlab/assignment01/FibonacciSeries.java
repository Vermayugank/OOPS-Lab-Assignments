package com.CSlab.assignment01;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = sc.nextInt();
        int ft=0;
        int st =1;
        System.out.println("Fibonacci series till " + n + "is :");
        for(int i=1;i<=n;i++){
            System.out.print(ft +", ");
            int nt = ft +st;
            ft= st;
            st = nt;
        }
    }
}
