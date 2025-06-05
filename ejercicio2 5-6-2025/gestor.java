import java.util.Scanner;

public class gestor {

    public static void main(String[] args) {
        
        // Instanciando clases
        Scanner lector = new Scanner(System.in);
        libro libro_in = new libro(null, null, null, 0, 0, null); // fecha_estreno, nombre, editorial, precio, nro_paginas
        revista revista_in = new revista(null, null, null, 0, 0, 0, null); // fecha_estreno, nombre, escritor, precio, nro_paginas
        articulo articulo_in = new articulo(null, null, null, 0, null); // fecha_estreno, nombre, escritor, precio, tema

        // Datos del libro
        System.out.println("Ingrese la fecha de estreno del libro: ");
        libro_in.fecha_estreno = lector.next();

        System.out.println("Ingrese el nombre del libro: ");
        libro_in.nombre = lector.next();

        System.out.println("Ingrese la editorial del libro: ");
        libro_in.editorial = lector.next();

        System.out.println("Ingrese el precio del libro: ");
        libro_in.precio = lector.nextInt();

        System.out.println("Ingrese el número de páginas del libro: ");
        libro_in.nro_paginas = lector.nextInt();

        // Datos de la revista
        System.out.println("Ingrese la fecha de estreno de la revista: ");
        revista_in.fecha_estreno = lector.next();

        System.out.println("Ingrese el nombre de la revista: ");
        revista_in.nombre = lector.next();

        System.out.println("Ingrese la editorial de la revista: ");
        revista_in.editorial = lector.next();

        System.out.println("Ingrese el precio de la revista: ");
        revista_in.precio = lector.nextInt();

        System.out.println("Ingrese el número de páginas de la revista: ");
        revista_in.nro_paginas = lector.nextInt();

        System.out.println("Ingrese la nueva noticia de la revista: ");
        revista_in.noticias = lector.next();

        // Datos del artículo
        System.out.println("Ingrese la fecha de estreno del artículo: ");
        articulo_in.fecha_estreno = lector.next();

        System.out.println("Ingrese el nombre del artículo: ");
        articulo_in.nombre = lector.next();

        System.out.println("Ingrese el escritor del artículo: ");
        articulo_in.editorial = lector.next();

        System.out.println("Ingrese el precio del artículo: ");
        articulo_in.precio = lector.nextInt();

        System.out.println("Ingrese el tema del artículo: ");
        articulo_in.tema = lector.next();

        lector.close();
    }

}
