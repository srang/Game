package main;

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

import physics.objects.Player;

public class Game extends JPanel implements ActionListener{
	private static Player p1;
	private Timer timer;
	public Game() {
		addKeyListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.BLACK);
		setDoubleBuffered(true);
		
		
		
		timer = new Timer(Constants.REFRESH_RATE, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		p1.paint(g);
		Toolkit.getDefaultToolkit().sync();
		g.dispose();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		p1.update();
		repaint();
		
	}

	private class TAdapter extends KeyAdapter {
		public void keyReleased(KeyEvent e){ 
			p1.keyReleased(e);
		}
		public void keyPressed(KeyEvent e) {
			p1.keyPressed(e);
		}
	}
}
