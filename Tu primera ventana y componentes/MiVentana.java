package ejercicioVentanas;
import javax.swing.*;

public class MiVentana extends JFrame{
	
	public MiVentana() {
		this.setTitle("Bienvenido - Franco Faccelli");//nombre de la ventana
		this.setSize(600, 400);//tamano de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//accion default al cerrar
		this.setLocationRelativeTo(null);//posiciona la ventana al centro
		
		
		//String[] nom = {"op1", "op2"};
		JLabel etiqueta = new JLabel("Bienvenido a este programa       ");// crea una etiqueta
		JLabel etiqueta2 = new JLabel("Nombre:");
		JButton boton = new JButton("Aceptar");// crea un boton
		JPanel panel = new JPanel();
		JTextField input_name = new JTextField("espacio");
		//JTextField input_pass = new JTextField("espacio");
		//JComboBox box = new JComboBox(nom);
		
		//this.add(etiqueta);// anado la etiqueta a la ventana
		//this.add(boton);// anado el boton a la ventana
		this.add(panel);
		
		panel.add(etiqueta);
		input_name.setColumns(5);
		panel.add(etiqueta2);
		panel.add(input_name);
		//input_pass.setColumns(5);
		
		//panel.add(input_pass);
		//panel.add(box);
		panel.add(boton);
		
	}
}
