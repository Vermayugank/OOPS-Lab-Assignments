package com.CSlab.lab4;

public class question3 {
    public static void main(String[] args){
        A obj = new A();
        B obj1 = new B();
        obj.display("Yugank Verma",2002033);
        obj.display("Anurag Yadav",22112);
    }
}
class A{
    String name;
    int rollno;
    void display(String n,int r){
        this.name=n;
        this.rollno=r;
        System.out.println("NAME: "+name+"\n Roll no:"+rollno);
    }
}
class B{
    String name;
    int rollno;
    void display(String n, int r){
        name= n;
        rollno=r;
        System.out.println("NAME:"+name+"\n Roll no"+rollno);
    }
}
