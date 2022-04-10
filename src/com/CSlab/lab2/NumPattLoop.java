package com.CSlab.lab2;

import java.util.Scanner;

public class NumPattLoop {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no terms");
        int n =sc.nextInt();
        int a= 100;
        System.out.println("Using for loop");
        for(int i=1 ;i<=n;i++){
            System.out.println(a*=2);
        }
        System.out.println("Using while loop");
        int i =0 ,b=100;
        while(i<n){
            System.out.println(b*=2);
            i++;
        }
        System.out.println("Using Do-while loop");
        int j =0 ,c=100;
        do{
            System.out.println(c*=2);
            j++;
        }while(i<n);
    }
}
