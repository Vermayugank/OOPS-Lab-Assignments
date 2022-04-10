package com.CSlab.assigment02;

import java.util.Scanner;

public class Ques1pascal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of terms");
        int n =sc.nextInt();
        int num =1;
        for(int i=0;i<n;i++){
            for(int k=1;k<n-i;k++){
                System.out.print(" ");
            }
            num =1;
            for(int j=0;j<=i;j++){
                System.out.print(num +" ");
                num= num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
