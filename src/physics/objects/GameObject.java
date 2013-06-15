package physics.objects;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;


import javax.swing.ImageIcon;
public abstract class GameObject {
	public int x,y,width,height;	
	public boolean visible;

	public GameObject(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}

	public int getTop(){
		return y;
	}
	
	public int getLeft(){
		return x;
	}
	
	public int getRight(){
		return x+width;
	}
	
	public int getBottom(){
		return y+height;
	}

	public abstract boolean update();
}
