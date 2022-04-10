package com.CSlab.lab5;
public class Q1{
	public static void main(String[] args){
		parent P=new parent();
		child C=new child();
		P.show();
		C.show();
	}	
}

class parent{
	void show(){
		System.out.println("this is Parent class");
	}
}

class child extends parent{
	void show(){
		System.out.println("this is Child class");
		super.show();
	}
}
