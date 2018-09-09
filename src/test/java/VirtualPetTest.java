import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetTest {
	Pet underTest = new Pet("My Pet", 1, 1, 1, 10, 1, 1, "Curious");
	Resource underTest1 = new Resource(5);
	
	@Test
	public void doesTickConsumeAndActive() {
	String check = underTest.tick();
	assertThat(check, is("My Pet is done with that activity"));
	}
	
	//public void doesCuriousIncreaseXPforTraining() {
		//int check = underTestPetStatus.applyCurious(); 	

	@Test
	public void doesThePetHaveANameMyPet() {
		String check = underTest.getPetName();
		assertThat(check, is(new String("My Pet")));
	}

	@Test
	public void isTheFoodLevel1() {
		int check = underTest.getFoodLevel();
		assertThat(check, is(1));
	}

	@Test
	public void isThePetWellFed2IfItStartsAt1AndIsFed() {
		underTest.feed();
		int check = underTest.getFoodLevel();
		assertThat(check, is(2));
	}

	@Test
	public void isThePetWellFed0IfItStartsAt1AndConsumes() {
		underTest.consume();
		int check = underTest.getFoodLevel();
		assertThat(check, is(0));
	}

	@Test
	public void isThePetEntertainedAt1() {
		int check = underTest.getEntertained();
		assertThat(check, is(1));
	}

	@Test
	public void doesThePetsEntertainementGoUpTo2IfAttend() {
		underTest.attend();
		int check = underTest.getEntertained();
		assertThat(check, is(2));
	}

	@Test
	public void doesThePetsEntertainementGoDownTo0IfNeglect() {
		underTest.neglect();
		int check = underTest.getEntertained();
		assertThat(check, is(0));
	}

	@Test
	public void isThePetRestedAt1() {
		int check = underTest.getRested();
		assertThat(check, is(1));
	}

	@Test
	public void doesThePetsRestedGoUpTo2IfSleep() {
		underTest.sleep();
		int check = underTest.getRested();
		assertThat(check, is(2));
	}

	@Test
	public void doesThePetsRestedGoDownTo0IfActive() {
		underTest.active();
		int check = underTest.getRested();
		assertThat(check, is(0));
	}

	@Test
	public void isThePetExperienceAt10() {
		int check = underTest.getExperience();
		assertThat(check, is(10));
	}

	@Test
	public void doesThePetExperienceIncreasefrom10To20() {
		underTest.learn();
		int check = underTest.getExperience();
		assertThat(check, is(20));
	}

	@Test
	public void isThePetLevelAt1() {
		int check = underTest.getLevel();
		assertThat(check, is(1));
	}

	@Test
	public void doesThePetsLevelIncreaseby1to2AtLevelUop() {
		underTest.levelUp();
		int check = underTest.getLevel();
		assertThat(check, is(2));
	}

	@Test
	public void isThePetAlive() {
		int check = underTest.getAlive();
		assertThat(check, is(1));
	}

	@Test
	public void isThePetTypeCurious() {
		String check = underTest.getPetType();
		assertThat(check, is("Curious"));
	}

	@Test
	public void isThereFood5() {
		int check = underTest1.getFood();
		assertThat(check, is(5));
	}
	
}