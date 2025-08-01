package Componentesdelaventana;
import java.awt.*;
import javax.swing.*;

public class ej2 extends JFrame{
	
	public ej2() {
		this.setTitle("Mi ventana");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		//this.setLayout(new BorderLayout());
		
		
		//imports
		JPanel panelP = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		JButton buton1 = new JButton();
		JButton buton2 = new JButton();
		JButton buton3 = new JButton();
		JButton buton4 = new JButton();
		JButton buton5 = new JButton();
		
		//JSeparator separadorv = new JSeparator(JSeparator.VERTICAL);
		
		
		
		//arrays
		String [] encabezado = {"ISBN", "Titulo", "Autor", "Materia"};
		Object [][] tabla_contenido = {
			{"Nacional", "Nacional gana", "Penarol", "Nacional"},
			{null, null, null, null}
		};
		
		
		//tabla
		JTable tabla = new JTable(tabla_contenido, encabezado);
		JScrollPane panelDesplazable = new JScrollPane(tabla);
		
		
		//seter
		buton1.setText("JButton 1");
		
		buton2.setText("JButton 2");
		
		buton3.setText("JButton 3");
		
		buton4.setText("JButton 4");
		
		buton5.setText("JButton 5");
		
		//separadorv.setPreferredSize(new Dimension(0, 0));
		
		
		panel1.setBackground(Color.GREEN);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel1.add(buton1);
		//panel1.add(separadorv);
		panel1.add(buton5);
		
		panel2.setBackground(Color.ORANGE);
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
		panel2.add(buton2);
		panel2.add(buton3);
		panel2.add(buton4);
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		panel3.setBackground(Color.GRAY);
		panel3.setLayout(new BorderLayout());
		panel3.add(panelDesplazable);
		
		panelP.setLayout(new BorderLayout());
		panelP.add(panel1, BorderLayout.WEST);
		panelP.add(panel2, BorderLayout.NORTH);
		panelP.add(panel3, BorderLayout.CENTER);
		this.add(panelP);
		
	}

}
