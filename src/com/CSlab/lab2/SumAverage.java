package com.CSlab.lab2;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int sum =0;
        float avg=0;
        int num[] = new int[10];
        for(int i=0;i<10;i++){
            num[i]= sc.nextInt();
        }
        for(int i=0;i<10;i++){
            sum = sum + num[i];
        }
        System.out.printf("The sum of entered numbers are %d and Average is %d",sum,sum/10);

    }
}
