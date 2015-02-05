
public class Item
	{
	static int amountOne;
	static String itemName;
	static int baseBuy;
	static int baseSell;
	static int size;
	
	static int randomNumber = (int)Math.random()*10 + 1;
	
	public Item(int a, String in, int bc, int bs, int s)
		{
		amountOne = a;
		itemName = in;
		baseBuy = bc;
		baseSell = bs;
		size = s;
		}
	
	public static String getItemName()
		{
		return itemName;
		}
	
	
	}
