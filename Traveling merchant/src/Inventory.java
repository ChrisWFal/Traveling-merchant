
public class Inventory
	{
    public static int hotDogCount = 5;
    public static int orangeCount = 5;
    public  static int meatCount = 5;
    public static int potatoCount = 5;
	
	
	public static void viewInventory()
		{
		System.out.println("You have " + hotDogCount + " hotdogs, " + orangeCount + " oranges, " + meatCount + " meat and" + potatoCount + " potatoes" );
		Runner.mainMenu();
		}
	public void setHotDog(int hotDog)
		{
		hotDogCount = hotDog;
		}
	public void setOrange(int orange)
		{
		orangeCount = orange;
		}
	public void setMeat(int meat)
		{
		meatCount = meat;
		}
	public void setPotato(int potato)
		{
		potatoCount = potato;
		}
	
	
	
	}
