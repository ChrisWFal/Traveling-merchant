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
		
		switch(whatToBuy)
		{
		case 1:
			{
			System.out.println("How many would you like to buy?");
			amount = userInput.nextInt();
			
			if(amount > Cities.inventory.get(1).getAmount())
				{
				System.out.println("There aren't that many items here!");
				buy();
				}
			if(Cities.inventory.get(1).getBaseBuy() * amount > Inventory.getMoney() )
				{
				System.out.println("You dont have enough money to purchase that!");
				buy();
				}
			else
				{
				Inventory.setHotDog(Inventory.getHotDog() + amount);
				Inventory.setMoney(Inventory.getMoney() - (Cities.inventory.get(1).getBaseBuy() * amount));
				Runner.cityMenu(Runner.city);
				}
			}
		case 2:
			{
			
			}
		case 3:
			{
			
			}
		case 4:
			{
			
			}
		}
		}
	}
