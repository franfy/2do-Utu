package ej3;
import java.util.Scanner;

public class gestor {

    public static void main(String[] args) {
        
        String sera;

        Scanner lector = new Scanner(System.in);
        apartamento apartamento_in = new apartamento(null, null, null, null, 0, 0, 0, false, false);
        casa casa_in = new casa(null, null, null, null, 0, false, 0, false, 0);
        


        //datos de los apartamentos
        System.out.println("Ingresa los datos de los apartamentos: ");
        System.out.println("Arquitectura del departamento: ");
        apartamento_in.setArquitectura(lector.next());

        System.out.println("Dueño del departamento: ");
        apartamento_in.setDueno(lector.next());

        System.out.println("Ubicacion del departamento: ");
        apartamento_in.setUbicacion(lector.next());

        System.out.println("Nombre del departamento: ");
        apartamento_in.setNombre(lector.next());

        System.out.println("Cuantos recidentes hay en el departamento?: ");
        apartamento_in.setNro_recidentes(lector.nextInt());

        System.out.println("Ingresa el numero del piso del departamento: ");
        apartamento_in.setPiso(lector.nextInt());

        System.out.println("Ingrese la cuota de mantenimiento: ");
        apartamento_in.setCuotaMantenimiento(lector.nextInt());

        System.out.println("El departamento tiene un balcon? (si/no): ");
        sera = lector.next();
        if (sera.equals("si")){
            apartamento_in.setTieneBalcon(true);
        } else {
            apartamento_in.setTieneBalcon(false);
        }

        System.out.println("El edificio tiene acceso a un ascensor? (si/no): ");
        sera = lector.next();
        if (sera.equals("si")){
            apartamento_in.setAccesoAscensor(true);
        } else {
            apartamento_in.setAccesoAscensor(false);
        }

        limpiar();

        //datos de las casas
        System.out.println("Ingresa los datos de la casa: ");
        System.out.println("Arquitectura de la casa: ");
        casa_in.setArquitectura(lector.next());

        System.out.println("Dueño de la casa: ");
        casa_in.setDueno(lector.next());

        System.out.println("Ubicacion de la casa: ");
        casa_in.setUbicacion(lector.next());

        System.out.println("Nombre de la casa: ");
        casa_in.setNombre(lector.next());

        System.out.println("Cuantos recidentes hay en la casa?: ");
        casa_in.setNro_recidentes(lector.nextInt());

        System.out.println("La casa tiene un patio? (si/no): ");
        sera = lector.next();
        if (sera.equals("si")){
            casa_in.setTienePatio(true);
        } else {
            casa_in.setTienePatio(false);
        }

        System.out.println("Ingrese la cantidad de pisos que tiene la casa: ");
        casa_in.setCantidadPisos(lector.nextInt());

        System.out.println("La casa tiene un garaje? (si/no): ");
        sera = lector.next();
        if (sera.equals("si")){
            casa_in.setTieneGaraje(true);
        } else {
            casa_in.setTieneGaraje(false);
        }

        System.out.println("Ingrese el tamano del terreno en m²");
        casa_in.setTamanioTerreno(lector.nextDouble());

        limpiar();

        // Salida de datos del departamento
        System.out.println("DATOS DEL DEPARTAMENTO:");
        System.out.println("Arquitectura: " + apartamento_in.getArquitectura());
        System.out.println("Dueño: " + apartamento_in.getDueno());
        System.out.println("Ubicación: " + apartamento_in.getUbicacion());
        System.out.println("Nombre: " + apartamento_in.getNombre());
        System.out.println("Número de residentes: " + apartamento_in.getNro_recidentes());
        System.out.println("Piso: " + apartamento_in.getPiso());
        System.out.println("Cuota de mantenimiento: " + apartamento_in.getCuotaMantenimiento());
        System.out.println("¿Tiene balcón?: " + (apartamento_in.isTieneBalcon()));
        System.out.println("¿Acceso a ascensor?: " + (apartamento_in.isAccesoAscensor()));

        limpiar();

        // Salida de datos de la casa
        System.out.println("DATOS DE LA CASA:");
        System.out.println("Arquitectura: " + casa_in.getArquitectura());
        System.out.println("Dueño: " + casa_in.getDueno());
        System.out.println("Ubicación: " + casa_in.getUbicacion());
        System.out.println("Nombre: " + casa_in.getNombre());
        System.out.println("Número de residentes: " + casa_in.getNro_recidentes());
        System.out.println("¿Tiene patio?: " + (casa_in.isTienePatio()));
        System.out.println("Cantidad de pisos: " + casa_in.getCantidadPisos());
        System.out.println("¿Tiene garaje?: " + (casa_in.isTieneGaraje()));
        System.out.println("Tamaño del terreno: " + casa_in.getTamanioTerreno() + " m²");

        lector.close();

    }
    
    public static void limpiar(){
        for (int z = 0; z <= 10; z++){
            System.out.println("");
        }
    }

}
