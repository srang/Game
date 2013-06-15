package physics.objects;

import javax.swing.ImageIcon;


public class Block extends Sprite{	
	public Block(ImageIcon img, int x, int y, int w, int h) {
		super(img, x, y, w, h);
	}
	
	public Block(ImageIcon img, int x, int y) {
		super(img, x, y);
	}
}
