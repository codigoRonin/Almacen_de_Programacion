/*
 * Reto #3
 * EL FAMOSO "FIZZ BUZZ"
 * Fecha publicación enunciado: 07/07/22
 * Fecha publicación resolución: 14/07/22
 * Dificultad: FÁCIL
 * 
 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 *
 */

 public class Reto3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int num) {

        if (num % 3 == 0 && num % 5 == 0)
            return "fizzbuzz";
        else if (num % 3 == 0)
            return "fizz";
        else if (num % 5 == 0)
            return "buzz";
        else
            return String.valueOf(num);
    }
}
