
public class Pet {

	private String petName;
	private int foodLevel;

	// this is my constructor
	public Pet(String petName, int foodLevel) {
		this.petName = petName;
		this.foodLevel = foodLevel;
	}

	// this is the getter
	public String getPetName() {
		return petName;
	}
	public int getFoodLevel() {
		return foodLevel;
	}
	public void feed() {
		foodLevel = foodLevel + 1;
	}
	public void consume() {
		foodLevel = foodLevel - 1;
	}
}
