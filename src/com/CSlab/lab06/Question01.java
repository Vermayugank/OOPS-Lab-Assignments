package com.CSlab.lab06;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x= sc.nextDouble();
        Car obj = new Car(x);
        obj.print();
    }
}
class Car{
    final double speed;
    Car(double a){
        speed=a;
    }
    void print(){
        System.out.println("THe speed of car is "+speed +"KM/hr");
    }
}
