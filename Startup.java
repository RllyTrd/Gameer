package gameer;

import java.util.Scanner;

public class Startup {
	private Scanner kdb;
	private String input;
	
	public void modeChoice() {
		
		if (input.equals("1")|| input.equals("2") || input.equals("3")) {
			if (input.equals("1")) {
			Preset.preset = true;
		} else if (input.equals("2")) {
			Manip.manip = true;
		} else if (input.equals("3")) {
			Free.free = true;
		}
		} else {
			System.out.println("Enter a valid input (1, 2, or 3): ");
			modeChoice();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome! Below are common commands.");
		Help.commandDisplay();

	}

}
