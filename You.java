/**
 * 
 */
package gameer;

import java.util.Scanner;

/**
 * 
 */
public class You extends Person {

	private static int level = 2;
	private static int xp = 10;
	private static int xpCap = 15;
	private static int xpNeeded = 5;
	private static int atk = 5;
	private static int def = 2;
	private static int health = 15;
	private static int healthCap = 15;
	
	private String input;
	private int number;
	
	private boolean levelChanged = false;
	private boolean xpChanged = false;
	private boolean xpCapChanged = false;
	private boolean xpNeededChanged = false;
	private boolean atkChanged = false;
	private boolean defChanged = false;
	private boolean healthChanged = false;
	private boolean healthCapChanged = false;
	
	private int[] checkInt = {level, xp, xpCap, xpNeeded, atk, def, health, healthCap};
	private boolean[] checkArray= {levelChanged, xpChanged, xpCapChanged, xpNeededChanged,
			atkChanged, defChanged, healthChanged, healthCapChanged};
	private String[] checkString = {"level : ", "experience points : ", "maximum experience points for set level : ",
			"experience points needed to level up : ", "base attack : ", "base defense : ",
			"base health : ", "base maximum health : "};
	
	private Scanner kdb = new Scanner(System.in);
	
	private int hairColor, hairTexture, hairLength, 
	eyeColor, skinColor, pronouns;
	private String hairC = "hairC", hairT = "hairT", 
			hairL = "hairL", eyeC = "eyeC", skinC = "skinC", 
			pronounsA = "pronounsA", pronounsB = "pronounsB";
	
	private String status = "";
	private String invString = "";
	private boolean friendlyFire = false;

	public You() {
		// TODO Auto-generated constructor stub
	}

	public void levelUp() {
		if (xp >= xpCap) {
			level++;
			xp = xp - xpCap;
			xpCap = xpCap + ((level * 1) / 4) ^ 2;
			xpNeeded = xpCap - xp;
			int oldHealthCap = healthCap;
			healthCap = -((healthCap-100)/10)^2 + 100;
			health = (healthCap - oldHealthCap)+ health;
			System.out.println("You leveled up! (⌒▽⌒)☆" + "\n" + "You are now level " + level + "." + "\n" + "You need "
					+ xpNeeded + " more XP to level up." + "\n" + "You have " + xp + " XP."+ "\n" + "HP: " + health + "/" + healthCap
					+ "\n" + "ATK: " + atk + "\n" + "DEF: " + def);
		}
	}

	public void attack() {
		int level = getLevel();
		int enemyLevel = Enemy.getLevel();
		int atk = getAtk();
		int enemyDef = Enemy.getDef();
		atk = (atk/level) - (enemyDef/enemyLevel);
		if (friendlyFire == true) {
			int target = Ally.getHealth();
			target = target - atk;
		} else {
			int target = Enemy.getHealth();
			target = target - atk;
		}
		

	}

	private int getAtk() {
		return atk;
	}

	public static int getLevel() {
		return level;
	}

	public void heal() {
		int level = getLevel();
		int allyLevel = Ally.getLevel();
		int atk = getAtk();
		int allyDef = Ally.getDef();
		atk = (atk/level) - (allyDef/allyLevel);
		if (friendlyFire == true) {
			int target = Ally.getHealth();
			target = target + atk;
		} else {
			int target = Enemy.getHealth();
			target = target + atk;
		}

	}

	@Override
	public String currentStatus() {
		status = "HP: "+ health + "/" + healthCap + "\n" + "XP: "
	+ xp + "/" + xpCap + "\n" + "ATK: " + atk + "\n" + "DEF: "+ def 
	+ "\n" + "LUK: " +  luck + "\n" + "MAGK: " + magicka;
		return status;
	}

	public String addInv() {
		// TODO Auto-generated method stub
		return null;
	}

	public String checkInv() {
		// TODO Auto-generated method stub
		return invString;
	}

	public static int getDef() {
		return def;
	}

	@Override
	String[] facade() {
		// TODO Auto-generated method stub
		return null;
	}

	public static int getHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void levelUpMod() {
//		if(xpChanged == false) {
//			System.out.println("Enter XP required to level up: ");
//		number = kdb.nextInt();
//		xpCap = number;
//		xpChanged = true;
//		} else {
//			levelUpMod();
//		} if(xpNeededChanged == false) {
//			
//		}
		for(int i = 0; i<= 7; i++) {
			if(checkArray[i] == false) {
				System.out.println("Enter desired " + checkString[i] + "");
				
				checkInt[i]= number;
			}
		}
		
	}

}
