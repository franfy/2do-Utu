import java.util.Scanner;

public class Casa extends Edificio{

    private boolean tienePatio;
    private int cantidadPisos;
    private boolean tieneGaraje;
    private double tamanioTerreno; //en m²

    public Casa(String arquitectura, String dueno, String ubicacion, int nro_recidentes, String id,
            boolean tienePatio, int cantidadPisos, boolean tieneGaraje, double tamanioTerreno) {
        super(arquitectura, dueno, ubicacion, nro_recidentes, id);
        this.tienePatio = tienePatio;
        this.cantidadPisos = cantidadPisos;
        this.tieneGaraje = tieneGaraje;
        this.tamanioTerreno = tamanioTerreno;
    }

    public boolean isTienePatio() {
        return tienePatio;
    }
    public void setTienePatio(boolean tienePatio) {
        this.tienePatio = tienePatio;
    }
    public int getCantidadPisos() {
        return cantidadPisos;
    }
    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }
    public boolean isTieneGaraje() {
        return tieneGaraje;
    }
    public void setTieneGaraje(boolean tieneGaraje) {
        this.tieneGaraje = tieneGaraje;
    }
    public double getTamanioTerreno() {
        return tamanioTerreno;
    }
    public void setTamanioTerreno(double tamanioTerreno) {
        this.tamanioTerreno = tamanioTerreno;
    }


    protected void menuCasa(Casa[] array, Scanner lector, int op){
		
		do{
			
			System.out.println("Bienvenido al menu de Casa");
			System.out.println("1- Ingresar datos de la Casa");
			System.out.println("2- Listar datos de la Casa");
			System.out.println("3- Modificar Casa");
			System.out.println("4- Eliminar Casa");
			System.out.println("5- Salir");
			op = lector.nextInt();

			switch (op){
				case 1:

					limpiar();

					altaCasa(array, lector);

					limpiar();

					break;
				case 2:

					limpiar();

					listarCasa(array);

					limpiar();

					break;
				case 3:

					limpiar();

					editarCasa(lector, array);

					limpiar();

					break;
				case 4:

					limpiar();

					bajaCasa(array, lector);

					limpiar();

					break;
				default:

					limpiar();

					System.out.println("Opcion no disponible, elija otra opcion.");

					break;
			}
		} while (op != 5);
	}

	public static void altaCasa(Casa[] array, Scanner lector){

        String edit;
		
        System.out.println("Introduzca la arquitectura: ");
        String arquitectura = lector.nextLine();

        System.out.println("Introduzca el nombre del Dueno: ");
        String dueno = lector.nextLine();

        System.out.println("Introduzca la ubicacion de la casa: ");
        String ubicacion = lector.nextLine();

        System.out.println("Introduzca el numero de recidentes: ");
        int nro_recidentes = lector.nextInt();

        System.out.println("Introduzca el id de la casa: ");
        String id = lector.nextLine();

        System.out.println("La casa tiene patio? (si/no): ");
        edit = lector.nextLine();
        Boolean patio;
        if (edit.equals("si")){
            patio = true;
        } else {
            patio = false;
        }

        System.out.println("Introduzca la cantidad de pisos: ");
        int pisos = lector.nextInt();

        System.out.println("La casa tiene garage? (si/no): ");
        edit = lector.nextLine();
        Boolean garage;
        if (edit.equals("si")){
            garage = true;
        } else {
            garage = false;
        }

        System.out.println("Introduzca el tamano del terreno en m²: ");
        double metro_cuadrado = lector.nextDouble(); 

        for (int i = 0; i < array.length; i++){
            if (array[i] == null){
                array[i] = new Casa(arquitectura, dueno, ubicacion, nro_recidentes, id, patio, pisos, garage, metro_cuadrado);
                break;
            }
			
        }

	}

	public static void listarCasa(Casa[] array) {
		
		for(int i=0; i<array.length; i++) {
			if(array[i] != null) {

				System.out.print("Pos N° " + i );
                System.out.print(" Arquitectura: " + array[i].getArquitectura());
                System.out.print(" Dueno: " + array[i].getDueno());
                System.out.print(" Ubicacion: " + array[i].getUbicacion());
                System.out.print(" Nro recidentes: " + array[i].getNro_recidentes());
                System.out.print(" ID: " + array[i].getId());
                System.out.print(" Patio: " + array[i].isTienePatio());
                System.out.print(" Pisos: " + array[i].getCantidadPisos());
                System.out.print(" Garage: " + array[i].isTieneGaraje());
                System.err.println(" Metros²: "  + array[i].getTamanioTerreno());

			} else {
				System.out.println("Pos N°" + i + " es null");
			}
			
		}
		
	}

	public static void bajaCasa(Casa[] array, Scanner lector){

		listarCasa(array);
        System.out.println("Escriba el id de la casa a eliminar: ");
        String id = lector.nextLine();
        for (int i = 0; i < array.length; i++){
            if (array[i].getId().equals(id)){
                array[i] = null;
                break;
    		}

        }

    }

	public static void editarCasa(Scanner lector, Casa array[]){

        System.out.println("Escriba el id de la casa a editar: ");
        String id = lector.nextLine();
        for (int i = 0; i < array.length; i++){
            if (array[i].getId().equals(id)){
                menuEdicion(array, lector, id, i);
                break;
            }

        }

    }

	public static void menuEdicion(Casa[] array, Scanner lector, String id, int i){
        String edit;
        int edit_int;
        int op = 0;
        do{

            limpiar();
            System.out.println("Bienvenido al menu de edicion de la ropa!");
            System.out.println("1- Cambiar Dueno");
            System.out.println("2- Cambiar Nro de recidentes");
            System.out.println("3- Volver al menu principal");
            System.out.println("Ingrese una opcion: ");
            op = lector.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del nuevo deuno: ");
                    edit = lector.nextLine();
                    array[i].setDueno(edit);
                    break;

                case 2:
                    System.out.println("Ingrese el nuevo numero de recidentes: ");
                    edit_int = lector.nextInt();
                    array[i].setNro_recidentes(edit_int);
                    break;

                default:
                    System.out.println("Vuelva a intentarlo");
                    break;
            }

        } while (op != 3);

    }

	public static void limpiar(){
		for (int i = 0; i < 10; i ++){
			System.out.println("");
		}

	}

}
