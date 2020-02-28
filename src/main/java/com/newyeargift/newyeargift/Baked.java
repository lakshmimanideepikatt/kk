package com.newyeargift.newyeargift;

public class Baked extends Sweets{
	String typeOfBakedFood;
	Baked(String name,int cost,int weight,String color,String typeOfBakedFood){
		super(name,cost,weight,color);
		this.typeOfBakedFood=typeOfBakedFood;
	}
}
