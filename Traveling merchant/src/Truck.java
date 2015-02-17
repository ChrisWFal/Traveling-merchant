
public class Truck extends Transportation
	{

	@Override
	public void addInventory()
		{
		 Inventory.setInventory(Inventory.getInventory() + 10);
		 Inventory.maxInventory = 50;
		
		}

	@Override
	public void costMoney()
		{
		Inventory.setMoney(Inventory.getMoney() - 100);
		
		}
	
	}
