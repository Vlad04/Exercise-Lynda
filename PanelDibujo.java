import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class PanelDibujo extends JPanel implements Runnable, MouseListener {

	Thread hilo;
	int x, y;
	ImageIcon imagen;
	
	public PanelDibujo(){
		super();
		setSize(400, 480);
		x = y = 0;
		
		hilo = new Thread(this);
		hilo.start();
		addMouseListener(this);
		imagen = new ImageIcon("arbol.jpg");
	}
	
	@Override
	public void paint(Graphics g){
	
		super.paint(g);
		
		g.setColor(Color.WHITE);
		//g.fillRect(0, 0, getWidth(), getHeight());
		g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), null);
		
		g.setColor(Color.RED);
		g.fillOval(x, y, getWidth() / 2, getHeight() / 2);

		g.setColor(Color.BLACK);
		g.drawString("Hola Mundo", getWidth() / 2, getHeight() / 2);
		g.drawLine(0, 0, getWidth()/2, getHeight()/2);
		
		// rectangulos, circulos, lineas, texto, imagenes
	}

	@Override
	public void run() {
		
		while(true){
			
			try {
				// animacion - cambio en coordenadas
				x++;
				repaint();
				Thread.sleep(10);
				
			} catch(Exception e) {
				
			}
			
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		hilo.suspend();
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		hilo.resume();
	}
	
	public void detenerAnimacion(){
		
		hilo.suspend();
	}
	
	public void seguirAnimacion(){
		
		hilo.resume();
	}
}
