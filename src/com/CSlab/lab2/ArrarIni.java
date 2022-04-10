package com.CSlab.lab2;

public class ArrarIni {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int sum = 0;
        float avg=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.printf("The sum of elements of array is %d and average is %d",sum,sum/arr.length);
    }
}
