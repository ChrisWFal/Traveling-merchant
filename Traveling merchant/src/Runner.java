import java.util.*;
import java.io.*;

public class Runner
	{

	static String name;
	static String start;
	static int transport;
	static String currentVehicle;
	static ArrayList <Cities> myArray = new ArrayList <Cities>();
	static int pick;
	static boolean play = true;

	
	
	public static void main(String[] args)
		{
		createCities();
		Cities.addItems();
		greet(); 
		

		}
	public static void greet()
		{
		System.out.println("Hello, whats your name?");
		
		Scanner userInput = new Scanner(System.in);
		name = userInput.nextLine();
		
		System.out.println("Nice to meet you " + name + " are you ready to play?");
		start = userInput.nextLine();
		
		if(start .equals("yes"))
			{
			mainMenu();
			}
		else
			{
			System.out.println("Okay maybe next time");
			}
		}
	
	public static void createCities()
		{
		myArray.add(new Cities ("Denver", 1, 1, 20));
		myArray.add(new Cities("Boulder", 2, 2, 20));
		myArray.add(new Cities("Colorado Springs", 3, 3, 20));
		
		}
	
	public static void mainMenu()
		{
		do
			{
			System.out.println("Would you like to :");
			System.out.println("1. travel to a city");
			System.out.println("2. view your inventory");
			System.out.println("3. visit local store");
			System.out.println("4. quit the game");
		
			Scanner userInput = new Scanner (System.in);
			pick = userInput.nextInt();
			
			switch(pick)
				{
				case 1:
					{
					System.out.println("Would you like to travel to");
					for(int i = 0; i < myArray.size(); i ++)
						{
						System.out.println(myArray.get(i).getName());
						}
					}
				case 2:
					{
					Inventory.viewInventory();
					}
				case 3 :
					{
					
					}
				case 4:
					{
					System.out.println("Aight homie peace out");
					play = false;
					System.exit(0);
					}
				}
			}
		while(play == true);
		}
	
	
	
	
		

	}
