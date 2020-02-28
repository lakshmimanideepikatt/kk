package com.newyeargift.newyeargift;

public class Chocolates extends Sweets{
	String typeOfChocolate;
	Chocolates(String name,int cost,int weight,String color,String typeOfChocolate){
		super(name,cost,weight,color);
		this.typeOfChocolate=typeOfChocolate;
	}
}
