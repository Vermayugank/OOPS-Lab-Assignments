package com.CSlab.assignment05;

public class Question3 {
    public static void main(String[] args){
        vehicle car= new BMWXseries();
        car.details();
    }
}
class vehicle{
    void details(){
        System.out.println("There are many companies like BMW,Audi,Ferrari");
    }
}

class BMW extends vehicle{
    void details(){
        super.details();
        System.out.println("BMW was founded in 1916");

    }
}
class BMWXseries extends BMW{
    void details(){
        super.details();
        System.out.println("BMW X series was started in 1999");

    }
}