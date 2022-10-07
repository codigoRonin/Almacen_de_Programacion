import java.util.HashMap;
import java.util.Map;

/*
 * Reto #17
 * NO REPEAT
 * Fecha publicación enunciado: 29/09/22
 * Fecha publicación resolución: 06/10/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que dado un String devuelva el primer carácter que no se repita, 
 *            en caso de no existir devolver "*"
 *
 * - Desarrolla varias soluciones.
 *
 */

public class Reto17 {
    public static void main(String[] args) {

        System.out.println(primerCaracterNoRepetidoV1("caracola"));
        System.out.println(primerCaracterNoRepetidoV1("hola"));
        System.out.println(primerCaracterNoRepetidoV1("hhoollaa"));

        System.out.println(primerCaracterNoRepetidoV2("caracola"));
        System.out.println(primerCaracterNoRepetidoV2("hola"));
        System.out.println(primerCaracterNoRepetidoV2("hhoollaa"));

        System.out.println(primerCaracterNoRepetidoV3("caracola"));
        System.out.println(primerCaracterNoRepetidoV3("hola"));
        System.out.println(primerCaracterNoRepetidoV3("hhoollaa"));
    }

    // Fuerza Bruta
    public static char primerCaracterNoRepetidoV1(String string) {

        for (int i = 0; i < string.length(); i++) {
            boolean repetido = false;
            for (int j = 0; j < string.length(); j++) {

                if (string.charAt(i) == string.charAt(j) && i != j)
                    repetido = true;
            }

            if (!repetido)
                return string.charAt(i);
        }
        return '*';
    }

    // Con métodos propios del lenguaje
    public static char primerCaracterNoRepetidoV2(String string) {

        for (int i = 0; i < string.length(); i++) {
            if (string.indexOf(string.charAt(i)) == string.lastIndexOf(string.charAt(i)))
                return string.charAt(i);
        }
        return '*';
    }

    // Con HashMap
    public static char primerCaracterNoRepetidoV3(String string) {
        HashMap<Character, Integer> ocurrencias = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            if (ocurrencias.containsKey(string.charAt(i)))
                ocurrencias.put(string.charAt(i), ocurrencias.get(string.charAt(i)) + 1);
            else
                ocurrencias.put(string.charAt(i), 1);
        }

        for (int i = 0; i < string.length(); i++) {
            if (ocurrencias.get(string.charAt(i)) == 1)
                return string.charAt(i);

        }

        return '*';
    }

}
