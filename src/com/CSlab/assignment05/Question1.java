package com.CSlab.assignment05;

public class Question1 {
    public static void main(String[] args){
        Employee E =new Employee();
        Manager M =new Manager();
        E.name="Anurag Yadav";
        E.age=20;
        E.phone_no=455932;
        E.address="GKP UP";
        E.salary=120000;
        M.name="Yugank Verma";
        M.age=20;
        M.phone_no=521265;
        M.address="NIT Patna,Bihar";
        M.salary=150000;
        E.details();
        M.details();
    }
}

class Member{
    String name,address;
    int age,phone_no,salary;
    void printSalary(){
        System.out.println("The salary is "+salary);
    }
    void details(){
        System.out.printf("Name:%s \n Age:%d\n Phone Number:%d\n Address:%s\n",name,age,phone_no,address);
        printSalary();
    }
}
class Employee extends Member{
    String speci;
}
class Manager extends Member{
    String dept;

}
