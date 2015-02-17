
public class Inventory
	{
	
    public static int hotDogCount;
    public static int orangeCount;
    public static int meatCount;
    public static int potatoCount;
    public static int money = 50;
    public static int totalInventorySpace = 40;
    
    public static int maxInventory = 40;
	
	  
	public static void viewInventory()
		{
		
		System.out.println("\n Money:  $" + money);
		System.out.println(" Inventory: " + totalInventorySpace + "/" + maxInventory);
		System.out.println(" You have " + hotDogCount + " hotdogs, " + orangeCount + " oranges, " + meatCount + " meat and " + potatoCount + " potatoes " );
		Runner.mainMenu();
		}
	
	
	public static int getMoney()
		{
		return money;
		}
	public static void setMoney(int cash)
		{
		money = cash;
		}
	public static void setHotDog(int hotDog)
		{
		hotDogCount = hotDog;
		}
	public static int getHotDog()
		{
		return hotDogCount;
		}
	public static void setOrange(int orange)
		{
		orangeCount = orange;
		}
	public static int getOrange()
		{
		return orangeCount;
		}
	public static void setMeat(int meat)
		{
		meatCount = meat;
		}
	public static int getMeat()
		{
		return meatCount;
		}
	public static void setPotato(int potato)
		{
		potatoCount = potato;
		}
	public static int getPotato()
		{
		return potatoCount;
		}
	public static int getInventory()
		{
		return totalInventorySpace;
		}
	public static void setInventory(int inv)
		{
		totalInventorySpace = inv;
		}
	
	
	
	}
