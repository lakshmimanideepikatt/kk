package com.newyeargift.newyeargift;
import java.util.*;
public class Sweets {
	String color;
	public String name;
	int cost;
	int weight;
	Sweets(String name,int cost,int weight,String color){
		this.name=name;
		this.cost=cost;
		this.weight=weight;
		this.color=color;
	}
}
class SortByWeights implements Comparator<Sweets>{
	public int compare(Sweets first,Sweets second) {
		if(first.weight!=second.weight)
		return first.weight-second.weight;
		return first.cost-second.cost;
	}
}
class SortByCost implements Comparator<Sweets>{
	public int compare(Sweets first,Sweets second) {
		if(first.cost!=second.cost)
		return first.cost-second.cost;
		return second.weight-first.weight;
	}
}