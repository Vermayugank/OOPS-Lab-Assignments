package com.CSlab.assignment01;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args){
        int n1, n2, deno, nume,rem,hcf,lcm;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two numbers");
        n1 = sc.nextInt();
        n2 =sc.nextInt();
        nume = n1>n2?n1:n2;
        deno = n1<n2?n1:n2;
        rem =  nume% deno;
        while(rem !=0){
            nume= deno;
            deno = rem;
            rem = nume % deno;

        }
        hcf=  deno;
        lcm = (n1*n2)/hcf;
        System.out.printf("The HCF of %d and %d is %d \n",n1,n2,hcf);
        System.out.printf("The LCM of %d and %d is %d",n1,n2,lcm);
    }
}
