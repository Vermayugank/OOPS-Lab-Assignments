package com.CSlab;
import java.util.Scanner;
public class GradingChecking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int grade  =  sc.nextInt();
        if(grade < 100 && grade >=90){
            System.out.println("You have got A+ grade");
        }
        else if(grade < 90 && grade >=80){
            System.out.println("You have got A grade");
        }
        else if(grade < 80 && grade >=70){
            System.out.println("You have got B grade");
        }
        else if(grade < 70 && grade >=60){
            System.out.println("You have got C grade");
        }
        else if(grade < 60 && grade >=50){
            System.out.println("You have got D grade");
        }
        else if(grade < 50){
            System.out.println("Sorry! Failed ");
        }
        else{
            System.out.println("Invalid Input. Please enter between 0 - 100");
        }
    }
}
