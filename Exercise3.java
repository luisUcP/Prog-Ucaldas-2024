package Session4;

import java.util.LinkedList;

public class Exercise3 {
    public static void main(String[] args) {
        LinkedList<String> listaCadenas = new LinkedList<>();

        
        listaCadenas.add("Manzana");
        listaCadenas.add("Banana");
        listaCadenas.add("Naranja");
        listaCadenas.add("Uva");

        
        String elementoBuscado = "Banana";

        int indiceEncontrado = listaCadenas.indexOf(elementoBuscado);

        if (indiceEncontrado != -1) {
            System.out.println("El elemento \"" + elementoBuscado + "\" se encuentra en el índice " + indiceEncontrado);
        } else {
            System.out.println("El elemento \"" + elementoBuscado + "\" no se encontró en la lista.");
        }
    }
}
