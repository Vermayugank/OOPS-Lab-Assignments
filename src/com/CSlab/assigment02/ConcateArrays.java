package com.CSlab.assigment02;

public class ConcateArrays {
    public static void main(String[] args){
        int[] arr1 ={1,2,3};
        int[] arr2 ={4,5,6,7,8,9};
        int len = arr1.length + arr2.length;
        int count =0;
        int[] conarr = new int[len];
        System.out.println("Array 1 is :");
        for(int x:arr1){
            System.out.print(x +" ");
            conarr[count] = x;
            count++;
        }
        System.out.println();
        System.out.println("Array 2 is :");
        for(int y:arr2){
            System.out.print(y +" ");
            conarr[count] = y;
            count++;
        }
        System.out.println();
        System.out.println("The concatenated result is :");
        for(int w : conarr){
            System.out.print(w+" ");
        }
    }
}
