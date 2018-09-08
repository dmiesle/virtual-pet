import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualPetTest {
	Pet underTest = new Pet("My Pet", 1, 1, 1, 10, 1, 1);

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
	public void isThePetTraingAt10() {
		int check = underTest.getRested();
		assertThat(check, is(1));
}
}