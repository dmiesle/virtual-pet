
public class Pet {

	private String petName;
	private int foodLevel;
	private int entertained;
	private int rested;

	// this is my constructor
	public Pet(String petName, int foodLevel, int entertained, int rested) {
		this.petName = petName;
		this.foodLevel = foodLevel;
		this.entertained = entertained;
		this.rested = rested;
	}

	// this is the getter
	public String getPetName() {
		return petName;
	}

	// food changes
	public int getFoodLevel() {
		return foodLevel;
	}

	public void feed() {
		foodLevel = foodLevel + 1;
	}

	public void consume() {
		foodLevel = foodLevel - 1;
	}
	// entertainment changes

	public int getEntertained() {
		return entertained;
	}

	public void attend() {
		entertained = entertained + 1;

	}

	public void neglect() {
		entertained = entertained - 1;

	}

	public int getRested() {
		return rested;
	}

	public void sleep() {
		rested = rested +1;
		
	}

	public void active() {
		rested = rested -1;
		
	}

}
