import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualPetTest {
	Pet underTest = new Pet("My Pet", 1);
	
	@Test
	public void doesThePetHaveANameMyPet() {
		String check = underTest.getPetName();
		assertThat (check, is(new String("My Pet")));
	}
	@Test
	public void isTheFoodLevel1 () {
		int check = underTest.getFoodLevel();
		assertThat (check, is(1));
	}
	@Test
	public void isThePetWellFed2IfItStartsAt1AndIsFed () {
		underTest.feed();
		int check = underTest.getFoodLevel();
		assertThat (check, is(2));
	}
	@Test
	public void isThePetWellFed0IfItStartsAt1AndConsumes () {
		underTest.consume();
		int check = underTest.getFoodLevel();
		assertThat (check, is(0));
	}
}
