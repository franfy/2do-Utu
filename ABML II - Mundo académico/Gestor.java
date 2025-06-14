import java.util.Scanner;

public class Gestor {

    public static void main(String[] args) {
        
        // Arrays
        Libro[] libro_array = new Libro[10];
        Revista[] revista_array = new Revista[10];
		Articulo[] articulo_array = new Articulo[10];

        // Instancias
        Scanner lector = new Scanner(System.in);
		Libro libro_in = new Libro(null, null, null, null, 0, 0, null);
		Revista revista_in = new Revista(null, null, null, null, 0, 0, 0, 0);
		Articulo articulo_in = new Articulo(null, null, null, null, 0, null);

		// Variables
		int op = 0;

        do{

			System.out.println("Bienvenido al programa.");
			System.out.println("Elija una opcion con la que trabajar:");
			System.out.println("1- Libro");
			System.out.println("2- Revista");
			System.out.println("3- Articulo");
			System.out.println("4- Salir");
			System.out.println("Elija una opcion: ");
			op = lector.nextInt();

			switch (op) {
				case 1:

					limpiar();

					libro_in.menuLibro(libro_array, lector, op);

					break;

				case 2:

					limpiar();

					revista_in.menuRevista(revista_array, lector, op);

					break;

				case 3:

					limpiar();

					articulo_in.menuArticulo(articulo_array, lector, op);

					break;

				case 4:

					limpiar();

					System.out.println("Fin del programa");

					break;

				default:

					limpiar();

					System.out.println("Opcion no disponible");

					break;

			}

		} while (op != 4);

    }

	public static void limpiar(){
		for (int i = 0; i < 10; i++){
			System.out.println("");
		}
	}
}
