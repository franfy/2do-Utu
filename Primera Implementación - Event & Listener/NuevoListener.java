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
		JLabel label1 = new JLabel("Nombre:");
		JLabel label2 = new JLabel("Apellido:");
		JTextField input1 = new JTextField();
		JTextField input2 = new JTextField();
		JButton boton = new JButton("Aceptar");
		
		
		//seters para los paneles
		//panelp.setLayout(new BorderLayout());
		panelp.add(panelv1);
		
		
		//panel vertical 1 
		panelv1.setLayout(new BoxLayout(panelv1, BoxLayout.Y_AXIS));
		panelv1.add(panelh1);
		panelv1.add(panelh2);
		panelv1.add(boton);
		
		
		//panel horizontal 1
		panelh1.setLayout(new BoxLayout(panelh1, BoxLayout.X_AXIS));
		panelh1.add(label1);
		panelh1.add(input1);
		
		
		//panel horizontal 2
		panelh2.setLayout(new BoxLayout(panelh2, BoxLayout.X_AXIS));
		panelh2.add(label2);
		panelh2.add(input2);
		
		
		//Actions listener
		botonpresionado(boton, input1, input2);
		
		
		//Panel final
		this.add(panelp);
				
	}
	
	//Funcion para separar el action listener de la ventana principal
	public static void botonpresionado(JButton boton, JTextField input1, JTextField input2) {
		
		//Se hace referencia al boton pasado por parametros para asignarle un evento
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				var valor1 = input1.getText();//Se declara variable input1 y se auto asigna un tipo dependiendo de que valor reciba 
				var valor2 = input2.getText();//Se declara variable input2 y se auto asigna un tipo dependiendo de que valor reciba
				System.out.println(valor1);
				System.out.println(valor2);
				System.out.println("Datos mostrados correctamente");
				
			}
		});
		
	}
}
