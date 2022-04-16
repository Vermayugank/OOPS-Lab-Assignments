package com.CSlab.assignment07;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) throws User_Exp{
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y=sc.nextInt();
        try {
            if (x == y) throw new User_Exp();
            else greater(x, y);
        }
        catch (User_Exp u){
            System.out.println("Please re-run the program");
        }
    }
    static void greater(int a,int b){
        if (a>b) System.out.println(a+" is greater than "+b);
        else System.out.println(b+" is greater than "+a);
    }
}
class User_Exp extends Exception{
    User_Exp(){
        System.out.println("Please enter two different numbers");
    }

}
