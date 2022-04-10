package com.CSlab.lab06;

public class Question05 {
    public static void main(String[] args){
        Rectangle rect =new Rectangle();
        Circle cir = new Circle();
        rect.area();
        cir.area();
    }
}
interface Drawable{
    void area();
}
class Rectangle implements Drawable{
    public void area(){
        System.out.println("The area of rectangle is length X breadth");
    }
}
class Circle implements Drawable{
    public void area(){
        System.out.println("The area of circle is 3.14 X radius X radius");
    }
}
