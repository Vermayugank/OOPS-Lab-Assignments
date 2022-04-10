package com.CSlab.lab4;
class parent {
    void display(){
        System.out.println("Father's name is ABC");
    }
}

class child1 extends parent{
    void display(){
        System.out.println("My name is XYZ1");
        super.display();
    }
}
class child2 extends parent {
    void display() {
        System.out.println("My name is XYZ2");
        super.display();
    }
}
public class question2 {
    public static void main(String[] args){
    parent A = new parent();
    child1 B = new child1();
    child2 C = new child2();
    B.display();
    C.display();
    }
}
