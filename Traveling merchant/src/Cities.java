import java.util.*;
import java.io.*;


public class Cities
	{
	public String name;
	public int number;
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
	
	
	public int getCity()
		{
		return number;
		}
	public String getName()
		{
		return name;
		}
	
	
	
	public static void addItems()
		{
		randomNumber = (int)(Math.random() * 10) + 1;
		inventory.add(new Item( randomNumber ,"Hot Dogs", 2, 2, 2));
		Inventory.setHotDog(randomNumber);
		randomNumber = (int)(Math.random() * 10) + 1;
		inventory.add(new Item( randomNumber ,"Oranges", 3, 3, 2));
		Inventory.setOrange(randomNumber);
		randomNumber = (int)(Math.random() * 10) + 1;
		inventory.add(new Item( randomNumber ,"Meat", 10, 10, 5));
		Inventory.setMeat(randomNumber);
		randomNumber = (int)(Math.random() * 10) + 1;
		inventory.add(new Item( randomNumber ,"Potatoes", 5, 5, 3));
		Inventory.setPotato(randomNumber);

		}
	
	
	public static void storeStock()
		{
		for(int i = 0; i < inventory.size(); i ++)
			{
			System.out.println((i + 1) + "." + inventory.get(i).getItemName() + "  " + inventory.get(i).getAmount() + "  $" + inventory.get(i).getBaseBuy());
			}
		}
	}
