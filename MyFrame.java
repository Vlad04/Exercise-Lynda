import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{

	private PanelDibujo panel;
	private PanelControles controles;
	
	public MyFrame(String nombre){
		
		super(nombre);
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// layouts - flow, border
		BorderLayout fl = new BorderLayout();
		Container c = getContentPane();
		
		c.setLayout(fl);
		
		panel = new PanelDibujo();
		controles = new PanelControles(panel);
		
		c.add(controles, BorderLayout.WEST);
		c.add(panel, BorderLayout.CENTER);
		//pack();
	}
}
