package Model.Store;

import java.util.ArrayList;

public class Store {
	public ArrayList<Item> items;
	
	public Store() {
		items = new ArrayList<Item>(6);
		items.add(new Item("Warrior", "this is Warrior",100));
		items.add(new Item("Wizard", "this is Wizardr",200));
		items.add(new Item("Archer", "this is Archer",300));
		items.add(new Item("Weather", "this is Weather item",100));
		items.add(new Item("item2", "this is item 1",150));
		items.add(new Item("item3", "this is item 2 ",200));
		
	}
	
}
