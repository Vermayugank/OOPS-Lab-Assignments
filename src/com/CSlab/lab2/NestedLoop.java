package com.CSlab.lab2;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args){
        System.out.println("Enter number of columns and rows");
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int rows = sc.nextInt();
        int k = 9;
        for(int i =0;i<rows;i++){
            for(int j= 0;j<col;j++){
                System.out.printf("%d ",k+=2);
            }
            System.out.println();
        }
    }
}
