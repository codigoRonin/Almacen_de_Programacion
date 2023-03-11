/*
 * Reto #10
 * ARBOL DE NAVIDAD
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
 */

public class Reto10 {
    public static void main(String[] args) {
        int altura = 10;

        int blancos = altura - 1;
        int asteriscos = 1;

        for (int i = 0; i < altura; i++) {

            for (int k = 0; k < blancos; k++) { // Pintamos los espacios en blanco
                System.out.print(" ");
            }
            for (int j = 0; j < asteriscos; j++) { // Pintamos los asteríscos
                System.out.print("*");
            }
            System.out.print("\n"); // Pasamos a la siguiente linea del árbol
            blancos--;
            asteriscos += 2;
        }
    }
}
