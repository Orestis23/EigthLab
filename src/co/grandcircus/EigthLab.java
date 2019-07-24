package co.grandcircus;

import java.util.Arrays;
import java.util.Scanner;

public class EigthLab {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many students are in the class?");
		int studentNum = scan.nextInt();
		int array[] = { studentNum };
		System.out.println("Would you like to learn about our students?");
		char userChar = scan.next().charAt(0);
		while (userChar == 'y') {
			System.out.println("Enter 1-10 to choose a student to learn about them!");
			int i = scan.nextInt();
			for (i = 0; i < array.length; i++) {
				String[] nameArr = { "Bob ", "Joe ", "Jim ", "Susie ", "Al ", "Susanne ", "Wendy ", "Billy-Joe ",
						"Bobby-Sue ", "Hoody-Hoo ", "Me-Too " };
				String[] foodArr = { "tacos", "sloppy joes", "sour patch kids", "cheesecake", "perch", "chicken",
						"beef", "soup", "garbage" };
				String[] cityArr = { "cincinnati.", "baltimore.", "san diego.", "chicago.", "boston.", "detroit.",
						"miami.", "philadelphia.", "st. louis.", "san antonio." };
				String[] userChoices = {nameArr[i], foodArr[i], cityArr[i]};
	
				System.out.println(userChoices[0] + "loves " + userChoices[1] + " and is from " + userChoices[2]);
				System.out.println("Would you like to search for another student?");
				userChar = scan.next().charAt(0);

			}
			System.out.println("Thank you for showing a passing interest in our students!");
		}
		scan.close();
	}

}
