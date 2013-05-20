import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Board extends JPanel implements ActionListener{
	private static Craft craft;
	private Timer timer;
	public Board() {
		addKeyListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.BLACK);
		setDoubleBuffered(true);
		
		ImageIcon[] craftImages = {
				new ImageIcon(this.getClass().getResource("photos/halo look right.png")),
				new ImageIcon(this.getClass().getResource("photos/halo look left.png")),
				new ImageIcon(this.getClass().getResource("photos/halo right 1.png")),
				new ImageIcon(this.getClass().getResource("photos/halo right 2.png")),
				new ImageIcon(this.getClass().getResource("photos/halo right 3.png")),
				new ImageIcon(this.getClass().getResource("photos/halo right 4.png")),
				new ImageIcon(this.getClass().getResource("photos/halo left 1.png")),
				new ImageIcon(this.getClass().getResource("photos/halo left 2.png")),
				new ImageIcon(this.getClass().getResource("photos/halo left 3.png")),
				new ImageIcon(this.getClass().getResource("photos/halo left 4.png")),
				
		};
		craft = new Craft(craftImages, 100, 100);
		
		timer = new Timer(5, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		craft.paint(g);
		Toolkit.getDefaultToolkit().sync();
		g.dispose();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		craft.update();
		repaint();
		
	}

	private class TAdapter extends KeyAdapter {
		public void keyReleased(KeyEvent e){ 
			craft.keyReleased(e);
		}
		public void keyPressed(KeyEvent e) {
			craft.keyPressed(e);
		}
	}
}
