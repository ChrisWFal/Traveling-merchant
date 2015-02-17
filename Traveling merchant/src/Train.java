
public class Train extends Transportation
	{

	@Override
	public void addInventory()
		{
		Inventory.setInventory(Inventory.getInventory() + 20);
		Inventory.maxInventory = 60;
		
		}

	@Override
	public void costMoney()
		{
		Inventory.setMoney(Inventory.getMoney() - 200);
		
		}
	
	}
