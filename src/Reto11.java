/*
 * Reto #11
 * ¡MI PRIMO EL RECURSIVO!
 * Fecha publicación enunciado: 11/08/22
 * Fecha publicación resolución: 25/08/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe una función recursica que se encargue de comprobar si un número 
 * es o no primo.
 *
 */

public class Reto11 {

  public static void main(String[] args) {
    System.out.println(esPrimo(13, 2));
    System.out.println(esPrimo(27, 2));
  }

  private static boolean esPrimo(int numero, int divisor) {
    // Caso base: el divisor es mayor que la mitad del número: ya no quedan
    // divisores por probar, y el número es primo
    if (divisor > numero / 2)
      return true;
    // Caso recursivo: el divisor es menor que la mitad del número.
    // Comprobamos si son divisibles, y si no lo son, miramos el siguiente divisor
    return numero % divisor != 0 && esPrimo(numero, divisor + 1);
  }
}
