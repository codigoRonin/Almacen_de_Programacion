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
 * Información adicional:
 * - Usa el canal de nuestro discord "retos-programación" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el jueves siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio.
 *
 */

public class Reto11 {

  public static void main(String[] args) {
    System.out.println(esPrimo(13, 2));
    System.out.println(esPrimo(27, 2));
  }

  // Caso base: el divisor es mayor que la mitad del número: ya no quedan
  // divisores por probar, y el número es primo

  // Caso recursivo: el divisor es menor que la mitad del número.
  // Comprobamos si son divisibles, y si no lo son, miramos el siguiente divisor

  private static boolean esPrimo(int numero, int divisor) {
    if (divisor > numero / 2) return true;
    return numero % divisor != 0 && esPrimo(numero, divisor + 1);
  }
}
