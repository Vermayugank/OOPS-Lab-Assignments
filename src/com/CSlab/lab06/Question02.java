package com.CSlab.lab06;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Student obj1 = new Student(sc.nextInt());
        Student obj2 = new Student(sc.nextInt());
        Student obj3 = new Student(sc.nextInt());
        Student obj4 = new Student(sc.nextInt());
        Student obj5 = new Student(sc.nextInt());
        Student obj6 = new Student(sc.nextInt());
        Student obj7 = new Student(sc.nextInt());
        Student obj8 = new Student(sc.nextInt());
        Student obj9 = new Student(sc.nextInt());
        Student obj10 = new Student(sc.nextInt());
    }
}
class Student{
    final int roll_no;
    Student(int r){
        roll_no=r;
        System.out.println(roll_no);
    }
}
