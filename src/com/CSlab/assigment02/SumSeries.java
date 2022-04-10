package com.CSlab.assigment02;

import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args){
        double sum=0;
        System.out.println("Enter no of terms");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        SumSeries obj = new SumSeries();
        for(int i=1;i<=n;i++){
            sum=sum+(double) i/(obj.fact(i));}
        System.out.println("Sum of Series is :" +sum);
    }
    int fact(int x){
        int m=1;
        while(x>0){
            m*=x;
            x--;}
        return m;
    }
}
