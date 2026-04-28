package TallerColecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DirectorioTrabajadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Map<String, Double> directorioTrabajadores = new HashMap<>();
        int opcion;

        do{
            System.out.println("----- Directorio Trabajadores -----");
            System.out.println("1. Agregar trabajador ");
            System.out.println("2. Mostrar trabajadores y salarios ");
            System.out.println("3. Actualizar salarios ");
            System.out.println("4. Calcular salario promedio ");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion){
                case 1:
                    String NombreTrabajador;
                    System.out.println("Ingrese el nombre del nuevo empleado: ");
                    NombreTrabajador = entrada.nextLine();

                    double salario;
                    System.out.println("Ingrese el salario del nuevo empleado: ");
                    salario = entrada.nextDouble();

                    if(directorioTrabajadores.containsKey(NombreTrabajador)){
                        System.out.println("Error ⚠ : EL empleado ya existe dentro del directorio");
                        System.out.println("---------------");
                        break;
                    }else{
                        directorioTrabajadores.put(NombreTrabajador, salario);
                        System.out.println("✅ Trabajador agregado correctamente.");
                        System.out.println("---------------");
                        break;
                    }

                case 2:
                    directorioTrabajadores.forEach((nombre, salarioEmpleado) -> {
                        System.out.println("Empleado: " + nombre + " | Salario: " + salarioEmpleado);
                        System.out.println("---------------");
                    });
                    break;

                case 3:
                    String empleado;
                    System.out.println("Ingrese el nombre exacto del empleado que desea modificar su salario: ");
                    empleado = entrada.nextLine();
                    if(directorioTrabajadores.containsKey(empleado)){
                        double nuevoSalario;
                        System.out.println("Ingrese el nuevo salario del empleado: ");
                        nuevoSalario = entrada.nextDouble();
                        directorioTrabajadores.put(empleado, nuevoSalario);
                        System.out.println("✅ Salario actualizado para " + empleado);
                        System.out.println("---------------");
                        break;

                    }else{
                        System.out.println("❌ Error: El trabajador no existe.");
                        System.out.println("---------------");
                        break;
                    }

                case 4:

                    if (directorioTrabajadores.isEmpty()) {
                        System.out.println("No hay trabajadores para calcular el promedio.");
                        break;
                    } else {
                        double sumaSalarios = 0;
                        for (Double valorSalario : directorioTrabajadores.values()) {
                            sumaSalarios = sumaSalarios + valorSalario;
                        }

                        double promedio = sumaSalarios / directorioTrabajadores.size();
                        System.out.println("Promedio de salarios: " + promedio);

                        break;
                    }

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
