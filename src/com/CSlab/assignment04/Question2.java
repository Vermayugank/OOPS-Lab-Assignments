package com.CSlab.assignment04;

public class Question2 {
    int a =5;
    Question2(){
        A obj =new A(this);
    }
    void display(){
        System.out.println("Value of x in Class Question:"+a);
    }
    public static void main(String[] args){
        Test object = new Test();
        object.get().display();
        object.gett();
        Question2 obj = new Question2();
    }
}
class Test{
    int x,y;
    Test(){
        this(1,2);
        System.out.println("Inside no argument constructor ");
    }
    Test(int x,int y){
        this.x= x;
        this.y=y;
        System.out.println("Inside parameterized constructor");
    }
    Test get(){
        return this;
    }
    void display(){
        System.out.println("x= "+ x+" y="+y);
        this.show();
        System.out.println("Inside display function");
    }
    void show(){
        System.out.println("Inside show function");
    }
    void display(Test obj){
        System.out.println("x= "+obj.x+" y="+obj.y);
    }
    void gett(){
        display(this);
    }
}
class A{
    Question2 obj;
    A(Question2 obj){
        this.obj = obj;
        obj.display();
    }
}

