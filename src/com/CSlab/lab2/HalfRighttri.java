package com.CSlab.lab2;

public class HalfRighttri {
    public static void main(String[] args){
        for(int i=5;i>0;i-=2){
            for(int j=5-i ;j<5;j++){
                System.out.print(" ");
            }
            for(int k = i;k<=5;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
