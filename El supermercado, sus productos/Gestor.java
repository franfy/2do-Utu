import java.util.Scanner;
public class Gestor {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
        
		Ropa ropa_in = new Ropa(null, 0, null,(int) 0, null, null, null);//String nombre, double precio, String id, int stock, String marca, String material, String talle
		Electronicos Electronicos_in = new Electronicos(null,0,null,0,null,null);//String nombre, double precio, String id, int stock, String modelo, String funcion
		Alimentos Alimentos_in = new Alimentos(null,0,null,(int)0,(double) 0, null);//String nombre, double precio, String id, int stock, Double fecha_vencimiento,String tipo_alimento
		
	
    	System.out.println("Ingrese el nombre de la prenda:");
        ropa_in.nombre = lector.next();/*lo mejor seria utilizar los metodos set para poder ingresar los datos ya que es mas seguro
        Pero te obliga a tener que crear variables y pasarlas como argumento, eso no es malo pero te gasta mas memoria
        Y en este ejercicio en particular no es necesario, lo mismo es con el 2,3,4 y 5.*/
        System.out.println("Ingrese el precio:");
        ropa_in.precio = lector.nextDouble();

        System.out.println("Ingrese el ID:");
        ropa_in.id = lector.next();

        System.out.println("Ingrese el stock:");
        ropa_in.stock = lector.nextInt();

        System.out.println("Ingrese el nombre de la marca:");
        ropa_in.marca = lector.next();

        System.out.println("Ingrese el material:");
        ropa_in.material = lector.next();

        System.out.println("Ingrese el talle:");
        ropa_in.talle = lector.next();

	        
        System.out.println("Ingrese el nombre del producto:");
        Electronicos_in.nombre = lector.next();

        System.out.println("Ingrese el precio:");
        Electronicos_in.precio = lector.nextDouble();

        System.out.println("Ingrese el ID:");
        Electronicos_in.id = lector.next();

        System.out.println("Ingrese el stock:");
        Electronicos_in.stock = lector.nextInt();

        System.out.println("Ingrese el modelo:");
        Electronicos_in.modelo = lector.next();

        System.out.println("Ingrese la función principal:");
        Electronicos_in.funcion = lector.next();

	       
        System.out.println("Ingrese el nombre del alimento:");
	    Alimentos_in.nombre = lector.next();

        System.out.println("Ingrese el precio:");
        Alimentos_in.precio = lector.nextDouble();

        System.out.println("Ingrese el ID:");
        Alimentos_in.id = lector.next();

        System.out.println("Ingrese el stock:");
        Alimentos_in.stock = lector.nextInt();

        System.out.println("Ingrese la fecha de vencimiento");
        Alimentos_in.fecha_vencimiento = lector.nextDouble();

	    System.out.println("Ingrese el tipo de alimento:");
	    Alimentos_in.tipo_alimento = lector.next();

	    lector.close();
	   
	    System.out.println("Datos ingresados:");
	    System.out.println("Ropa: " + ropa_in.nombre + ", " + ropa_in.precio + ", " + ropa_in.id + ", " + ropa_in.stock + ", " + ropa_in.marca + ", " + ropa_in.material + ", " + ropa_in.talle);
	    System.out.println("Electrónicos: " + Electronicos_in.nombre + ", " + Electronicos_in.precio + ", " + Electronicos_in.id + ", " + Electronicos_in.stock + ", " + Electronicos_in.modelo + ", " + Electronicos_in.funcion);
	    System.out.println("Alimentos: " + Alimentos_in.nombre + ", " + Alimentos_in.precio + ", " + Alimentos_in.id + ", " + Alimentos_in.stock + ", " + Alimentos_in.fecha_vencimiento + ", " + Alimentos_in.tipo_alimento);
    }		
}