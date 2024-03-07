package Session4;

import java.util.ArrayList;
import java.util.Scanner;
public class Ecercise2 {
    public static void main(String[] args) {
        ArrayList<String> listC = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Salir");
            System.out.print("Elije una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el elemento a agregar: ");
                    String elementoAgregar = scanner.next();
                    listC.add(elementoAgregar);
                    System.out.println("Elemento agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingresa el índice del elemento a eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    if (indiceEliminar >= 0 && indiceEliminar < listC.size()) {
                        String elementoEliminado = listC.remove(indiceEliminar);
                        System.out.println("Elemento \"" + elementoEliminado + "\" eliminado correct1amente.");
                    } else {
                        System.out.println("Índice inválido. No se pudo eliminar ningún elemento.");
                    }
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
