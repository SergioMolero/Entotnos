/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sergio Molero Casado
 */
public class EntornosDeDesarrollo {
    
     /**
 * Este método realiza una búsqueda lineal en un array para encontrar un elemento dado.
 * @param arr El array en el que se realizará la búsqueda.
 * @param objetivo El elemento que se desea buscar en el array.
 * @return El índice del elemento buscado si se encuentra, -1 si no se encuentra.
 */
public static int busquedaLineal(int[] arr, int objetivo) {
    // Itera sobre el array para buscar el elemento
    for (int i = 0; i < arr.length; i++) {
        // Si el elemento actual es igual al objetivo, devuelve su índice
        if (arr[i] == objetivo) {
            return i;
        }
    }
    // Si el elemento no se encuentra en el array, devuelve -1
    return -1;
}
    
}
