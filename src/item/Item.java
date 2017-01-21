package item;

public class Item {
	private String name;
	private int uses;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUses() {
		return uses;
	}
	public void decreaseUses() {
		--uses;
	}

	
}
