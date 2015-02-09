
public class Inventory
	{
    public static int hotDogCount;
    public static int orangeCount;
    public static int meatCount = 5;
    public static int potatoCount = 5;
	
	
	public static void viewInventory()
		{
		System.out.println("\n You have " + hotDogCount + " hotdogs, " + orangeCount + " oranges, " + meatCount + " meat and " + potatoCount + " potatoes " );
		Runner.mainMenu();
		}
	public static void setHotDog(int hotDog)
		{
		hotDogCount = hotDog;
		}
	public static void setOrange(int orange)
		{
		orangeCount = orange;
		}
	public static void setMeat(int meat)
		{
		meatCount = meat;
		}
	public static void setPotato(int potato)
		{
		potatoCount = potato;
		}
	
	
	
	}
