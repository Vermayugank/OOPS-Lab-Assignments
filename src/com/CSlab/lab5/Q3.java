package com.CSlab.lab5;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Triangle t =new Triangle();
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        System.out.println("Enter the Shape for area");
        Scanner sc = new Scanner(System.in);
        String sh = sc.nextLine();
        switch(sh){
            case "Triangle":
                t.area();
                break;
            case "Circle":
                c.area();
                break;
            case "Rectangle":
                r.area();
                break;
            default: System.out.println("Please enter correct shape");
        }

    }
}
class shapes{
    void area(){

    }
}
class Triangle extends shapes{
    void area(){
        System.out.println("The area of triangle is 1/2(length X Base)");
    }
}
class Circle extends shapes{
    void area(){
        System.out.println("The area of circle is 3.14 X radius X radius");
    }
}
class Rectangle extends shapes{
    void area(){
        System.out.println("The area of Rectangle is lenght X base");
    }
}