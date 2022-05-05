package com.CSlab.lab08;

import java.io.*;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) throws IOException {
        File f= new File("D:\\nit patna classes\\4 sem\\CS Lab\\src\\com\\CSlab\\lab08\\New File.txt");
        FileWriter fo = new FileWriter(f);
        String str = "This is my first my file handeling";
        char[] ch= str.toCharArray();
        for(int i=0;i<ch.length;i++){
            fo.write(ch[i]);
        }
        fo.close();
//        FileReader fi =new FileReader(f);
//        int j = fi.read();
//        while(j !=-1)
//            System.out.print((char)j);
//        fi.close();

        Scanner myReader = new Scanner(f);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();


    }
}
