import javax.swing.ImageIcon;


public class Bullet extends GameObject{
	public Bullet(ImageIcon img, int x, int y, int dx, int dy){
		super(img, x, y);
		setDx(dx);
		setDy(dy);
	}

}
