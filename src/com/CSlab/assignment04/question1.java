package com.CSlab.assignment04;

public class question1 {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.disp("Yugank Verma", 2002033);
        s2.disp("Anurag Yadav", 1506,"Gorakhpur",85);
        s3.disp("Shivam Chaudhary", 10035,"Uttar Pradesh",95);
    }
}
class Student{
    String name;
    int id;
    String address;
    int marks;
    Student(){
        name= "Unknown";
        id= 0;
        address="Unknown";
        marks=0;
    }
    void disp(String n,int i,String ad,int m){
        name=n;
        id = i;
        address=ad;
        marks=m;
        System.out.printf("Name: %s \n Id: %d \n Address: %s \n Marks: %d \n",name,id,address,marks);
    }
    void disp(String n,int i){
        name=n;
        id=i;
        System.out.printf("Name: %s \n Id: %d \n Address: %s \n Marks: %d \n",name,id,address,marks);
    }
}
