/**
 * 
 */
package gameer;

/**
 * 
 */
public class Enemy extends Person {

	private static int level = 1;
	private static int xp = 4;
	private static int xpCap = 10;
	private static int xpNeeded = 6;
	private static int atk = 3;
	private static int def = 2;
	private String status = "";
	
	public Enemy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void levelUp() {
		// TODO Auto-generated method stub

	}

	@Override
	void attack() {
		int level = getLevel();
		int enemyLevel = You.getLevel();
		int atk = getAtk();
		int enemyDef = You.getDef();
		atk = (atk/level) - (enemyDef/enemyLevel);

	}

	@Override
	void heal() {
		// TODO Auto-generated method stub// TODO Auto-generated method stub

	}

	@Override
	String currentStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String addInv() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String checkInv() {
		// TODO Auto-generated method stub
		return null;
	}

	public static int getLevel() {
		return level;
	}
	private int getAtk() {
		return atk;
	}

	public static int getDef() {
		return def;
	}

	public static int getHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String[] facade() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void levelUpMod() {
		// TODO Auto-generated method stub
		
	}

}
