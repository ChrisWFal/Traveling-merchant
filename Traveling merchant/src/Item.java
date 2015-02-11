
public class Item
	{
	int amountOne;
	String itemName;
	int baseBuy;
	int baseSell;
	int size;
	
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
	public int getBaseBuy()
		{
		return baseBuy;
		}
	public int getBaseSell()
		{
		return baseSell;
		}
	public void setAmount(int amount)
		{
		amountOne = amount;
		}
	
	
	}
