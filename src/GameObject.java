import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;


import javax.swing.ImageIcon;
public abstract class GameObject {

	private static final int MAX_LEFT_IMAGE = 9;
	private static final int MIN_LEFT_IMAGE = 6;
	private static final int MAX_RIGHT_IMAGE = 5;
	private static final int MIN_RIGHT_IMAGE = 2;
	private static final int LOOK_RIGHT = 0;
	private static final int LOOK_LEFT = 1;
	private static final int MAX_MOVEMENT_COUNTER = 30;

	private int x,y,dx,dy;	
	private boolean visible;
	private ImageIcon myImage;

	public GameObject(ImageIcon img, int x, int y){
		myImage = img;
		this.x = x;
		this.y = y;
		dx = 0;
		dy = 0;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getDx(){
		return dx;
	}
	public void setDx(int dx){
		this.dx = dx;
	}
	public int getDy(){
		return dy;
	}
	public void setDy(int dy){
		this.dy = dy;
	}
	public boolean isVisible(){
		return visible;
	}
	public void setVisible(boolean visible){
		this.visible = visible;
	}
	
	public void paint(Graphics g){
		if(visible){
			Graphics2D g2d = (Graphics2D) g;
			g2d.drawImage(myImage.getImage(),getX(), getY(), null);
		}
	}

	public boolean update() {
		boolean needToPaint = false;
		if(dx!=0 || dy!=0){
			x += dx;
			y += dy;
			needToPaint = true;
		}
		return true;
	}
}
