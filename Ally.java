/**
 * 
 */
package gameer;

import java.util.Scanner;

/**
 * 
 */
public class Ally extends Person {

	private Scanner kdb = new Scanner(System.in);
	private static int level = 1;
	private static int xp = 4;
	private static int xpCap = 10;
	private static int xpNeeded = 6;
	private String status = "";
	private String input;
	private int hairColor, hairTexture, hairLength, 
	eyeColor, skinColor, pronouns;
	private String hairC = "hairC", hairT = "hairT", 
			hairL = "hairL", eyeC = "eyeC", skinC = "skinC", 
			pronounsA = "pronounsA", pronounsB = "pronounsB";
	
	public Ally() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void levelUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void attack() {
		int level = getLevel();
		int enemyLevel = Enemy.getLevel();
		int atk = getAtk();
		int enemyDef = Enemy.getDef();
		atk = (atk/level) - (enemyDef/enemyLevel);
		if (friendlyFire == true) {
			int target = You.getHealth();
			target = target - atk;
		} else {
			int target = Enemy.getHealth();
			target = target - atk;
		}

	}

	private int getAtk() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub

	}

	@Override
	public String currentStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addInv() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkInv() {
		// TODO Auto-generated method stub
		return null;
	}

	public static int getHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int getDef() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int getLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String[] facade() {
		while(pronounsB.equalsIgnoreCase("pronounsB")) {
			if (hairColor == 0) {
				System.out.println("");
				System.out.println("Are you happy with "+ hairColor + ": " 
				+ hairC + " ?");
				if(input.equalsIgnoreCase("No")||
						input.equalsIgnoreCase("N")) {
					hairColor = 0;
					hairC = "";
					facade();
				}
			} if (hairTexture == 0) {
				System.out.println("");
				System.out.println("Are you happy with "+ hairTexture + ": " 
						+ hairT + " ?");
						if(input.equalsIgnoreCase("No")||
								input.equalsIgnoreCase("N")) {
							hairTexture = 0;
							hairT = "";
							facade();
						}
			} if (hairLength == 0) {
				System.out.println("");
			} if (skinColor == 0) {
				System.out.println("");
			} if (eyeColor == 0) {
				System.out.println("");
			}if (pronouns == 0) {
				System.out.println("");
			}
		}
		return null;
	}

	@Override
	public void levelUpMod() {
		// TODO Auto-generated method stub
		
	}

}
