package physics.objects;

import javax.swing.ImageIcon;

/**
 * This class is for objects that will have more extensive animation 
 * abilities and objects that will be bound to a weapon (or a null 
 * weapon if that applies). Helps generalize certain types of objects
 * for collisions.
 * 
 * @author Sam Rang
 *
 */
public abstract class Combatant extends Sprite {
	public Weapon myWeapon;
	public Combatant(ImageIcon image, int x, int y) {
		super(image, x, y);
	}
	
	public Combatant(ImageIcon image, int x, int y, Weapon wep){
		this(image, x, y);
		myWeapon = wep;
	}
	
}
