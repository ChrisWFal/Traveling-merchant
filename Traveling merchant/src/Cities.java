import java.util.*;
import java.io.*;


public class Cities
	{
	public String name;
	public static int number;
	public int distance;
	public int stock;
	
	static ArrayList <Item> inventory = new ArrayList <Item>();
	static int randomNumber = (int) Math.random()* 20 + 1;
	
	public Cities(String n, int nu, int d, int s)
		{
		name = n;
		number = nu;
		distance = d;
		stock = s;
		
		
		
		}
	
	
	public static int getCity()
		{
		return number;
		}
	
	public static void addItems()
		{
		inventory.add(new Item( randomNumber ,"Hot Dogs", 2, 2, 2));
		inventory.add(new Item( randomNumber ,"Oranges", 3, 3, 2));
		inventory.add(new Item( randomNumber ,"Meat", 10, 10, 5));
		inventory.add(new Item( randomNumber ,"Potatoes", 5, 5, 3));
		}
	}
