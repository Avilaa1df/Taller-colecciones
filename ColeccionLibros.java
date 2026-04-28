package TallerColecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ColeccionLibros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Set<String> coleccionLibros = new HashSet<>();
        int opcion;

        do{
            System.out.println("----- Biblioteca -----");
            System.out.println("1. Agregar libro ");
            System.out.println("2. Mostrar libros disponibles ");
            System.out.println("3. Verificar disponibilidad de libro ");
            System.out.println("4. Mostrar numero de libros disponibles ");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion){
                case 1:
                    String NuevoLibro;
                    System.out.println("Ingrese el nombre del nuevo libro: ");
                    NuevoLibro = entrada.nextLine();

                    if(coleccionLibros.contains(NuevoLibro)){
                        System.out.println("Error: Libro ya existente");
                        System.out.println("---------------");
                        break;
                    }else{
                        coleccionLibros.add(NuevoLibro);
                        System.out.println("✅ Libro agregado correctamente.");
                        System.out.println("---------------");
                        break;
                    }

                case 2:
                    for (String libro : coleccionLibros) {
                        int contador = 1;
                        System.out.println("Libro" + contador + " -> " + libro);
                        System.out.println("-----------------");
                        contador = contador + 1;
                    }
                    break;

                case 3:
                    String tareaV;
                    System.out.println("Ingrese el nombre exacto del libro que desea verificar: ");
                    tareaV = entrada.nextLine();
                    if(coleccionLibros.contains(tareaV)){
                        System.out.println("Libro ya existente dentro de la coleccion");
                        System.out.println("---------------");
                        break;
                    }else{
                        System.out.println("Libro no existente dentro de la coleccion");
                        System.out.println("---------------");
                        break;
                    }

                case 4:
                    System.out.println("Numero de tareas pendientes: " + coleccionLibros.size());
                    System.out.println("---------------");
                    break;

                case 5:
                    System.out.println("Saliendo... ");
                    break;

                default:
                    System.out.println("Numero de opcion invalida, por favor vuelva a ingresar otra opcion");
                    System.out.println("---------------");
                    break;
            }

        } while (opcion != 5);

        entrada.close();
    }

}
