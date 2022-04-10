package com.CSlab.assignment03;
import java.util.Scanner;
public class CheckLeap {
    public static void main(String[] args){
        System.out.println("Please enter year.");
        Scanner sc =new Scanner(System.in);
        int year = sc.nextInt();
        leapYear(year);
    }
    public static void leapYear(int x){
        boolean lp= false;
        if(x%4 ==0){
            lp=true;
            if (x % 100 == 0) {
                if(x%400==0)
                    lp= true;
                else lp=false;
            }
        }
        else lp = false;
        if(lp){
            System.out.println(x +" is a leap year");
        }
        else System.out.println(x+" is not a leap year");
    }
}
