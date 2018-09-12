
public class Resource {

	private int food;
	private int foodLevelLast;
	private int entertainedLast;
	private int restedLast;
	private String lastChoice;
	private int tickCount;

	public int getFood() {
		return food;
	}

	public Resource(int food, int foodLevelLast, int entertainedLast, int restedLast, int tickCount,
			String lastChoice) {
		this.food = food;
		this.foodLevelLast = foodLevelLast;
		this.entertainedLast = entertainedLast;
		this.restedLast = restedLast;
		this.tickCount = tickCount;
		this.lastChoice = lastChoice;
	}

	public int getLastFeed() {

		return foodLevelLast;
	}

	public void setFeed() {
		foodLevelLast = foodLevelLast + 1;
		lastChoice = "feed";

	}

	public int getEntertainedLast() {
		return entertainedLast;
	}

	public int setEntertained() {
		entertainedLast = entertainedLast + 1;
		lastChoice = "entertained";
		return entertainedLast;
	}

	public int getLastTick() {
		return tickCount;

	}

	public int setTickCount() {
		tickCount = tickCount + 1;
		return tickCount;
	}

	public int getRestedLast() {
		return restedLast;
	}

	public int setRested() {
		restedLast = restedLast + 1;
		lastChoice = "rested";
		return restedLast;
	}

	public String getLastChoice() {
		return lastChoice;
	}

	public int setFood() {
		food = food - 1;
		return food;
	}

	public int setMoreFood() {
		if (tickCount % 5 == 0) {
			food = food + 3;
			return food;
		} else {
			return 0;
		}
	}

}
