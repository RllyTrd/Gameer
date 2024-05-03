/**
 * 
 */
package gameer;

import java.util.HashMap;

/**
 * 
 */
public class SkillTree {
	private HashMap<String, Integer> levelRequirements = new HashMap<>();
	public void levelGate(String place, int level) {
		levelRequirements.put(place, level);
	}

}
