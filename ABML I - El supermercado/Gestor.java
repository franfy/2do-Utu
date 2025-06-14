import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
        
		//arrays
        Ropa[] ropa_array = new Ropa[10];
		Electronicos[] elec_array = new Electronicos[10];
		Alimentos[] alim_array = new Alimentos[10];

		//instancias
		Ropa ropa_in = new Ropa(null, 0, null, 0, null, null, null);
		Electronicos electronicos_in = new Electronicos(null, 0, null, 0, null, null);
		Alimentos alimentos_in = new Alimentos(null, 0, null, 0, null, null);
		
		//variables
		int op = 0;

		do{

			System.out.println("Bienvenido al programa.");
			System.out.println("Elija una opcion con la que trabajar:");
			System.out.println("1- Ropa");
			System.out.println("2- Electronicos");
			System.out.println("3- Alimentos");
			System.out.println("4- Salir");
			System.out.println("Elija una opcion: ");
			op = lector.nextInt();

			switch (op) {
				case 1:

					limpiar();

					ropa_in.menuRopa(ropa_array, lector, op);

					break;

				case 2:

					limpiar();

					electronicos_in.menuElectronicos(elec_array, lector, op);

					break;

				case 3:

					limpiar();

					alimentos_in.menuAlimentos(alim_array, lector, op);

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