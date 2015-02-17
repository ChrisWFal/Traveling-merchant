import java.util.*;
import java.io.*;

public class CityOptions
	{
	
	static int whatToBuy;
	static int whatToSell;
	static int amount = 0;
	
	static Scanner userInput = new Scanner (System.in);
	
	
	public static void buy()
		{
		Cities.storeStock();
		
		whatToBuy = userInput.nextInt();
		
		
			System.out.println("How many would you like to buy?");
			amount = userInput.nextInt();
			
			if(Inventory.getInventory() + amount > Inventory.maxInventory)
				{
				System.out.println("Sorry you dont have enough inventory space to buy that much");
				buy();
				}
			if(amount > Cities.inventory.get(whatToBuy - 1).getAmount())
				{
				System.out.println("There aren't that many items here!");
				System.out.println("Try again");
				buy();
				}
			if(Cities.inventory.get(whatToBuy - 1).getBaseBuy() * amount > Inventory.getMoney() )
				{
				System.out.println("You dont have enough money to purchase that!");
				buy();
				}
			if(whatToBuy == 1)
				{
				Cities.inventory.get(whatToBuy - 1).setAmount(Cities.inventory.get(whatToBuy - 1).getAmount() - amount);
				Inventory.setHotDog(Inventory.getHotDog() + amount);
				Inventory.setMoney(Inventory.getMoney() - (Cities.inventory.get(whatToBuy - 1).getBaseBuy() * amount));
				Inventory.setInventory(Inventory.getInventory() + amount);
				Runner.cityMenu(Runner.city);
				}
			if(whatToBuy == 2)
				{
				Cities.inventory.get(whatToBuy - 1).setAmount(Cities.inventory.get(whatToBuy - 1).getAmount() - amount);
				Inventory.setOrange(Inventory.getOrange() + amount);
				Inventory.setMoney(Inventory.getMoney() - (Cities.inventory.get(whatToBuy - 1).getBaseBuy() * amount));
				Inventory.setInventory(Inventory.getInventory() + amount);
				Runner.cityMenu(Runner.city);
				}
			if(whatToBuy == 3)
				{
				Cities.inventory.get(whatToBuy - 1).setAmount(Cities.inventory.get(whatToBuy - 1).getAmount() - amount);
				Inventory.setMeat(Inventory.getMeat() + amount);
				Inventory.setMoney(Inventory.getMoney() - (Cities.inventory.get(whatToBuy - 1).getBaseBuy() * amount));
				Inventory.setInventory(Inventory.getInventory() + amount);
				Runner.cityMenu(Runner.city);
				}
			
			if(whatToBuy == 4)
				{
				Cities.inventory.get(whatToBuy - 1).setAmount(Cities.inventory.get(whatToBuy - 1).getAmount() - amount);
				Inventory.setPotato(Inventory.getPotato() + amount);
				Inventory.setMoney(Inventory.getMoney() - (Cities.inventory.get(whatToBuy - 1).getBaseBuy() * amount));
				Inventory.setInventory(Inventory.getInventory() + amount);
				Runner.cityMenu(Runner.city);
				}
		}
	
	public static void sell()
		{
		System.out.println("1." + Cities.inventory.get(0).getItemName() + "   " + Inventory.getHotDog() + "   $" + Cities.inventory.get(0).getBaseSell());
		System.out.println("2." + Cities.inventory.get(1).getItemName() + "   " + Inventory.getOrange() + "   $" + Cities.inventory.get(1).getBaseSell());
		System.out.println("3." + Cities.inventory.get(2).getItemName() + "   " + Inventory.getMeat() + "   $" + Cities.inventory.get(2).getBaseSell());
		System.out.println("4." + Cities.inventory.get(3).getItemName() + "   " + Inventory.getPotato() + "   $" + Cities.inventory.get(3).getBaseSell());
		System.out.println("");
		
		
		System.out.println("What would you like to sell?");
		
		whatToSell = userInput.nextInt();
		
		
		System.out.println("How many would you like to sell?");
		amount = userInput.nextInt();
		
		switch(whatToSell)
		{
		case 1:
			{
			if(amount > Inventory.getHotDog())
				{
				System.out.println("Sorry you dont have enought of that item.");
				sell();
				}
			else
				{
				System.out.println("You sold " + amount + " hotdogs");
				Inventory.setHotDog(Inventory.getHotDog() - 1 * amount);
				Inventory.setMoney(Inventory.getMoney() + Item.getBaseSell() * amount);
				Inventory.setInventory(Inventory.getInventory() - amount);
				Cities.inventory.get(0).setAmount(Cities.inventory.get(0).getAmount() + amount);
				Runner.mainMenu();
				}
			break;
			}
		case 2:
			{
			if(amount > Inventory.getOrange())
				{
				System.out.println("Sorry you dont have enought of that item.");
				sell();
				}
			else
				{
				System.out.println("You sold " + amount + " oranges");
				Inventory.setOrange(Inventory.getOrange() - 1 * amount);
				Inventory.setMoney(Inventory.getMoney() + Item.getBaseSell() * amount);
				Inventory.setInventory(Inventory.getInventory() - amount);
				Cities.inventory.get(1).setAmount(Cities.inventory.get(1).getAmount() + amount);
				Runner.mainMenu();
				}
			
			break;
			}
		case 3:
			{
			if(amount > Inventory.getMeat())
				{
				System.out.println("Sorry you dont have enought of that item.");
				sell();
				}
			else
				{
				System.out.println("You sold " + amount + " meat");
				Inventory.setMeat(Inventory.getMeat() - 1 * amount);
				Inventory.setMoney(Inventory.getMoney() + Item.getBaseSell() * amount);
				Inventory.setInventory(Inventory.getInventory() - amount);
				Cities.inventory.get(2).setAmount(Cities.inventory.get(2).getAmount() + amount);
				Runner.mainMenu();
				}
			
			break;
			}
		case 4:
			{
			if(amount > Inventory.getPotato())
				{
				System.out.println("Sorry you dont have enought of that item.");
				sell();
				}
			else
				{
				System.out.println("You sold " + amount + " potatoes");
				Inventory.setHotDog(Inventory.getPotato() - 1 * amount);
				Inventory.setMoney(Inventory.getMoney() + Item.getBaseSell() * amount);
				Inventory.setInventory(Inventory.getInventory() - amount);
				Cities.inventory.get(3).setAmount(Cities.inventory.get(3).getAmount() + amount);
				Runner.mainMenu();
				}
			
			break;
			}
		}
		
		}
	}
