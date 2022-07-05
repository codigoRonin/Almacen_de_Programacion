import java.util.Arrays;

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/07/22
 * Fecha publicación resolución: 07/07/22
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
 * Información adicional:
 * - Usa el canal de nuestro discord "retos-programación" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Revisaré el ejercicio en directo desde Twitch el jueves siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio.
 *
 */
public class Reto1 {
    public static void main(String[] args) {
        System.out.println(esAnagrama("roma", "Amor"));
    }

    public static boolean esAnagrama(String palabra1, String palabra2) {

        if (palabra1.equalsIgnoreCase(palabra2)) {
            return false;
        }

        char[] array1 = palabra1.toCharArray();
        char[] array2 = palabra2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return new String(array1).equalsIgnoreCase(new String(array2));
    }
}
