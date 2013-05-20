import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;


public class Craft extends Sprite	{
	private static final int MIN_LEFT_IMAGE = 6;
	private static final int MIN_RIGHT_IMAGE = 2;
	private static final int LOOK_RIGHT = 0;
	private static final int LOOK_LEFT = 1;
	
	public Craft(ImageIcon[] images, int x, int y) {
		super(images, x, y);
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key){
			case KeyEvent.VK_LEFT: 
				if(getDx() == 0){
					setCurrentImage(MIN_LEFT_IMAGE);
				}
				setDx(-1);
				break;
			case KeyEvent.VK_RIGHT:
				if(getDx() == 0) {
					setCurrentImage(MIN_RIGHT_IMAGE);
				}
				setDx(1);
				break;
		}
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		switch(key){
			case KeyEvent.VK_LEFT:
				setDx(0);
				setCurrentImage(LOOK_LEFT);
				break;
			case KeyEvent.VK_RIGHT:
				setDx(0);
				setCurrentImage(LOOK_RIGHT);
				break;
		}
	}

}
