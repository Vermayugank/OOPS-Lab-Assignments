package com.CSlab.assigment02;

import java.util.Scanner;

public class Ques1Star {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        for(int i=rows;i>=1;i--){

            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
