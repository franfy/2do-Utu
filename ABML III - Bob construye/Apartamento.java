import java.util.Scanner;

public class Apartamento extends Edificio{

	private int piso;
    private double cuotaMantenimiento;
    private boolean tieneBalcon;
    private boolean accesoAscensor;

    public Apartamento(String arquitectura, String dueno, String ubicacion, int nro_recidentes, String id,
			int piso, double cuotaMantenimiento, boolean tieneBalcon, boolean accesoAscensor) {
		super(arquitectura, dueno, ubicacion, nro_recidentes, id);
		this.piso = piso;
		this.cuotaMantenimiento = cuotaMantenimiento;
		this.tieneBalcon = tieneBalcon;
		this.accesoAscensor = accesoAscensor;
	}

	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public double getCuotaMantenimiento() {
		return cuotaMantenimiento;
	}
	public void setCuotaMantenimiento(double cuotaMantenimiento) {
		this.cuotaMantenimiento = cuotaMantenimiento;
	}
	public boolean isTieneBalcon() {
		return tieneBalcon;
	}
	public void setTieneBalcon(boolean tieneBalcon) {
		this.tieneBalcon = tieneBalcon;
	}
	public boolean isAccesoAscensor() {
		return accesoAscensor;
	}
	public void setAccesoAscensor(boolean accesoAscensor) {
		this.accesoAscensor = accesoAscensor;
	}

	protected void menuApartamento(Apartamento[] array, Scanner lector, int op){
		
		do{
			
			System.out.println("Bienvenido al menu del Apartamento");
			System.out.println("1- Ingresar datos del Apartamento");
			System.out.println("2- Listar datos del Apartamento");
			System.out.println("3- Modificar Apartamento");
			System.out.println("4- Eliminar Apartamento");
			System.out.println("5- Salir");
			op = lector.nextInt();

			switch (op){
				case 1:

					limpiar();

					altaApartamento(array, lector);

					limpiar();

					break;
				case 2:

					limpiar();

					listarApartamento(array);

					limpiar();

					break;
				case 3:

					limpiar();

					editarApartamento(lector, array);

					limpiar();

					break;
				case 4:

					limpiar();

					bajaApartamento(array, lector);

					limpiar();

					break;
				default:

					limpiar();

					System.out.println("Opcion no disponible, elija otra opcion.");

					break;
			}
		} while (op != 5);
	}

	public static void altaApartamento(Apartamento[] array, Scanner lector){

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

		System.out.println("Ingrese la cantidad de pisos: ");
		int piso = lector.nextInt();

		System.out.println("Introduzca el precio de la siguiente cuota del mantenimiento: ");
		double cuota = lector.nextDouble();

		System.out.println("El apartamento tiene un balcon? (si/no): ");
        edit = lector.nextLine();
        Boolean balcon;
        if (edit.equals("si")){
            balcon = true;
        } else {
            balcon = false;
        }

		System.out.println("El apartamento tiene acceso al ascensor? (si/no): ");
        edit = lector.nextLine();
        Boolean ascensor;
        if (edit.equals("si")){
            ascensor = true;
        } else {
            ascensor = false;
        }
        
        for (int i = 0; i < array.length; i++){
            if (array[i] == null){
                array[i] = new Apartamento(arquitectura, dueno, ubicacion, nro_recidentes, id, piso, cuota, balcon, ascensor);
                break;
            }
			
        }

	}

	public static void listarApartamento(Apartamento[] array) {
		
		for(int i=0; i<array.length; i++) {
			if(array[i] != null) {

				System.out.print("Pos N° " + i );
                System.out.print(" Arquitectura: " + array[i].getArquitectura());
                System.out.print(" Dueno: " + array[i].getDueno());
                System.out.print(" Ubicacion: " + array[i].getUbicacion());
                System.out.print(" Nro recidentes: " + array[i].getNro_recidentes());
                System.out.print(" ID: " + array[i].getId());

			} else {

				System.out.println("Pos N°" + i + " es null");

			}
			
		}
		
	}

	public static void bajaApartamento(Apartamento[] array, Scanner lector){

		listarApartamento(array);
        System.out.println("Escriba el id de la ropa a eliminar: ");
        String id = lector.nextLine();
        for (int i = 0; i < array.length; i++){
            if (array[i].getId().equals(id)){
                array[i] = null;
                break;
    		}

        }

    }

	public static void editarApartamento(Scanner lector, Apartamento array[]){

        System.out.println("Escriba la cedula del alumno a editar: ");
        String id = lector.nextLine();
        for (int i = 0; i < array.length; i++){
            if (array[i].getId().equals(id)){
                menuEdicion(array, lector, id, i);
                break;
            }

        }

    }

	public static void menuEdicion(Apartamento[] array, Scanner lector, String id, int i){
        String edit;
		int edit_int;
        int op = 0;
        do{

            limpiar();
            System.out.println("Bienvenido al menu de edicion de la casa!");
            System.out.println("1- Dueno");
			System.out.println("2- Nro recidentes");
			System.out.println("3- Cuota");
            System.out.println("4- Volver al menu principal");
            System.out.println("Ingrese una opcion: ");
            op = lector.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el nuevo Nombre: ");
                    edit = lector.nextLine();
                    array[i].setDueno(edit);
                    break;

				case 2:
					System.out.println("Ingrese el nuevo numero de recidentes: ");
					edit_int = lector.nextInt();
					array[i].setNro_recidentes(edit_int);
					break;

				case 3:
					System.out.println("Ingrese el nuevo precio de la cuota: ");
					edit_int = lector.nextInt();
					array[i].setCuotaMantenimiento(edit_int);
					break;

				case 4:
					System.out.println("Vuelva a elegir una opcion.");

                default:
                    System.out.println("Vuelva a intentarlo");
                    break;
            }

        } while (op != 4);

    }

	public static void limpiar(){
		for (int i = 0; i < 10; i ++){
			System.out.println("");
		}

	}

}
