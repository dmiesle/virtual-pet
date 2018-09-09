import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PetStatus myStatus = new PetStatus();
		String menuOption;

		System.out.println("Congratulations! You just found a new pet.");
		System.out.println("Your new pet needs a name. Please give it one now:");
		String name = input.nextLine();
		Pet myPet = new Pet(name, 5, 2, 3, 0, 1, 1, "Basic");
		System.out.println(name + " is so excited you are going to care for it. Your pet is " + myPet.getPetType());
		System.out.println("Right now " + name + " is waiting for you to do something");
		do {
			System.out.println("1 - Check on " + name + ".");
			System.out.println("2 - Feed " + name + ".");
			System.out.println("3 - Play with " + name + ".");
			System.out.println("4 - Train " + name + ".");
			System.out.println("5 - Put " + name + " to sleep.");
			System.out.println("6 - Ignore " + name + ".");
			System.out.println("7 - Abandon " + name + ".");
			menuOption = input.nextLine();

			if (menuOption.equals("1")) {
				System.out.println(name + " is " + myStatus.getHungerStatus(myPet.getFoodLevel()) + " , "
						+ myStatus.getEntertainmentStatus(myPet.getEntertained()) + ", and "
						+ myStatus.getRestedStatus(myPet.getRested()) + ".");
			} else if (menuOption.equals("2")) {
				myPet.feed();
			} else if (menuOption.equals("3")) {
				myPet.attend();
				myPet.attend();
				myPet.tick();
				if (myPet.getAlive() != 1) {
					System.out.println("Your pet has died. Goodbye");
					System.exit(0);
				}
			} else if (menuOption.equals("4")) {
				myPet.learn();
				myPet.learn();
				myPet.tick();
				if (myPet.getAlive() != 1) {
					System.out.println("Your pet has died. Goodbye");
					System.exit(0);
				}
			} else if (menuOption.equals("5")) {
				myPet.sleep();
				myPet.sleep();
				myPet.sleep();
				myPet.tick();
				if (myPet.getAlive() != 1) {
					System.out.println("Your pet has died. Goodbye");
					System.exit(0);
				}
			} else if (menuOption.equals("6")) {
				myPet.tick();
				if (myPet.getAlive() != 1) {
					System.out.println("Your pet has died. Goodbye");
					System.exit(0);
				}
			} else {
				System.out.println("Your pet wanders off to find someone who cares about living beings.");
				System.exit(0);
			}
			System.out.println("What else do you want to do with "+ name + "?");
		} while (menuOption != "7");
		input.close();

	}
}
