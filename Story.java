/**
 * 
 */
package gameer;

import java.util.Scanner;

/**
 * 
 */
public class Story {

	private static Scanner kdb = new Scanner(System.in);
	private String input;
	private static boolean askLoop = true;
	private String[] saved0;
	private String[] saved1;
	private String[] saved2;
	private String[] significantActions;

	public Story() {
		saved0 = new String[0];
		saved1 = new String[0];
		saved2 = new String[0];
		significantActions = new String[0];
	}

	public String passageText(String passage) {
		input = kdb.next();
		if (input.equals("+++")) {
			System.out.println("Enter the text you would like to add: ");
			input = kdb.next();
			passage = passage + " " + input;
		} else if (input.equals("###")) {
			System.out.println("Enter the new passage divider symbol"
					+ " (This should be a combination unlikely to happen naturally): ");
			input = kdb.next();
			if (input.equals("") || input.equals(" ") || input.equals(",") || input.equals("'") || input.equals(".")) {
				System.out.println("You chose a likely combination of letters/symbols. Back to beginning. ");
				passageText(passage);

			}
			CommandClass.divider(input);
		}

		return passage;
	}

	public void savePassage(String input) {
		String[] split = input.split("\\*");
		for (int i = 1; i < split.length; i += 2) {
			significantActions = addToArray(significantActions, split[i]);
		}

	}

	private String[] addToArray(String[] array, String element) {
		String[] newArray = new String[array.length + 1];
		System.arraycopy(array, 0, newArray, 0, array.length);
		newArray[array.length] = element;
		return newArray;
	}

	public String[] retrieveSavedPassage(int choice) {
		switch (choice) {
		case 0:
			return retrieveSave(saved0);
		case 1:
			return retrieveSave(saved1);
		case 2:
			return retrieveSave(saved2);
		default:
			System.out.println("Invalid choice.");
			return new String[0];
		}
	}

	private String[] retrieveSave(String[] save) {
		Scanner scanner = new Scanner(System.in);
		if (save.length > 0) {
			System.out.println("Would you like to override this save file? (yes/no)");
			String response = scanner.nextLine();
			if (response.equalsIgnoreCase("yes")) {
				significantActions = save;
			}
		} else {
			System.out.println("Save file does not exist.");
		}
		return significantActions;
	}

	public void load() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which file would you like to load? Type (0, 1, 2)");
		int choice = scanner.nextInt();
		switch (choice) {
		case 0:
			significantActions = saved0;
			break;
		case 1:
			significantActions = saved1;
			break;
		case 2:
			significantActions = saved2;
			break;
		default:
			System.out.println("Invalid choice.");
		}
		System.out.println("Story loaded successfully.");
	}

	public void askLevelGate() {
		while (askLoop) {
			System.out.println("What place would you like to require a certain level? ");
			String input0 = kdb.next();
			System.out.println("What level should be required? ");
			int input2 = kdb.nextInt();
			SkillTree skillTree = new SkillTree();
			skillTree.levelGate(input0, input2);
			System.out.println("Would you like to exit (y/n)? ");
			if (kdb.next() == "y" || kdb.next() == "Y") {
				askLoop = false;
			}
		}
	}

	public static void main(String[] args) {
		Story passage = new Story();
		passage.savePassage(
				"*Introduction* This is a test passage. *Conflict* Something happened. *Resolution* It was resolved.");
		// Retrieving saved story
		String[] savedPassage = passage.retrieveSavedPassage(0);
		System.out.println("Significant actions retrieved:");
		for (String action : savedPassage) {
			System.out.println(action);
		}
		passage.load();System.out.println("Significant actions loaded:");
        for (String action : passage.significantActions) {
            System.out.println(action);
        }
		

	}

}
