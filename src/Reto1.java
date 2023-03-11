/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Casos de prueba:
 * Roma - Amor -> true
 * Amor - Amor -> false
 * Amor - Amol -> false
 *
 */

import java.util.Arrays;

public class Reto1 {
    public static void main(String[] args) {
        System.out.println(esAnagrama("amor", "Roma"));
    }

    public static boolean esAnagrama(String palabra1, String palabra2) {

        if (palabra1.equalsIgnoreCase(palabra2)) {
            return false;
        }

        char[] array1 = palabra1.toLowerCase().toCharArray();
        char[] array2 = palabra2.toLowerCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return new String(array1).equals(new String(array2));
    }
}
