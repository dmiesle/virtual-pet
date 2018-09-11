
public class Resource {

	private int food;
	private int foodLevelLast;
	private int entertainedLast;
	private int restedLast;
	private String lastChoice;
	private int tickCount;
	
	public int getFood(){
		return food;
	}
	public Resource(int food, int foodLevelLast, int entertainedLast, int restedLast, int tickCount, String lastChoice) {
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
	public void feed() {
		foodLevelLast = foodLevelLast +1;
		lastChoice = "feed";
		
	}
	public int getEntertainedLast() {
		return entertainedLast;
	}
	public int setEntertained() {
		entertainedLast = entertainedLast+1;
		return entertainedLast;
	}
	public int getLastTick() {
		return tickCount;
		
	}
	public int setTickCount() {
		tickCount = tickCount +1;
		return tickCount;
	}
	
}
