import java.util.*;
import java.io.*;


public class Cities
	{
	public String name;
	public static int number;
	public int distance;
	public int stock;
	
	ArrayList <Item> inventory = new ArrayList <Item>();
	
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
	}
