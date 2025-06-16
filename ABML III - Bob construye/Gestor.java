import java.util.Scanner;

public class Gestor {

    public static void main(String[] args) {
        
        // Arrays
        Casa[] casa_array = new Casa[10];
        Apartamento[] apar_array = new Apartamento[10];

        // Instancias
        Scanner lector = new Scanner(System.in);
        Casa casa_in = new Casa(null, null, null, 0, null, false, 0, false, 0);
        Apartamento apartamento_in = new Apartamento(null, null, null, 0, null, 0, 0, false, false);

		// Variables
		int op = 0;

        do{

			System.out.println("Bienvenido al programa.");
			System.out.println("Elija una opcion con la que trabajar:");
			System.out.println("1- Casa");
			System.out.println("2- Apartamento");
			System.out.println("3- Salir");
			System.out.println("Elija una opcion: ");
			op = lector.nextInt();

			switch (op) {
				case 1:

					limpiar();

                    casa_in.menuCasa(casa_array, lector, op);

					break;

				case 2:

					limpiar();

					apartamento_in.menuApartamento(apar_array, lector, op);

					break;

				case 3:

					limpiar();

					System.out.println("Fin del programa");

					break;

				default:

					limpiar();

					System.out.println("Opcion no disponible");

					break;

			}

		} while (op != 3);

    }

	public static void limpiar(){
		for (int i = 0; i < 10; i++){
			System.out.println("");
		}

	}

}
