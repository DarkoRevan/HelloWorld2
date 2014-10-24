import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Are you Darko Revan?");
		Scanner input = new Scanner(System.in);
		if (input.nextLine().equals("y"))
			System.out.println("Hi Darko...");
		else
			System.out.println("Not Darko? BYE");
	}

}
