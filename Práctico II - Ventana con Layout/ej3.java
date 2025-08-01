package Componentesdelaventana;
//import java.awt.*;
import javax.swing.*;

public class ej3 extends JFrame{
	
	public ej3() {
		
		this.setTitle("Registrar Usuario");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.setResizable(false);
		
		//arrays
		String[] roles = {"POB", "Estudiante"};
		
		//importaciones
		JPanel panelp = new JPanel();
		JPanel panel1v = new JPanel();
		JPanel panel2h = new JPanel();
		JPanel panel3v = new JPanel();
		JPanel panel4v = new JPanel();
		
		JLabel label1 = new JLabel("Nombre:");
		JLabel label2 = new JLabel("Apellido:");
		JLabel label3 = new JLabel("Cedula:");
		JLabel label4 = new JLabel("Edad:");
		JLabel label5 = new JLabel("Rol:");
		
		JButton boton = new JButton("Registrar");
		
		JTextField input1 = new JTextField();
		JTextField input2 = new JTextField();
		JTextField input3 = new JTextField();
		JTextField input4 = new JTextField();
		
		JComboBox rol = new JComboBox(roles);
		
		//add/seter
		//panelp.setLayout(new BorderLayout());
		panel1v.setLayout(new BoxLayout(panel1v, BoxLayout.Y_AXIS));
		panel2h.setLayout(new BoxLayout(panel2h, BoxLayout.X_AXIS));
		panel3v.setLayout(new BoxLayout(panel3v, BoxLayout.Y_AXIS));
		panel4v.setLayout(new BoxLayout(panel4v, BoxLayout.Y_AXIS));
		
		panel4v.add(input1);
		panel4v.add(input2);
		panel4v.add(input3);
		panel4v.add(input4);
		panel4v.add(rol);
		
		panel3v.add(label1);
		panel3v.add(label2);
		panel3v.add(label3);
		panel3v.add(label4);
		panel3v.add(label5);
		
		panel2h.add(panel3v);
		panel2h.add(panel4v);
		
		panel1v.add(panel2h);
		panel1v.add(boton);
		
		panelp.add(panel1v);
		
		this.add(panelp);
		
		
	}

}
