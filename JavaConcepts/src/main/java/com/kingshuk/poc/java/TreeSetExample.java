package com.kingshuk.poc.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set animalSet=new TreeSet();
//		animalSet.add(new String("Tommy"));
//		animalSet.add(new String("Bonny"));
////		animalSet.add(new Integer(1234));
//		System.out.println("Printing animal set");
//		for(Object o:animalSet)
//			System.out.println(o+"");
//		
//		List<Dog> animalList=new ArrayList<Dog>();
		
//		ArrayList<Labrador> animalList2 =new ArrayList<Labrador>();
//        animalList.add(new Labrador());
//        
//        ArrayList<Cat> catList=new ArrayList<Cat>();
//        
//        System.out.println("Hello Lab"+animalList.get(0));
//        
//        new TreeSetExample().balerMethod(animalList);
		
	}
//	
//	public void balerMethod(List<? extends Dog> list){
//		list.add(new Labrador(""));
//		System.out.println("From method balerMethod");
//		System.out.println(list.get(0));
//		//list.add(new Ob);
//	}
//	

}

class Dog{
	
	private String name;
	
	public Dog(String name){
		this.name=name;
	}
	
	public String toString(){
		return ("Hi I am dog. My name is ");
	}
}

class Labrador extends Dog{
	public Labrador(){
		super("Parent Dog");
	}
	
	public String toString(){
		return "I am labrador";
	}
}

class Cat{
	
	private String name;
	
	public Cat(String name){
		this.name=name;
	}
	
	public String toString(){
		return ("Hi I am cat");
	}
}


