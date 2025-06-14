import java.util.Scanner;

public class Revista extends Publicacion{

    protected int nro_paginas;
    protected int cant_comics;
    protected int noticias;
    
    public Revista(String fecha_estreno, String nombre, String editorial, String id, int precio, int nro_paginas, int cant_comics, int noticias) {
        super(fecha_estreno, nombre, editorial, id, precio);
        this.nro_paginas = nro_paginas;
        this.cant_comics = cant_comics;
        this.noticias = noticias;
    }

    public int getNro_paginas() {
        return nro_paginas;
    }

    public void setNro_paginas(int nro_paginas) {
        this.nro_paginas = nro_paginas;
    }

    public int getCant_comics() {
        return cant_comics;
    }

    public void setCant_comics(int cant_comics) {
        this.cant_comics = cant_comics;
    }

    public int getNoticias() {
        return noticias;
    }

    public void setNoticias(int noticias) {
        this.noticias = noticias;
    }

    protected void menuRevista(Revista[] array, Scanner lector, int op){
		
		do{
			
			System.out.println("Bienvenido al menu de la Revista");
			System.out.println("1- Ingresar datos de la Revista");
			System.out.println("2- Listar datos de las Revistas");
			System.out.println("3- Modificar Revistas");
			System.out.println("4- Eliminar Revista");
			System.out.println("5- Salir");
			op = lector.nextInt();

			switch (op){
				case 1:

					limpiar();

					altaRevista(array, lector);

					limpiar();

					break;
				case 2:

					limpiar();

					listarRevista(array);

					limpiar();

					break;
				case 3:

					limpiar();

					editarRevista(lector, array);

					limpiar();

					break;
				case 4:

					limpiar();

					bajaRevista(array, lector);

					limpiar();

					break;
				default:

					limpiar();

					System.out.println("Opcion no disponible, elija otra opcion.");

					break;
			}
		} while (op != 5);
	}

	public static void altaRevista(Revista[] array, Scanner lector){
		
		System.out.println("Introduzca la fecha de estreno de la revista: ");
		String fecha = lector.nextLine();

		System.out.println("Introduzca el nombre de la revista: ");
		String nombre = lector.nextLine();

		System.out.println("Introduzca la editorial de la revista: ");
		String editorial = lector.nextLine();

        System.out.println("Introduzca el id del libro: ");
        String id = lector.nextLine();

		System.out.println("Introduzca el precio del libro: ");
		int precio = lector.nextInt();

        System.out.println("Introduzca el numero de paginas de la revista: ");
        int nro_paginas = lector.nextInt();

        System.out.println("Introduzca la cantidad de comics que tiene la revista: ");
        int comics = lector.nextInt();

        System.out.println("Introduzca la cantidad de noticias que tiene la revista: ");
        int noticias = lector.nextInt();
		
        for (int i = 0; i < array.length; i++){
            if (array[i] == null){
                array[i] = new Revista(fecha, nombre, editorial, id, precio, nro_paginas, comics, noticias);
                break;
            }
			
        }

	}

	public static void listarRevista(Revista[] array) {
		
		for(int i=0; i<array.length; i++) {
			if(array[i] != null) {
				 
				System.out.print("Pos N°" + i );
				System.out.print(" Nombre: " + array[i].getNombre());
				System.out.print(" Editorial: " + array[i].getEditorial());
				System.out.print(" ID: " + array[i].getId());
				System.out.print(" Precio: " + array[i].getPrecio());
				System.out.print(" Nro paginas: " + array[i].getNro_paginas());
                System.out.print(" Nro comics: " + array[i].getCant_comics());
                System.out.println(" Nro noticias: " + array[i].getNoticias());
				
			} else {
				System.out.println("Pos N°" + i + " es null");
			}
			
		}
		
	}

	public static void bajaRevista(Revista[] array, Scanner lector){

		listarRevista(array);
        System.out.println("Escriba el id de la revista a eliminar: ");
        String id = lector.nextLine();
        for (int i = 0; i < array.length; i++){
            if (array[i].getId().equals(id)){
                array[i] = null;
                break;
    		}

        }

    }

	public static void editarRevista(Scanner lector, Revista array[]){

        System.out.println("Escriba la cedula del alumno a editar: ");
        String id = lector.nextLine();
        for (int i = 0; i < array.length; i++){
            if (array[i].getId().equals(id)){
                menuEdicion(array, lector, id, i);
                break;
            }

        }

    }

	public static void menuEdicion(Revista[] array, Scanner lector, String id, int i){
        String edit;
		int edit_int;
        int op = 0;
        do{

            limpiar();
            System.out.println("Bienvenido al menu de edicion de la Revista!");
            System.out.println("1- Cambiar Nombre");
            System.out.println("2- Cambiar Precio");
			System.out.println("3- Cambiar Fecha de estreno");
            System.out.println("4- Cambiar Editorial");
            System.out.println("5- Cambiar Numero de paginas");
            System.out.println("6- Cambiar Numero de comics");
            System.out.println("7- Cambiar Numero de noticias");
            System.out.println("8- Volver al menu principal");
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
                    System.out.println("Ingrese el nuevo numero de comics: ");
                    edit_int = lector.nextInt();
                    array[i].setCant_comics(edit_int);
                    break;

                case 7:
                    System.out.println("Ingrese el nuevo numero de noticias: ");
                    edit_int = lector.nextInt();
                    array[i].setNoticias(edit_int);
                    break;

                default:
                    System.out.println("Vuelva a intentarlo");
                    break;
            }

        } while (op != 8);

    }

	public static void limpiar(){
		for (int i = 0; i < 10; i ++){
			System.out.println("");
		}

	}

}
