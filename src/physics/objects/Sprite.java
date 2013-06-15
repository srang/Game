package physics.objects;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.Console;

import javax.swing.ImageIcon;




public abstract class Sprite extends GameObject{

	private ImageIcon myImage;
	public int dx, dy, ddx, ddy;

	public Sprite(ImageIcon image, int x, int y, int w, int h, int dx, int dy) {
		this(image, x, y, w, h);
		this.dx = dx;
		this.dy = dy;
	}
	
	public Sprite(ImageIcon image, int x, int y){
		this(image, x, y, image.getIconWidth(), image.getIconHeight());
	}
	
	public Sprite(ImageIcon image, int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	public void paint(Graphics g){
		if(visible){
			Graphics2D g2d = (Graphics2D) g;
			g2d.drawImage(myImage.getImage(), x, y, null);
		}
	}

//	public void collides(GameObject obj, Block.Collision c) {
//		if((obj.getLeft() < getRight() && obj.getLeft() > obj.getRight()) ||//object approaches from the right
//				(obj.getRight() > getLeft() && obj.getRight() < getRight()) ||//object approaches from the right
//				(obj.getRight() > getRight() && obj.getLeft() < getLeft())){ //object contains this
//			if((obj.getBottom() > getTop() && obj.getBottom() < obj.getBottom()) || //the bottom edge is within 
//					(obj.getTop() < getBottom() && obj.getTop() > getTop()) || //the top edge is within
//					(obj.getTop() < getTop() && obj.getBottom() > getBottom())){ //object contains this
//				
//				//set type of collision
//			}
//		}
//	}
	
	public boolean update(){
		boolean needToPaint = false;
		if(dx!=0 || dy!=0){
			x += dx;
			y += dy;
			needToPaint = true;
		}
		return true;
	}
}
