/*
 * Reto #10
 * ARBOL DE NAVIDAD
 * Fecha publicación enunciado: 28/07/22
 * Fecha publicación resolución: 11/08/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que le pida al usuario un entero N y 
 * dibuje un árbol de navidad de esa altura.
 *  
 * Por ejemplo, si N es 4, deberá dibujar esto:
 * 
 *                          *
 *                         ***
 *                        *****
 *                       *******
 * 
 * Información adicional:
 * - Usa el canal de nuestro discord "retos-programación" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Revisaré el ejercicio en directo desde Twitch el jueves siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio.
 *
 */

public class Reto10 {
    public static void main(String[] args) {
        int altura = 4;

        int blancos = altura - 1;
        int asteriscos = 1;

        for (int i = 0; i < altura; i++) {

            for (int k = 0; k < blancos; k++) {

                System.out.print(" ");
            }
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
            blancos--;
            asteriscos += 2;
        }
    }
}
