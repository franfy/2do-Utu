package PrimeraImplementacionEventListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class NuevoListener extends JFrame{
	
	public NuevoListener() {
		this.setTitle("Mi ventana programando");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		
		//imports
		JPanel panelp = new JPanel();
		JPanel panelv1 = new JPanel();
		JPanel panelh1 = new JPanel();
		JPanel panelh2 = new JPanel();
		JPanel panelh3 = new JPanel();
		JLabel label1 = new JLabel("Numero 1:");
		JLabel label2 = new JLabel("Numero 2:");
		JLabel label3 = new JLabel("");
		JTextField input1 = new JTextField();
		JTextField input2 = new JTextField();
		JButton boton1 = new JButton("+");
		JButton boton2 = new JButton("-");
		JButton boton3 = new JButton("X");
		JButton boton4 = new JButton("/");
		
		
		panelp.add(panelv1);
		
		
		//panel vertical 1 
		panelv1.setLayout(new BoxLayout(panelv1, BoxLayout.Y_AXIS));
		panelv1.add(panelh1);
		panelv1.add(panelh2);
		panelv1.add(label3);
		panelv1.add(panelh3);
		
		
		//panel horizontal 1
		panelh1.setLayout(new BoxLayout(panelh1, BoxLayout.X_AXIS));
		panelh1.add(label1);
		panelh1.add(input1);
		
		
		//panel horizontal 2
		panelh2.setLayout(new BoxLayout(panelh2, BoxLayout.X_AXIS));
		panelh2.add(label2);
		panelh2.add(input2);
		
		
		//panel horizontal 3
		panelh3.add(boton1);
		panelh3.add(boton2);
		panelh3.add(boton3);
		panelh3.add(boton4);
		
		
		//Action Listeners
		suma(boton1, label3, input1, input2);
		resta(boton2, label3, input1, input2);
		multiplicacion(boton3, label3, input1, input2);
		division(boton4, label3, input1, input2);
		
		
		//Panel final
		this.add(panelp);
				
	}
	
	public static void suma(JButton boton, JLabel label, JTextField input1, JTextField input2) {
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				var num1 = Integer.parseInt(input1.getText());//convierte String a int
				var num2 = Integer.parseInt(input2.getText());
				double res = num1 + num2;//Suma valores
				var mostrar = String.valueOf(res);//convierte double a String
				label.setText("La suma es: " + mostrar);//Muestra valores en el label
				
			}
		});
	}
	
	
	public static void resta(JButton boton, JLabel label, JTextField input1, JTextField input2) {
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				var num1 = Integer.parseInt(input1.getText());//Convierte String a int
				var num2 = Integer.parseInt(input2.getText());
				double res = num1 - num2;//Resta valores
				var mostrar = String.valueOf(res);//Convierte double a String
				label.setText("La resta es: " + mostrar);//Muestra valores en el label
				
			}
		});	
	}
	
	
	public static void multiplicacion(JButton boton, JLabel label, JTextField input1, JTextField input2) {
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				var num1 = Integer.parseInt(input1.getText());//Convierte String a int
				var num2 = Integer.parseInt(input2.getText());
				double res = num1 * num2;//Suma valores
				var mostrar = String.valueOf(res);//Convierte double a String
				label.setText("La multiplicacion es: " + mostrar);//Muestra valores en el label
				
			}
		});
	}

	
	public static void division(JButton boton, JLabel label, JTextField input1, JTextField input2) {
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				var num1 = Integer.parseInt(input1.getText());//Convierte String a int
				var num2 = Integer.parseInt(input2.getText());
				double res = num1 / num2;//Suma valores
				var mostrar = String.valueOf(res);//Convierte double a String
				label.setText("La division es: " + mostrar);//Muestra valores en el label
				
			}
		});
	}
	
}
