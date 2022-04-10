package com.CSlab.lab2;

import java.util.Scanner;

public class NoPatt {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        for(int i = 0;i<rows;i++){
            for(int j= i-1;j>=0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
