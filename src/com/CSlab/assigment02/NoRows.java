package com.CSlab.assigment02;

public class NoRows {
    public static void main(String[] args){
        int[][] arr ={{1,2,5,6,4},{1,5,7,8,9,5},{4,5,7}};
        int k = arr.length;
        System.out.println("The array is:");
        for(int i=0;i<k;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for(int s=0;s<k;s++) {
            System.out.printf("The length of %d row is %d \n",s,arr[s].length);
        }
    }
}
