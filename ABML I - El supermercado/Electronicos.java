import java.util.Scanner;

public class Electronicos extends Producto {
	
	protected String modelo;
	protected String funcion;
	
	public Electronicos(String nombre, double precio, String id, int stock, String modelo, String funcion) {
		super(nombre, precio, id, stock);
		this.modelo = modelo;
		this.funcion = funcion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	protected void menuElectronicos(Electronicos[] array, Scanner lector, int op){
		
		do{
			
			System.out.println("Bienvenido al menu de los Electronicos");
			System.out.println("1- Ingresar datos de Electronicos");
			System.out.println("2- Listar datos de la Electronicos");
			System.out.println("3- Modificar Electronicos");
			System.out.println("4- Eliminar Electronicos");
			System.out.println("5- Salir");
			op = lector.nextInt();

			switch (op){
				case 1:

					limpiar();

					altaElectronicos(array, lector);

					limpiar();

					break;
				case 2:

					limpiar();

					listarElectronicos(array);

					limpiar();

					break;
				case 3:

					limpiar();

					editarElectronicos(lector, array);

					limpiar();

					break;
				case 4:

					limpiar();

					bajaElectronicos(array, lector);

					limpiar();

					break;
				default:

					limpiar();

					System.out.println("Opcion no disponible, elija otra opcion.");

					break;
			}
		} while (op != 5);
	}

	public static void altaElectronicos(Electronicos[] array, Scanner lector){
		
		System.out.println("Introduzca el nombre del Electronico: ");
        String nom = lector.nextLine();

        System.out.println("Introduzca el precio del Electronico: ");
        double precio = lector.nextDouble();

        System.out.println("Introduzca el id del Electronico: ");
        String id = lector.nextLine();
		
		System.out.println("Introduzca el stock del Electronico: ");
		int stock = lector.nextInt();

		System.out.println("Introduzca el modelo de Electronico: ");
		String modelo = lector.nextLine();

		System.out.println("Introduzca la funcion del Electronico: ");
		String funcion = lector.nextLine();

        for (int i = 0; i < array.length; i++){
            if (array[i] == null){
                array[i] = new Electronicos(nom, precio, id, stock, modelo, funcion);
                break;
            }
			
        }

	}

	public static void listarElectronicos(Electronicos[] array) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null) {

				System.out.print("Pos N°" + i );
				System.out.print(" Nombre: " + array[i].getNombre());
				System.out.print(" Precio: " + array[i].getPrecio());
				System.err.print(" ID: " + array[i].getId());
				System.out.print(" Stock: " + array[i].getStock());
				System.out.print(" Modelo: " + array[i].getModelo());
				System.out.println(" Funcion: " + array[i].getFuncion());

			} else {
				System.out.println("Pos N°" + i + " es null");
			}
			
		}
		
	}

	public static void bajaElectronicos(Electronicos[] array, Scanner lector){

		listarElectronicos(array);
        System.out.println("Escriba el id de los Electronicos a eliminar: ");
        String id = lector.nextLine();
        for (int i = 0; i < array.length; i++){
            if (array[i].getId().equals(id)){
                array[i] = null;
                break;
    		}

        }

    }

	public static void editarElectronicos(Scanner lector, Electronicos array[]){

        System.out.println("Escriba el id de los Electronicos a editar: ");
        String id = lector.nextLine();
        for (int i = 0; i < array.length; i++){
            if (array[i].getId().equals(id)){
                menuEdicion(array, lector, id, i);
                break;
            }

        }

    }

	public static void menuEdicion(Electronicos[] array, Scanner lector, String id, int i){
        String edit;
		int edit_int;
        int op = 0;
        do{

            limpiar();
            System.out.println("Bienvenido al menu de edicion de los Electronicos!");
            System.out.println("1- Cambiar Nombre");
            System.out.println("2- Cambiar Precio");
			System.out.println("3- Cambiar Stock");
			System.out.println("4- Cambiar Modelo");
			System.out.println("5- Cambiar Funcion");
            System.out.println("6- Volver al menu principal");
            System.out.println("Ingrese una opcion: ");
            op = lector.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el nuevo Nombre: ");
                    edit = lector.nextLine();
                    array[i].setNombre(edit);
                    break;
            
                case 2:
                    System.out.println("Ingrese el nuevo Precio: ");
                    edit_int= lector.nextInt();
                    array[i].setPrecio(edit_int);
                    break;

				case 3:
					System.out.println("Ingresa el nuevo Stock: ");
					edit_int = lector.nextInt();
					array[i].setStock(edit_int);
					break;

				case 4:
					System.out.println("Ingrese el nuevo Modelo: ");
					edit = lector.nextLine();
					array[i].setModelo(edit);
					break;

				case 5:
					System.out.println("Ingrese la nueva funcion: ");
					edit = lector.nextLine();
					array[i].setFuncion(edit);

                default:
                    System.out.println("Vuelva a intentarlo");
                    break;
            }

        } while (op != 6);

    }

	public static void limpiar(){
		for (int i = 0; i < 10; i ++){
			System.out.println("");
		}

	}

}