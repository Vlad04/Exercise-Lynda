import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelControles extends JPanel implements ActionListener {

	private JButton boton1;
	private JButton boton2;
	private PanelDibujo pd;
	
	public PanelControles(PanelDibujo pd){
		
		super();
		this.pd = pd;
		boton1 = new JButton("detener");
		boton2 = new JButton("animar");
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		
		add(boton1);
		add(boton2);
		boton1.addActionListener(this);
		boton2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == boton1){
			
			pd.detenerAnimacion();
		} else if(e.getSource() == boton2){
			
			pd.seguirAnimacion();
		}
		
	}
}
