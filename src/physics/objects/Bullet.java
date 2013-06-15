package physics.objects;
import javax.swing.ImageIcon;


public class Bullet extends Sprite{
	public int initialX;
	public int range;
	public Bullet(ImageIcon img, int x, int y, int w, int h, int dx, int dy, int range){
		super(img, x, y, w, h, dx, dy);
		initialX = x;
		this.range = range;
	}
	public Bullet(ImageIcon img, int x, int y, int dx, int range){
		super(img, x, y);
		this.range = range;
		this.dx = dx;
	}
	public boolean update(){
		boolean update = super.update();
		if(Math.abs(x-initialX)>range){
			visible = false;
		}
		return update;
	}

}
