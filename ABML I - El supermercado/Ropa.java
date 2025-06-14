import java.util.Scanner;

public class Ropa extends Producto{
	
	protected String marca;
	protected String material;
	protected String talle;
	
	public Ropa(String nombre, double precio, String id, int stock, String marca, String material, String talle) {
		super(nombre, precio, id, stock);
		
		this.marca = marca;
		this.material = material;
		this.talle = material;
					
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	protected void menuRopa(Ropa[] ropa_array, Scanner lector, int op){
		
		do{
			
			System.out.println("Bienvenido al menu de Ropa");
			System.out.println("1- Ingresar datos de la ropa");
			System.out.println("2- Listar datos de la ropa");
			System.out.println("3- Modificar ropa");
			System.out.println("4- Eliminar ropa");
			System.out.println("5- Salir");
			op = lector.nextInt();

			switch (op){
				case 1:

					limpiar();

					altaRopa(ropa_array, lector);

					limpiar();

					break;
				case 2:

					limpiar();

					listarRopa(ropa_array);

					limpiar();

					break;
				case 3:

					limpiar();

					editarRopa(lector, ropa_array);

					limpiar();

					break;
				case 4:

					limpiar();

					bajaRopa(ropa_array, lector);

					limpiar();

					break;
				default:

					limpiar();

					System.out.println("Opcion no disponible, elija otra opcion.");

					break;
			}
		} while (op != 5);
	}

	public static void altaRopa(Ropa[] ropa_array, Scanner lector){
		
		System.out.println("Introduzca el nombre de la ropa: ");
        String nom = lector.nextLine();

        System.out.println("Introduzca el precio de la ropa: ");
        double precio = lector.nextDouble();

        System.out.println("Introduzca el id de la ropa: ");
        String id = lector.nextLine();
		
		System.out.println("Introduzca el stock de la ropa: ");
		int stock = lector.nextInt();
		
		System.out.println("Introduzca la marca de la ropa: ");
		String marca = lector.nextLine();
		
		System.out.println("Introduzca el material de la ropa: ");
		String material = lector.nextLine();
		
		System.out.println("Introduzca el talle de la ropa: ");
		String talle = lector.nextLine();

        for (int i = 0; i < ropa_array.length; i++){
            if (ropa_array[i] == null){
                ropa_array[i] = new Ropa(nom, precio, id, stock, marca, material, talle);
                break;
            }
			
        }

	}

	public static void listarRopa(Ropa[] ropa_array) {
		
		for(int i=0; i<ropa_array.length; i++) {
			if(ropa_array[i] != null) {
				System.out.print("Pos N°" + i );
				System.out.print(" Nombre: " + ropa_array[i].getNombre());
				System.out.print(" Precio: " + ropa_array[i].getPrecio());
				System.err.print(" ID: " + ropa_array[i].getId());
				System.out.print(" Stock: " + ropa_array[i].getStock());
				System.out.print(" Marca: " + ropa_array[i].getMarca());
				System.out.print(" Material: " + ropa_array[i].getMaterial());
				System.out.println(" Talle: " + ropa_array[i].getTalle());
			} else {
				System.out.println("Pos N°" + i + " es null");
			}
			
		}
		
	}

	public static void bajaRopa(Ropa[] ropa_array, Scanner lector){

		listarRopa(ropa_array);
        System.out.println("Escriba el id de la ropa a eliminar: ");
        String id = lector.nextLine();
        for (int i = 0; i < ropa_array.length; i++){
            if (ropa_array[i].getId().equals(id)){
                ropa_array[i] = null;
                break;
    		}

        }

    }

	public static void editarRopa(Scanner lector, Ropa arreglo[]){

        System.out.println("Escriba la cedula del alumno a editar: ");
        String id = lector.nextLine();
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i].getId().equals(id)){
                menuEdicion(arreglo, lector, id, i);
                break;
            }

        }

    }

	public static void menuEdicion(Ropa[] arreglo, Scanner lector, String id, int i){
        String edit;
		int edit_int;
        int op = 0;
        do{

            limpiar();
            System.out.println("Bienvenido al menu de edicion de la ropa!");
            System.out.println("1- Cambiar Nombre");
            System.out.println("2- Cambiar Precio");
			System.out.println("3- Cambiar Stock");
			System.out.println("4- Cambiar Talle");
            System.out.println("5- Volver al menu principal");
            System.out.println("Ingrese una opcion: ");
            op = lector.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el nuevo Nombre: ");
                    edit = lector.nextLine();
                    arreglo[i].setNombre(edit);
                    break;
            
                case 2:
                    System.out.println("Ingrese el nuevo Precio: ");
                    edit_int= lector.nextInt();
                    arreglo[i].setPrecio(edit_int);
                    break;

				case 3:
					System.out.println("Ingresa el nuevo Stock: ");
					edit_int = lector.nextInt();
					arreglo[i].setStock(edit_int);
					break;

				case 4:
					System.out.println("Ingrese el nuevo Talle: ");
					edit = lector.nextLine();
					arreglo[i].setTalle(edit);
					break;

                default:
                    System.out.println("Vuelva a intentarlo");
                    break;
            }

        } while (op != 5);

    }

	public static void limpiar(){
		for (int i = 0; i < 10; i ++){
			System.out.println("");
		}

	}
	
}