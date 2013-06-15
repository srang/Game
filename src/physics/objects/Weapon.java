package physics.objects;

import javax.swing.ImageIcon;
import javax.swing.Timer;
import main.Constants;

public class Weapon extends Sprite{
	private Timer fireTimer;
	private int rateOfFire;
	public Weapon(ImageIcon image, int x, int y) {
		this(image, x, y, Constants.DEFAULT_ROF);
	}
	
	public Weapon(ImageIcon image, int x, int y, int rof) {
		super(image, x, y);
		rateOfFire = rof;
		fireTimer = new Timer(Constants.REFRESH_RATE, null);
		fireTimer.start();
	}
	
	public void fire() {
		
	}
	
	

}
