package com.CSlab.assignment03;

import java.util.Scanner;
class patient{
    String name,gender,bloodgroup,condition,treatment;
    int age,bloodReq,treatmentCost,rate;
    float discount;
    void patientDetails(String n,int a,String g,String bg,String c){
        name=n;
        age =a;
        gender=g;
        bloodgroup=bg;
        condition =c;
    }
    void showPatient(patient p){
        System.out.println("DETAILS of patient are");
        System.out.printf("NAME: %s \n AGE: %d \n GENDER: %s \n BLOOD GROUP: %s \n CONDITION: %s \n",name,age,gender,bloodgroup,condition);
    }
    void bloodNeed(patient p, boolean m, int r){
        if(m==true){
            p.bloodReq=r;
            switch (p.bloodgroup){
                case("A"): p.rate=200;
                    break;
                case("B"): p.rate=250;
                    break;
                case("AB"): p.rate=350;
                    break;
                case("O+"): p.rate=500;
                    break;
                case("O-"): p.rate=650;
                    break;
                default: System.out.println("Please enter correct blood group");
            }
        }
    }
    void treatment(patient p, String t){
        p.treatment= t;
        switch (p.treatment){
            case("Surgery"): p.treatmentCost=15000;
                break;
            case("Physio"): p.treatmentCost=700;
                break;
            case("Therapy"): p.treatmentCost=1000;
                break;
            case("Allopathy"): p.treatmentCost=400;
                break;
            case("Homeaopathy"): p.treatmentCost=150;
                break;
            default: System.out.println("Please enter correct treatment type.");
        }
    }
    void discount(patient p){
        if(p.age>60) p.discount=20;
    }
    void showBill(patient p){
        double totalBill= p.treatmentCost*(100-p.discount)/100;
        totalBill +=p.rate*p.bloodReq;
        System.out.printf("\n Cost of treatment: %d \n Cost of blood: %d \n Discount: %f",treatmentCost,(p.rate*p.bloodReq),p.discount);
        System.out.println("\n Total Bill: " +totalBill);
    }
}
public class Hospital {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        patient p1=new patient();
        System.out.print("Name: ");
        String name= sc.nextLine();
        System.out.print("Age: ");
        int age= sc1.nextInt();
        System.out.print("Gender: ");
        String gender= sc.nextLine();
        System.out.print("Blood Group: ");
        String bloodgroup= sc.nextLine();
        System.out.print("Condition: ");
        String condition= sc.nextLine();
        System.out.print("Treatment Required: ");
        String treatment= sc.nextLine();
        System.out.print("Is blood required: ");
        Boolean bloodReq = sc.nextBoolean();
        int quan;
        if(bloodReq==true){
            System.out.println("Enter the quantity in unit");
            quan = sc1.nextInt();
        }
        else quan=0;

        p1.patientDetails(name,age,gender,bloodgroup,condition);
        p1.showPatient(p1);
        p1.bloodNeed(p1,bloodReq,quan);
        p1.treatment(p1,treatment);
        p1.discount(p1);
        p1.showBill(p1);
    }
}
