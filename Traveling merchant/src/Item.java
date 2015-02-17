
public class Item
	{
	private int amountOne;
	private String itemName;
	private static int baseBuy;
	private static int baseSell;
	private int size;
	
	static int randomNumber = (int)Math.random()*10 + 1;
	
	public Item(int a, String in, int bc, int bs, int s)
		{
		amountOne = a;
		itemName = in;
		baseBuy = bc;
		baseSell = bs;
		size = s;
		}
	
	public  String getItemName()
		{
		return itemName;
		}
	public int getAmount()
		{
		return amountOne;
		}
	public static int getBaseBuy()
		{
		return baseBuy;
		}
	public static int getBaseSell()
		{
		return baseSell;
		}
	public void setAmount(int amount)
		{
		amountOne = amount;
		}
	
	
	}
