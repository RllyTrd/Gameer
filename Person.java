/**
 * 
 */
package gameer;

import java.util.Scanner;

/**
 * 
 */
public abstract class Person {
	Scanner kdb;
	int happiness;
	int height;
	int brawling;
	int intelligence;
	int charisma;
	int luck;
	int magicka;
	int health;
	boolean friendlyFire;
	boolean invLock;
	String[] inv;
	int hairColor, hairTexture, hairLength, eyeColor, skinColor, pronouns;
	String hairC, hairT, hairL, eyeC, skinC, pronounsA, pronounsB;
	
	public abstract void levelUp();
	public abstract void levelUpMod();
	abstract void attack();
	abstract void heal();
	abstract String currentStatus();
	abstract String addInv();
	abstract String checkInv();
	abstract String[] facade();

}
