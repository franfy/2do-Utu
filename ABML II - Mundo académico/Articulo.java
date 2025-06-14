import java.util.Scanner;

public class Articulo extends Publicacion{

    protected String tema;

    public Articulo(String fecha_estreno, String nombre, String escritor, String id, int precio, String tema) {
        super(fecha_estreno, nombre, escritor, id ,precio);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    protected void menuArticulo(Articulo[] array, Scanner lector, int op){
		
		do{
			
			System.out.println("Bienvenido al menu del Articulo");
			System.out.println("1- Ingresar datos del Articulo");
			System.out.println("2- Listar datos del Articulo");
			System.out.println("3- Modificar Articulo");
			System.out.println("4- Eliminar Articulo");
			System.out.println("5- Salir");
			op = lector.nextInt();

			switch (op){
				case 1:

					limpiar();

					altaArticulo(array, lector);

					limpiar();

					break;
				case 2:

					limpiar();

					listarArticulo(array);

					limpiar();

					break;
				case 3:

					limpiar();

					editarArticulo(lector, array);

					limpiar();

					break;
				case 4:

					limpiar();

					bajaArticulo(array, lector);

					limpiar();

					break;
				default:

					limpiar();

					System.out.println("Opcion no disponible, elija otra opcion.");

					break;
			}
		} while (op != 5);
	}

	public static void altaArticulo(Articulo[] array, Scanner lector){
		
		System.out.println("Introduzca el nombre del articulo: ");
		String nombre = lector.nextLine();

		System.out.println("Introduzca el nombre de la editorial: ");
		String editorial = lector.nextLine();

		System.out.println("Introduzca el precio del articulo: ");
		int precio = lector.nextInt();

		System.out.println("Introduzca el id del artiuclo: ");
		String id = lector.nextLine();

		System.out.println("Introduzca la fecha de estreno del articulo: ");
		String fecha = lector.nextLine();

		System.out.println("Introduzca el tema del articulo: ");
		String tema = lector.nextLine();
		
        for (int i = 0; i < array.length; i++){
            if (array[i] == null){
                array[i] = new Articulo(fecha, nombre, editorial, id, precio, tema);
                break;
            }
			
        }

	}

	public static void listarArticulo(Articulo[] array) {
		
		for(int i=0; i<array.length; i++) {
			if(array[i] != null) {
				
				System.out.print("Pos N°" + i );
				System.out.print(" Nombre: " + array[i].getNombre());
				System.out.print(" Editorial: " + array[i].getEditorial());
				System.out.print(" ID: " + array[i].getId());
				System.out.print(" Precio: " + array[i].getPrecio());
				System.out.print(" Estreno: " + array[i].getFecha_estreno());
				System.err.println(" Tema: " + array[i].getTema());
				
			} else {
				System.out.println("Pos N°" + i + " es null");
			}
			
		}
		
	}

	public static void bajaArticulo(Articulo[] array, Scanner lector){

		listarArticulo(array);
        System.out.println("Escriba el id del articulo a eliminar: ");
        String id = lector.nextLine();
        for (int i = 0; i < array.length; i++){
            if (array[i].getId().equals(id)){
                array[i] = null;
                break;
    		}

        }

    }

	public static void editarArticulo(Scanner lector, Articulo arreglo[]){

        System.out.println("Escriba el id del articulo a editar: ");
        String id = lector.nextLine();
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i].getId().equals(id)){
                menuEdicion(arreglo, lector, id, i);
                break;
            }

        }

    }

	public static void menuEdicion(Articulo[] array, Scanner lector, String id, int i){
        String edit;
		int edit_int;
        int op = 0;
        do{

            limpiar();
            System.out.println("Bienvenido al menu de edicion del articulo!");
            System.out.println("1- Cambiar Nombre");
            System.out.println("2- Cambiar Precio");
			System.out.println("3- Cambiar Fecha de estreno");
			System.out.println("4- Cambiar Editorial");
			System.out.println("5- Cambiar Tema");
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
					System.out.println("Ingrese la nueva Fecha de estreno: ");
					edit = lector.nextLine();
					array[i].setFecha_estreno(edit);
					break;

				case 4:
					System.out.println("Ingrese la nueva Editorial: ");
					edit = lector.nextLine();
					array[i].setEditorial(edit);
					break;

				case 5:
					System.out.println("Ingrese el nuevo Tema: ");
					edit = lector.nextLine();
					array[i].setTema(edit);
					break;

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
