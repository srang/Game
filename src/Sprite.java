import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.Console;

import javax.swing.ImageIcon;



public class Sprite extends GameObject{
	private static final int MAX_LEFT_IMAGE = 9;
	private static final int MIN_LEFT_IMAGE = 6;
	private static final int MAX_RIGHT_IMAGE = 5;
	private static final int MIN_RIGHT_IMAGE = 2;
	private static final int LOOK_RIGHT = 0;
	private static final int LOOK_LEFT = 1;
	private static final int MAX_MOVEMENT_COUNTER = 30;
	
	private int currentImage,movementCounter;	
	private ImageIcon[] myImages;
	
	public Sprite(ImageIcon[] images, int x, int y){
		super(images[0], x, y);
	}

	@Override
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(getCurrentImage(), getX(), getY(), null);
	}

	public void setCurrentImage(int img){
		currentImage = img;
	}
	
	private Image getCurrentImage(){
		if (getDx() > 0){
			movementCounter++;
			if(movementCounter>MAX_MOVEMENT_COUNTER){
				currentImage++;
				movementCounter=0;
			}
			if(currentImage>MAX_RIGHT_IMAGE){
				currentImage = MIN_RIGHT_IMAGE;
			}
		}
		else if (getDx() < 0){
			movementCounter++;
			if(movementCounter>MAX_MOVEMENT_COUNTER){
				currentImage++;
				movementCounter = 0;
			}
			if(currentImage>MAX_LEFT_IMAGE){
				currentImage = MIN_LEFT_IMAGE;
			}
		}
		else {
			movementCounter = 0;
		}
		return myImages[currentImage].getImage();
	}
}
