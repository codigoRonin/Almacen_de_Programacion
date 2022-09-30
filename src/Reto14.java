/*
 * Reto #14
 * ¿ES UN NÚMERO DE ARMSTRONG?
 * Fecha publicación enunciado: 25/08/22
 * Fecha publicación resolución: 01/09/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule si un número dado es un número de Amstrong
 * (o también llamado narcisista).
 *
 * Un número de n dígitos es un número de Armstrong si es igual a la suma de las n-ésimas
 * potencias de sus dígitos. Por ejemplo:
 *        371 = 3^3 + 7^3+ 1^3
 *        8208 = 8^4 + 2^4 + 0^4 + 8^4
 *        4210818 = 4^7 + 2^7 + 1^7 + 0^7 + 8^7 + 1^7 + 8^7
 *
 */

public class Reto14 {

  public static void main(String[] args) {
    System.out.println(esArmstrong(371));
    System.out.println(esArmstrong(8208));
    System.out.println(esArmstrong(4210818));
    System.out.println(esArmstrong(2470));
    System.out.println(esArmstrong(-103));
  }

  public static boolean esArmstrong(int num) {
    if (num < 0) {
      return false;
    } else {
      String aux = Integer.toString(num);
      double resultado = 0;

      for (int i = 0; i < aux.length(); i++) {
        resultado +=
          Math.pow(
            Double.parseDouble(String.valueOf(aux.charAt(i))),
            aux.length()
          );
      }
      return num == resultado;
    }
  }
}
