import java.util.*;
import java.io.*;


public class CityPicker
	{
	static Cities currentCity;
	
	static ArrayList <Cities> myArray = new ArrayList <Cities>();
	
	public static void runCities()
		{
		createCities();
		pickCity();
		}
	public static void createCities()
		{
		
		
		myArray.add(new Cities("Denver", 1, 1));
		myArray.add(new Cities("Boulder", 2, 2 ));
		myArray.add(new Cities("Colorado Springs", 3, 3));
		}
	public static void pickCity()
		{
		int randomNumber = (int) (Math.random() * 3) + 1;
		
		currentCity = myArray.get(randomNumber);
		}
	
	}
