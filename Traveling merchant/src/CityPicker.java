import java.util.*;
import java.io.*;


public class CityPicker
	{
	static Cities currentCity;
	static int stock;
	static ArrayList <Cities> myArray = new ArrayList <Cities>();
	
	public static void runCities()
		{
		pickStock();
		createCities();
		pickCity();
		}
	public static void createCities()
		{
		myArray.add(new Cities("Denver", 1, 1, stock, stock, stock, stock));
		myArray.add(new Cities("Boulder", 2, 2, stock, stock, stock, stock ));
		myArray.add(new Cities("Colorado Springs", 3, 3, stock, stock, stock, stock));
		}
	public static void pickCity()
		{
		int randomNumber = (int) (Math.random() * 3) + 1;
		
		currentCity = myArray.get(randomNumber);
		}
	public static void pickStock()
		{
		stock = (int) (Math.random() * 10) + 1;
		}
	
	}
