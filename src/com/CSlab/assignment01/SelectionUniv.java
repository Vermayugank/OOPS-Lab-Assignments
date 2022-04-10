package com.CSlab.assignment01;

import java.util.Scanner;

public class SelectionUniv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage of GRE");
        int gre = sc.nextInt();
        System.out.println("Enter your percentage of TOEFL");
        int toefl = sc.nextInt();
        if(gre>70){
            String uni = "University : OXFORD University Department: ";
            if(toefl==70) System.out.println(uni + "Computer Sc. & Engg.");
            else if(toefl==60) System.out.println(uni + "Electronic Engg.");
            else if(toefl==50) System.out.println(uni + "Electrical Engg");
        }
        else if(toefl == 50){
            String uni = "University : MIT Department: ";
            if(gre<=70 && gre>=60) System.out.println(uni + "Computer Sc. & Engg.");
            else if(gre<=59 && gre>50) System.out.println(uni + "Chemical Engg.");
            else if(gre==50) System.out.println(uni + "Civil Engg.");
        }
    }
}
