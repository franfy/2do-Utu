import java.util.Scanner;

public class Libro extends Publicacion{

    protected int nro_paginas;
    protected String genero;

    public Libro(String fecha_estreno, String nombre, String editorial, String id, int precio, int nro_paginas, String genero) {
        super(fecha_estreno, nombre, editorial, id, precio);
        this.nro_paginas = nro_paginas;
        this.genero=genero;
    }
    
    public int getNro_paginas() {
        return nro_paginas;
    }

    public void setNro_paginas(int nro_paginas) {
        this.nro_paginas = nro_paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    protected void menuLibro(Libro[] array, Scanner lector, int op){
		
		do{
			
			System.out.println("Bienvenido al menu del Libro");
			System.out.println("1- Ingresar datos del Libro");
			System.out.println("2- Listar datos del Libro");
			System.out.println("3- Modificar Libro");
			System.out.println("4- Eliminar Libro");
			System.out.println("5- Salir");
			op = lector.nextInt();

			switch (op){
				case 1:

					limpiar();

					altaLibro(array, lector);

					limpiar();

					break;
				case 2:

					limpiar();

					listarLibro(array);

					limpiar();

					break;
				case 3:

					limpiar();

					editarLibro(lector, array);

					limpiar();

					break;
				case 4:

					limpiar();

					bajaLibro(array, lector);

					limpiar();

					break;
				default:

					limpiar();

					System.out.println("Opcion no disponible, elija otra opcion.");

					break;
			}
		} while (op != 5);
	}

	public static void altaLibro(Libro[] array, Scanner lector){
		
		System.out.println("Introduzca la fecha de estreno del libro: ");
		String fecha = lector.nextLine();

		System.out.println("Introduzca el nombre del libro: ");
		String nombre = lector.nextLine();

		System.out.println("Introduzca la editorial del libro: ");
		String editorial = lector.nextLine();

        System.out.println("Introduzca el id del libro: ");
        String id = lector.nextLine();

		System.out.println("Introduzca el precio del libro: ");
		int precio = lector.nextInt();

        System.out.println("Introduzca el numero de paginas del libro: ");
        int nro_paginas = lector.nextInt();

        System.out.println("Introduzca el genero del libro: ");
        String genero = lector.nextLine();
		
        for (int i = 0; i < array.length; i++){
            if (array[i] == null){
                array[i] = new Libro(fecha, nombre, editorial, id, precio, nro_paginas, genero);
                break;
            }
			
        }

	}

	public static void listarLibro(Libro[] array) {
		
		for(int i=0; i<array.length; i++) {
			if(array[i] != null) {
				 
				System.out.print("Pos N°" + i );
				System.out.print(" Nombre: " + array[i].getNombre());
				System.out.print(" Editorial: " + array[i].getEditorial());
				System.out.print(" ID: " + array[i].getId());
				System.out.print(" Precio: " + array[i].getPrecio());
				System.out.print(" Nro paginas: " + array[i].getNro_paginas());
                System.out.println(" Genero: " + array[i].getGenero());
				
			} else {
				System.out.println("Pos N°" + i + " es null");
			}
			
		}
		
	}

	public static void bajaLibro(Libro[] array, Scanner lector){

		listarLibro(array);
        System.out.println("Escriba el id del libro a eliminar: ");
        String id = lector.nextLine();
        for (int i = 0; i < array.length; i++){
            if (array[i].getId().equals(id)){
                array[i] = null;
                break;
    		}

        }

    }

	public static void editarLibro(Scanner lector, Libro arreglo[]){

        System.out.println("Escriba la cedula del libro a editar: ");
        String id = lector.nextLine();
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i].getId().equals(id)){
                menuEdicion(arreglo, lector, id, i);
                break;
            }

        }

    }

	public static void menuEdicion(Libro[] array, Scanner lector, String id, int i){
        String edit;
		int edit_int;
        int op = 0;
        do{

            limpiar();
            System.out.println("Bienvenido al menu de edicion del libro!");
            System.out.println("1- Cambiar Nombre");
            System.out.println("2- Cambiar Precio");
			System.out.println("3- Cambiar Fecha de estreno");
            System.out.println("4- Cambiar Editorial");
            System.out.println("5- Cambiar Numero de paginas");
            System.out.println("6- Cambiar Genero");
            System.out.println("7- Volver al menu principal");
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
                    System.out.println("Ingrese el nuevo numero de paginas: ");
                    edit_int = lector.nextInt();
                    array[i].setNro_paginas(edit_int);
                    break;

                case 6:
                    System.out.println("Ingrese el nuevo genero del libro: ");
                    edit = lector.nextLine();
                    array[i].setGenero(edit);
                    break;

                default:
                    System.out.println("Vuelva a intentarlo");
                    break;
            }

        } while (op != 7);

    }

	public static void limpiar(){
		for (int i = 0; i < 10; i ++){
			System.out.println("");
		}

	}
}
