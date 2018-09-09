import java.util.Scanner;

public class VirtualPetApp {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Congratulations! You just found a new pet.");
		System.out.println("Your new pet needs a name. Please give it one now:");
		String name = input.nextLine();
		Pet myPet = new Pet(name, 5, 3, 4, 0, 1, 1, "Basic");
		System.out.println(name + " is so excited you are going to care for it. Your pet is "+ myPet.getPetType());
		System.out.println("Right now " + name + " is waiting for you to do something");
		System.out.println("1 - Check on "+ name +".");
		System.out.println("2 - Feed "+ name +".");
		System.out.println("3 - Play with "+ name +".");
		System.out.println("4 - Train "+ name +".");
		System.out.println("5 - Put "+ name +" to sleep.");
		System.out.println("6 - Ignore "+ name +".");
		System.out.println("7 - Abandon "+ name +".");
		String menuOption = input.nextLine();
	}

}
