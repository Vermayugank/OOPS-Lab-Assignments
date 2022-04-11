package com.CSlab.lab07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter value of x");
            int x= sc.nextInt();
            System.out.println("Enter value of y");
            int y= sc.nextInt();
            System.out.println("THe value of x/y :"+x/y);
            int w =Integer.parseInt("Hello");
        }
        catch(ArithmeticException a){
            System.out.println("Invalid");
        }
        catch(InputMismatchException e){
            System.out.println("Format Mismatch");
        }
        finally {
            System.out.println("Program ended!! Please re-run.");
        }
    }
}
