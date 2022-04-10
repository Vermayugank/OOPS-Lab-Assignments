package com.CSlab.assignment05;

public class Question2 {
    public static void main(String[] args){
       Area area=new Area();
       Perimeter peri=new Perimeter();
       area.printarea();
       peri.printperi();
    }
}
class Rectangle{
    protected float height=5.35f;
    protected float width=8.36f;
}
class Area extends Rectangle{
    void printarea() {
        float a = height * width;
        System.out.println("The area of rectangle is "+a);
    }
}
class Perimeter extends Rectangle{
    float p= 2*(height+width);
    void printperi(){
        System.out.println("The perimeter of rectangle is "+p);
    }
}