import java.util.*;
import java.io.*;

public class Runner
	{

	static String name;
	static String start;
	
	
	public static void main(String[] args)
		{
		greet();

		}
	public static void greet()
		{
		System.out.println("Hello, whats your name?");
		
		Scanner userInput = new Scanner(System.in);
		name = userInput.nextLine();
		
		System.out.println("Nice to meet you " + name + " are you ready to begin?");
		start = userInput.nextLine();
		
		if(start .equals("Yes"))
			{
			CityPicker.runCities();
			}
		else
			{
			System.out.println("Okay maybe next time");
			}
		
		
		}
	
	
		

	}
