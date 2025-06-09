package ej4;
import java.util.Scanner;

public class gestor {

    public static void main(String[] args) {
        
        int op = 0;

        Scanner lector = new Scanner(System.in);
        pintura pintura_in = new pintura(null, null, 0, null, null, null);
        escultura escultura_in = new escultura(null, null, 0, null, null, 0, 0);
        fotografia fotografia_in = new fotografia(null, null, 0, null, null, null, false);

        do{

            //pequeno menu para facilitar el uso
            System.out.println("Ingresa una opcion: ");
            System.out.println("1. Ingresar datos de pintura");
            System.out.println("2. Ingresar datos de escultura");
            System.out.println("3. Ingresar datos de fotografia");
            System.out.println("4. Listar todos los datos existentes");
            System.out.println("5. Salir");
            op = lector.nextInt();

            if (op == 1){//opcion 1
                op1_pintura(pintura_in, lector);

            } else if (op == 2){//opcion 2
                op2_escultura(escultura_in, lector);

            } else if (op == 3){//opcion 3
                op3_fotografia(fotografia_in, lector);

            } else if (op == 4){//opcion 4
                op4_listado(pintura_in, escultura_in, fotografia_in);

            } else {//no se encuentra una opcion

            }

        } while (op != 5);//opcion 5

        lector.close();

    }

    public static void op1_pintura(pintura pintura_in, Scanner lector) {//Pide los datos para pintura

        limpiar();
        System.out.println("Ingreso de datos para Pintura");

        System.out.print("Ingresa el titulo de la pintura: ");
        pintura_in.setTitulo(lector.nextLine());

        System.out.print("Ingrese el nombre del autor: ");
        pintura_in.setAutor(lector.nextLine());

        System.out.print("Ingrese el año de creacion: ");
        pintura_in.setAnioCreacion(lector.nextInt());

        System.out.print("Ingrese la tecnica utilizada: ");
        pintura_in.setTecnica(lector.nextLine());

        System.out.print("Ingrese el tipo de pintura: ");
        pintura_in.setTipoPintura(lector.nextLine());

        System.out.print("Ingrese el estilo: ");
        pintura_in.setEstilo(lector.nextLine());
        limpiar();

    }

    public static void op2_escultura(escultura escultura_in, Scanner lector) {//Pide los datos para escultura

        limpiar();
        System.out.println("Ingreso de datos para Escultura");

        System.out.print("Ingresa el titulo de la escultura: ");
        escultura_in.setTitulo(lector.nextLine());

        System.out.print("Ingrese el nombre del autor: ");
        escultura_in.setAutor(lector.nextLine());

        System.out.print("Ingrese el año de creacion: ");
        escultura_in.setAnioCreacion(lector.nextInt());

        System.out.print("Ingrese la tecnica utilizada: ");
        escultura_in.setTecnica(lector.nextLine());

        System.out.print("Ingrese el material: ");
        escultura_in.setMaterial(lector.nextLine());

        System.out.print("Ingrese la altura (en metros): ");
        escultura_in.setAltura(lector.nextDouble());

        System.out.print("Ingrese el peso (en kilometros): ");
        escultura_in.setPeso(lector.nextInt());
        limpiar();

    }

    public static void op3_fotografia(fotografia fotografia_in, Scanner lector) {//Pide los datos para fotografia
        
        limpiar();
        System.out.println("Ingreso de datos para Fotografia");

        System.out.print("Ingresa el titulo de la fotografia: ");
        fotografia_in.setTitulo(lector.nextLine());

        System.out.print("Ingrese el nombre del autor: ");
        fotografia_in.setAutor(lector.nextLine());

        System.out.print("Ingrese el año de creacion: ");
        fotografia_in.setAnioCreacion(lector.nextInt());

        System.out.print("Ingrese la tecnica utilizada: ");
        fotografia_in.setTecnica(lector.nextLine());

        System.out.print("Ingrese el tipo de fotografia: ");
        fotografia_in.setTipoFotografia(lector.nextLine());

        System.out.print("Ingrese la resolucion en pixeles: ");
        fotografia_in.setResolucion(lector.nextLine());

        System.out.print("Es a color? (si/no): ");
        String sino = lector.nextLine();
        sino.toLowerCase();
        if (sino.equals("si")){
            fotografia_in.setEsColor(true);
        } else {
            fotografia_in.setEsColor(false);
        }
        limpiar();
    
    }

    public static void limpiar(){//"limpia" la consola
        for (int z = 0; z < 10; z++){
            System.out.println("");
        }
    }

    public static void op4_listado(pintura pintura_in, escultura escultura_in, fotografia fotografia_in) {
    limpiar();

    if (pintura_in != null) {//datos de la pintura
        System.out.println("Datos de la Pintura: ");
        System.out.println("Titulo: " + pintura_in.getTitulo());
        System.out.println("Autor: " + pintura_in.getAutor());
        System.out.println("Año de creacion: " + pintura_in.getAnioCreacion());
        System.out.println("Tecnica: " + pintura_in.getTecnica());
        System.out.println("Tipo de pintura: " + pintura_in.getTipoPintura());
        System.out.println("Estilo: " + pintura_in.getEstilo());
    }

    if (escultura_in != null) {//datos de la escultura
        System.out.println("Datos de la Escultura:");
        System.out.println("Titulo: " + escultura_in.getTitulo());
        System.out.println("Autor: " + escultura_in.getAutor());
        System.out.println("Año de creacion: " + escultura_in.getAnioCreacion());
        System.out.println("Tecnica: " + escultura_in.getTecnica());
        System.out.println("Material: " + escultura_in.getMaterial());
        System.out.println("Altura: " + escultura_in.getAltura() + " metros");
        System.out.println("Peso: " + escultura_in.getPeso() + " kg");
    }

    if (fotografia_in != null) {//datos de la fotografia
        System.out.println("Datos de la Fotografia");
        System.out.println("Titulo: " + fotografia_in.getTitulo());
        System.out.println("Autor: " + fotografia_in.getAutor());
        System.out.println("Año de creacion: " + fotografia_in.getAnioCreacion());
        System.out.println("Tecnica: " + fotografia_in.getTecnica());
        System.out.println("Tipo de fotografia: " + fotografia_in.getTipoFotografia());
        System.out.println("Resolucion: " + fotografia_in.getResolucion());
        System.out.println("Es a color?: " + (fotografia_in.isEsColor()));
    }

    if (pintura_in == null && escultura_in == null && fotografia_in == null) {//no se muestran datos
        System.out.println("No hay datos que mostrar.");
    }

    }

}
