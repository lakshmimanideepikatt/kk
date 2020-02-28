package com.newyeargift.newyeargift;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        List<Sweets>listOfSweets=new ArrayList<Sweets>();
        listOfSweets.add(new Chocolates("MilkyBar",10,40,"white","Nococoa"));
        listOfSweets.add(new Chocolates("DairyMilk",50,100,"chocoBrown","partial"));
        listOfSweets.add(new Chocolates("5Star",5,20,"brown","Caramel&Stuffed"));
        listOfSweets.add(new Chocolates("KitKat",20,20,"green","Mint"));
        listOfSweets.add(new Baked("RedVelvet",100,50,"red","pastry"));
        listOfSweets.add(new Baked("MudChocolate",150,55,"darkbrown","darkChocolate"));
        listOfSweets.add(new Baked("ButterSkotch",70,70,"Yellow","jerries"));
        listOfSweets.add(new Mochis("takkeboki",25,50,"pink","Strawberry"));
        listOfSweets.add(new Mochis("tokkebi",50,50,"white","Vanilla"));
        listOfSweets.add(new Mochis("ml",10,40,"yellow","ButterSkotch"));
        Collections.sort(listOfSweets,new SortByCost());
        ArrayList<Sweets>onlywhite=new ArrayList<Sweets>();
        System.out.println("The cheap and best sweet of all is "+listOfSweets.get(0).name);
        for(Sweets s:listOfSweets) {
        	if(s.color.equals("white"))
        		onlywhite.add(s);
        }
        System.out.println("The white coloured sweets are: ");
        for(Sweets s:onlywhite) {
        	System.out.print(s.name+" ");
        }
    }
    
}
