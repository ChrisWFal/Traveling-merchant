import java.util.*;
import java.io.*;


public class Cities
	{
	public String name;
	public static int number;
	public int distance;
	public int capacity;
	static int randomNumber = 0;
	
	
	static ArrayList <Item> inventory = new ArrayList <Item>();

	
	public Cities(String n, int nu, int d, int c)
		{
		name = n;
		number = nu;
		distance = d;
		capacity = c;
		
		
		
		}
	
	
	public static int getCity()
		{
		return number;
		}
	
	
	public static void addItems()
		{
		randomNumber = (int)Math.random() * 10 + 1;
		inventory.add(new Item( randomNumber ,"Hot Dogs", 2, 2, 2));
		randomNumber = (int)Math.random() * 10 + 1;
		inventory.add(new Item( randomNumber ,"Oranges", 3, 3, 2));
		randomNumber = (int)Math.random() * 10 + 1;
		inventory.add(new Item( randomNumber ,"Meat", 10, 10, 5));
		randomNumber = (int)Math.random() * 10 + 1;
		inventory.add(new Item( randomNumber ,"Potatoes", 5, 5, 3));
		randomNumber = (int)Math.random() * 10 + 1;
		}
	}
