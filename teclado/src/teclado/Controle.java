package teclado;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Controle extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void Mover() {
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
				
			}
		});
	}

}
