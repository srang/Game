package physics.objects;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import main.Constants;

/**
 * Class that will represent the First Person player
 * 
 * @author Sam Rang
 *
 */

public class Player extends Combatant {
	
	public Player(ImageIcon image, int x, int y) {
		super(image, x, y);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key){
			case KeyEvent.VK_LEFT: 
				dx = -Constants.DEFAULT_SPEED;
				break;
			case KeyEvent.VK_RIGHT:
				dx = Constants.DEFAULT_SPEED;
				break;
			case KeyEvent.VK_SPACE:
				myWeapon.fire();
				break;
		}
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		switch(key){
			case KeyEvent.VK_LEFT:
				dx = 0;
				break;
			case KeyEvent.VK_RIGHT:
				dx = 0;
				break;
		}
	}
}
