package com.CSlab;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("The number entered is ZERO");
        }
        else {
            if (num > 0) {
                System.out.println("The number " + num + " is positive.");
            } else {
                System.out.println("The number " + num + " is negative.");
            }
        }
    }
}
