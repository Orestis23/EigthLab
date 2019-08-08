package co.grandcircus;

import java.util.Scanner;

public class EigthLab {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many students are in the class? (1-10)");
		int studentNum = scan.nextInt();
		int array[] = { studentNum };

		String answer = getStringMatchingRegex(scan, "Would you like to learn more about our students? (y/n)", "[yn]");
		char userChar = answer.charAt(0);
		while (userChar == 'y') {
			System.out.println("Enter 1-10 to choose a student to learn about them!");
			int studentNumChoice = 0;
			try {
				studentNumChoice = scan.nextInt();

				String[] nameArr = { "Bob ", "Joe ", "Jim ", "Susie ", "Al ", "Susanne ", "Wendy ", "Billy-Joe ",
						"Bobby-Sue ", "Hoody-Hoo ", "Me-Too " };
				String[] foodArr = { "tacos", "sloppy joes", "sour patch kids", "cheesecake", "perch", "chicken",
						"beef", "soup", "garbage" };
				String[] cityArr = { "cincinnati.", "baltimore.", "san diego.", "chicago.", "boston.", "detroit.",
						"miami.", "philadelphia.", "st. louis.", "san antonio." };
				String[] userChoices = { nameArr[studentNumChoice], foodArr[studentNumChoice],
						cityArr[studentNumChoice] };

				System.out.println(userChoices[0] + "loves " + userChoices[1] + " and is from " + userChoices[2]);
				System.out.println("Would you like to search for another student?");
				userChar = scan.next().charAt(0);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Your index is out of bounds.");
				// e.printStackTrace();
				scan.nextLine();
			}

		}
		System.out.println("Thank you for showing a passing interest in our students!");
		scan.close();
	}

	public static String getStringMatchingRegex(Scanner sc, String prompt, String regex) {
		boolean isValid = false;

		String input;

		do {
			input = getString(sc, prompt);
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the right format: ");

			}

		} while (!isValid);

		return input;
	}

	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}
}
