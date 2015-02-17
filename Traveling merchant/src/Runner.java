import java.util.*;
import java.io.*;

public class Runner
	{

	static String name;
	static String start;
	static int transport;
	static String currentVehicle;
	static int pick;
	static boolean play = true;
	static ArrayList <Cities> myArray = new ArrayList <Cities>();
	static int city;
	static int cityMenuPick;
	static int whatToBuy;

	
	
	public static void main(String[] args)
		{
		myArray.add(new Cities ("Denver", 1, 1, 20));
		myArray.add(new Cities("Boulder", 2, 2, 20));
		myArray.add(new Cities("Colorado Springs", 3, 3, 20));

		Cities.addItems(); 
		
		Runner runner = new Runner();
		
		runner.greet();

		}
	public void greet()
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
	
	public static void mainMenu()
		{
		do
			{
			System.out.println("\n Would you like to :");
			System.out.println("1. travel to a city");
			System.out.println("2. view your inventory");
			System.out.println("3. buy a new vehicle");
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
						System.out.println((i + 1) + ". " + myArray.get(i).getName());
						}  
					city = userInput.nextInt();
					
					
					cityMenu(city);
					

					
					}
					break;
				case 2:
					{
					Inventory.viewInventory();
					break;
					}
				case 3:
					{
					int vehiclePick;
					
					System.out.println("Would you like to buy:");
					System.out.println("1. Train   $200");
					System.out.println("2. Truck   $100");
					
					vehiclePick = userInput.nextInt();
					
					switch(vehiclePick)
						{
						case 1:
							{
							if(Inventory.getMoney() < 200)
								{
								System.out.println("Sorry you dont have enough money");
								mainMenu();
								}
							
							Train train = new Train();
							train.addInventory();
							train.costMoney();
							System.out.println("You purchased a train, inventory space added");
							break;
							}
						case 2:
							{
							if(Inventory.getMoney() < 100)
								{
								System.out.println("Sorry you dont have enough money");
								mainMenu();
								}
							
							Truck truck = new Truck();
							truck.addInventory();
							truck.costMoney();
							System.out.println("You purchased a truck, inventory space increased");
							break;
							}
						}
					break;
					}
				case 4:
					{
					System.out.println("ok maybe next time");
					play = false;
					System.exit(0);
					}
				}
			}
		while(play == true);
		}
	
	public static void cityMenu(int cityPicked)
		{
		city = cityPicked;
		
		
		System.out.println("You arrive in " + myArray.get(city - 1).getName());
		System.out.println("Would you like to:");
		System.out.println("1. Buy items");
		System.out.println("2. Sell items");
		System.out.println("3. return home");

		
		Scanner userInput = new Scanner(System.in);
		cityMenuPick = userInput.nextInt();
		
		switch(cityMenuPick)
			{
			case 1:
				{
				//Cities.storeStock();
				CityOptions.buy();
				break;
				}
			case 2:
				{
				CityOptions.sell();
				break;
				}
			case 3:
				{
				System.out.println("You return home");
				mainMenu();
				break;
				}
			}
		
		Cities.inventory.clear();
		
		}
	
	
	
	
		

	}
