import java.util.*;
import java.io.*;

public class CityOptions
	{
	
	static int whatToBuy;
	static int amount = 0;
	
	static Scanner userInput = new Scanner (System.in);
	
	
	public static void buy()
		{
		whatToBuy = userInput.nextInt();
		
		
			System.out.println("How many would you like to buy?");
			amount = userInput.nextInt();
			
			
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
				Runner.cityMenu(Runner.city);
				}
			if(whatToBuy == 2)
				{
				Cities.inventory.get(whatToBuy - 1).setAmount(Cities.inventory.get(whatToBuy - 1).getAmount() - amount);
				Inventory.setOrange(Inventory.getOrange() + amount);
				Inventory.setMoney(Inventory.getMoney() - (Cities.inventory.get(whatToBuy - 1).getBaseBuy() * amount));
				Runner.cityMenu(Runner.city);
				}
			if(whatToBuy == 3)
				{
				Cities.inventory.get(whatToBuy - 1).setAmount(Cities.inventory.get(whatToBuy - 1).getAmount() - amount);
				Inventory.setMeat(Inventory.getMeat() + amount);
				Inventory.setMoney(Inventory.getMoney() - (Cities.inventory.get(whatToBuy - 1).getBaseBuy() * amount));
				Runner.cityMenu(Runner.city);
				}
			
			if(whatToBuy == 4)
				{
				Cities.inventory.get(whatToBuy - 1).setAmount(Cities.inventory.get(whatToBuy - 1).getAmount() - amount);
				Inventory.setPotato(Inventory.getPotato() + amount);
				Inventory.setMoney(Inventory.getMoney() - (Cities.inventory.get(whatToBuy - 1).getBaseBuy() * amount));
				Runner.cityMenu(Runner.city);
				}
		}
	}
