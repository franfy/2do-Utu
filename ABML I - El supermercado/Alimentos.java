import java.util.Scanner;

public class Alimentos extends Producto {
	
	protected Double fecha_vencimiento;
	protected String tipo_alimento;

	public Alimentos(String nombre, double precio, String id, int stock, Double fecha_vencimiento,
			String tipo_alimento) {
		super(nombre, precio, id, stock);
		this.fecha_vencimiento = fecha_vencimiento;
		this.tipo_alimento = tipo_alimento;
	}

	public Double getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(Double fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public String getTipo_alimento() {
		return tipo_alimento;
	}

	public void setTipo_alimento(String tipo_alimento) {
		this.tipo_alimento = tipo_alimento;
	}
	
		protected void menuAlimentos(Alimentos[] array, Scanner lector, int op){
		
		do{
			
			System.out.println("Bienvenido al menu de Alimentos");
			System.out.println("1- Ingresar datos de Alimentos");
			System.out.println("2- Listar datos de la Alimentos");
			System.out.println("3- Modificar Alimento");
			System.out.println("4- Eliminar Alimentos");
			System.out.println("5- Salir");
			op = lector.nextInt();

			switch (op){
				case 1:

					limpiar();

					altaAlimento(array, lector);

					limpiar();

					break;
				case 2:

					limpiar();

					listarAlimento(array);

					limpiar();

					break;
				case 3:

					limpiar();

					editarAlimento(lector, array);

					limpiar();

					break;
				case 4:

					limpiar();

					bajaAlimento(array, lector);

					limpiar();

					break;
				default:

					limpiar();

					System.out.println("Opcion no disponible, elija otra opcion.");

					break;
			}
		} while (op != 5);
	}

	public static void altaAlimento(Alimentos[] array, Scanner lector){
		
		System.out.println("Introduzca el nombre del alimento: ");
        String nom = lector.nextLine();

        System.out.println("Introduzca el precio del alimento: ");
        double precio = lector.nextDouble();

        System.out.println("Introduzca el id del alimento: ");
        String id = lector.nextLine();
		
		System.out.println("Introduzca el stock del alimentos: ");
		int stock = lector.nextInt();

		System.out.println("Introduzca la fecha de vencimiento del alimento: ");
		double fecha_vencimiento = lector.nextDouble();

		System.out.println("Introduzca el tipo de alimento: ");
		String tipo_alimento = lector.nextLine();

        for (int i = 0; i < array.length; i++){
            if (array[i] == null){
                array[i] = new Alimentos(nom, precio, id, stock, fecha_vencimiento, tipo_alimento);
                break;
            }
			
        }

	}

	public static void listarAlimento(Alimentos[] array) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null) {

				System.out.print("Pos N°" + i );
				System.out.print(" Nombre: " + array[i].getNombre());
				System.out.print(" Precio: " + array[i].getPrecio());
				System.err.print(" ID: " + array[i].getId());
				System.out.print(" Stock: " + array[i].getStock());
				System.out.print(" Fecha vencimiento: " + array[i].getFecha_vencimiento());
				System.out.println(" Tipo alimento: " + array[i].getTipo_alimento());

			} else {
				System.out.println("Pos N°" + i + " es null");
			}
			
		}
		
	}

	public static void bajaAlimento(Alimentos[] array, Scanner lector){

		listarAlimento(array);
        System.out.println("Escriba el id del alimento a eliminar: ");
        String id = lector.nextLine();
        for (int i = 0; i < array.length; i++){
            if (array[i].getId().equals(id)){
                array[i] = null;
                break;
    		}

        }

    }

	public static void editarAlimento(Scanner lector, Alimentos array[]){

        System.out.println("Escriba el id del alimento a editar: ");
        String id = lector.nextLine();
        for (int i = 0; i < array.length; i++){
            if (array[i].getId().equals(id)){
                menuEdicion(array, lector, id, i);
                break;
            }

        }

    }

	public static void menuEdicion(Alimentos[] array, Scanner lector, String id, int i){
        String edit;
		int edit_int;
		double edit_double;
        int op = 0;
        do{

            limpiar();
            System.out.println("Bienvenido al menu de edicion del alimento!");
            System.out.println("1- Cambiar Nombre");
            System.out.println("2- Cambiar Precio");
			System.out.println("3- Cambiar Stock");
			System.out.println("4- Cambiar Tipo de alimento");
			System.out.println("5- Cambiar Fecha de vencimiento");
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
					System.out.println("Ingrese el nuevo Tipo de alimento: ");
					edit = lector.nextLine();
					array[i].setTipo_alimento(edit);
					break;

				case 5:
					System.out.println("Ingrese la nueva fecha de vencimiento: ");
					edit_double = lector.nextDouble();
					array[i].setFecha_vencimiento(edit_double);

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