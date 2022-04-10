package com.CSlab.assigment02;

public class MatrixOperations {
    public static void main(String[] args){
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int c =1,c1=9;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=c++;
                arr2[i][j]=c1--;
            }
        }
        int[][] addmat=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                addmat[i][j] +=arr1[i][j]+arr2[i][j];
            }
        }
        int[][] submat=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                submat[i][j] +=arr1[i][j]-arr2[i][j];
            }
        }
        int[][] mutmat=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++) {
                    mutmat[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        int[][] transpose=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                transpose[i][j]=arr1[j][i];
            }
        }
        System.out.println("First Array is:");
        matPrint(arr1);
        System.out.println("Second Array is:");
        matPrint(arr2);
        System.out.println("Transpose of First Array is:");
        matPrint(transpose);
        System.out.println("Addition of Array is");
        matPrint(addmat);
        System.out.println("Subtraction of Array is");
        matPrint(submat);
        System.out.println("Multiplication of Array is");
        matPrint(mutmat);
    }
    static void matPrint(int[][] x){
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }

}
