package TallerColecciones;
import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

public class ListaTareas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<String> listaDeTareas = new ArrayList<>();
        int opcion;

        do{
            System.out.println("----- Lista de Tareas -----");
            System.out.println("1. Agregar Tarea ");
            System.out.println("2. Mostrar tareas disponibles ");
            System.out.println("3. Marcar tarea como completada ");
            System.out.println("4. Mostrar numero de tareas disponibles ");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion){
                case 1:
                    String Nuevatarea;
                    System.out.println("Ingrese el nombre de la tarea: ");
                    Nuevatarea = entrada.nextLine();
                    listaDeTareas.add(Nuevatarea);
                    System.out.println("✅ Tarea agregada correctamente.");
                    System.out.println("---------------");
                    break;

                case 2:
                    for(int i = 0; i < listaDeTareas.size(); i++){
                        System.out.println("Tarea " + (i+1) + " → " + listaDeTareas.get(i));
                        System.out.println("---------------");
                    }
                    break;

                case 3:
                    String tareaCompletada;
                    System.out.println("Ingrese el nombre exacto de la tarea que desea marcar como completada: ");
                    tareaCompletada = entrada.nextLine();
                    listaDeTareas.remove(tareaCompletada);
                    System.out.println("✅ Tarea completada.");
                    System.out.println("---------------");
                    break;

                case 4:
                    System.out.println("Numero de tareas pendientes: " + listaDeTareas.size());
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
