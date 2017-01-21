package pieces;
import java.util.ArrayList;
import item.Item;
import inventoryErrors.*;
public class Inventory {
	private ArrayList<Item> inventory = new ArrayList<Item>();
	private int numItems;
	private static int MAX_CAPACITY = 3;
	public Inventory()
	{
		numItems = 0; 
	}
	public void tossItem(Item desiredItem) throws EmptyInventoryException, ItemNotFoundException
	{
		if (numItems == 0)
			throw new EmptyInventoryException("Inventory is empty, no Items available");
		for (Item inventoryItem: inventory)
		{
			if (inventoryItem.getName().equals(desiredItem.getName()))
			{
				inventory.remove(inventoryItem);
			}
			else
			{
				throw new ItemNotFoundException("Item was not found in inventory");
			}
		}
	}
	public void useItem(Item desiredItem) throws EmptyInventoryException, ItemNotFoundException
	{
		if (numItems == 0)
			throw new EmptyInventoryException("Inventory is empty, no Items available");
		for (Item inventoryItem: inventory)
		{
			if (inventoryItem.getName().equals(desiredItem.getName()))
			{
				if (inventoryItem.getUses() != 0)
				{
					inventory.remove(inventoryItem);
				}				
				else
				{
					inventoryItem.decreaseUses();
				}
			}
			else
			{
				throw new ItemNotFoundException("Item was not found in inventory");
			}
				
				
		}
	}
	public void addItem(Item item) throws MaxCapacityException
	{
		if (numItems > MAX_CAPACITY)
			throw new MaxCapacityException("Max Capacity Reached");
		numItems++;
		inventory.add(item);
	}
	
}
