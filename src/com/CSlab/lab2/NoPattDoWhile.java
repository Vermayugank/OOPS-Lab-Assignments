package com.CSlab.lab2;

import java.util.Scanner;

public class NoPattDoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns");
        int row = sc.nextInt();
        int col =sc.nextInt();
        int i = 0;
        do{
            for(int j =0;j<i;j++){
                System.out.print(i+ " " );
            }
            System.out.println();
            i++;
        }while(i<row);
    }
}
