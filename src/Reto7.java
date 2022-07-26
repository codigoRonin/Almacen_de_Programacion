/*
 * Reto #7
 * ¿ES UN PALÍNDROMO?
 * Fecha publicación enunciado: 21/07/22
 * Fecha publicación resolución: 28/07/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba un texto y retorne verdadero o falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 * 
 * Información adicional:
 * - Usa el canal de nuestro discord "retos-programación" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Revisaré el ejercicio en directo desde Twitch el jueves siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio.
 *
 */

public class Reto7 {
    public static void main(String[] args) {
        System.out.println(esPalindromo("Ana lleva al oso la avellana.") ? "Es palíndromo" : "No es palíndromo");
    }

    private static boolean esPalindromo(String cadena) {

        cadena = cadena.toLowerCase().replace("á", "a")
                .replace("é", "e").replace("í", "i")
                .replace("ó", "o").replace("ú", "u")
                .replaceAll("[^a-z0-9]", "");

        String invertida = new StringBuilder(cadena).reverse().toString();

        return cadena.equals(invertida);
    }

}
