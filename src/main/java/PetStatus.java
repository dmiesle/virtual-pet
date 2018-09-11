import java.util.Arrays;
import java.util.List;

public class PetStatus {
	List<String> hungers = Arrays.asList("Dead", "Starving", "Hangry", "Hungry", "Peckish", "Satisified", "Content",
			"Full", "Stuffed", "Bloated", "Lethargic");

	public String getHungerStatus(int foodLevel) {
		return hungers.get(foodLevel);

	}

	List<String> entertainments = Arrays.asList("Bored", "Restless", "Happy", "Loved", "Overstimulated");

	public String getEntertainmentStatus(int entertained) {
		return entertainments.get(entertained);

	}

	List<String> rests = Arrays.asList("Delerious", "Exhausted", "Tired", "Rested", "Well Rested");

	public String getRestedStatus(int rested) {
		return rests.get(rested);

	}
	List<String> personality = Arrays.asList("Basic", "Curios", "Big Appetited", "High Maintenance", "Lazy", "Laid-back" );

}