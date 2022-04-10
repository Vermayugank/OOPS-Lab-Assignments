package com.CSlab.assignment03;
public class Question4 {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.disp("Avinash Kumar", 2002055);
        s2.disp("Swaraj", 1506,"Gorakhpur",85);
        s3.disp("Navneet Chaudhary", 10035,"Uttar Pradesh",95);
    }
}
class Student{
    String name;
    int id;
    String address;
    int marks;
    Student(){
        this.name="Avinash Kumar";
        this.id=2002055;
        this.address="NIT Patna BIHAR";
        this.marks= 60;
    }
    void disp(String n, int id){
        this.name =n;
        this.id=id;
        System.out.printf("Name: %s \n ID: %d \n Address: %s \n Marks: %d \n",this.name,this.id,this.address,this.marks);
    }
    void disp(String n, int id,String a,int m){
        this.name =n;
        this.id=id;
        this.address=a;
        this.marks=m;
        System.out.printf(" \n Name: %s \n ID: %d \n Address: %s \n Marks: %d \n",this.name,this.id,this.address,this.marks);
    }
}
