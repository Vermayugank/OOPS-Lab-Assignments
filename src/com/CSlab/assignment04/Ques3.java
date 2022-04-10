package com.CSlab.assignment04;
import java .util.Scanner;

class Employee{
    int salary;
    void printSalary(int s) {
        salary = s;
        System.out.println("EMPLOYEE'S SALARY :₹ " + salary);
    }
}

class Manager extends Employee{
    void printSalary(int s) {
        salary = s;
        System.out.println("MANAGER'S SALARY:₹ " + (salary+1000));
        super.printSalary(s);
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("ENTER SALARY OF EMPLOYEE:₹ ");
        int s = sc.nextInt();
        sc.close();
        Manager obj = new Manager();
        obj.printSalary(s);
    }

}
