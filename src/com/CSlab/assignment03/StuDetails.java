package com.CSlab.assignment03;

public class StuDetails {
    public static void main(String[] args){
        Student1 x = new Student1();
        Student1 xy= new Student1("2002055","Avinash Kumar",85);
    }
}
class Student1{
    String Name;
    String ID;
    int Marks;
    Student1(){
        System.out.println("Name: Unknown \n ID: N/A \n Marks: N/A");
    }
    Student1(String id,String n, int m){
        this.Name=n;
        this.ID=id;
        this.Marks=m;
        System.out.printf("Name: "+this.Name+"\n ID: "+this.ID+"\n Marks:" + this.Marks);
    }
}
