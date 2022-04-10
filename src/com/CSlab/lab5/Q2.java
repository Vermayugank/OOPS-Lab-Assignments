package com.CSlab.lab5;
public class Q2{
	public static void main(String[] args){
		Program obj=new Program();
   		obj.displayinfo();
		obj.displayinfo(1);
	}
}
class Program{
 	void displayinfo(){
		System.out.println("This is main Program");
	}
	void displayinfo(int i){
		System.out.println("This is parametrized main program");
	}
}
class SubProgram extends Program{
 	void displayinfo(){
		System.out.println("This is sub group");
	}
}