package com.CSlab.lab3;

public class SoD {
    public SoD(int x){
        int s=0;
        while(x !=0){
            int r=x%10;
            s+=r;
            x=x/10;
        }
        System.out.println("The sum of digits is "+ s);
    }
    public SoD(){
        System.out.println("This constructor is not parameterized");
    }
    public static void main(String[] args){
        SoD o1 = new SoD();
        SoD o =new SoD(1234);
    }
}
