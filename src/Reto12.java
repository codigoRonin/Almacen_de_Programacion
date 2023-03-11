/*
 * Reto #12
 * EN MAYÚSCULAS
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 *
 * !!! No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente!!!
 *
 */

import java.nio.charset.StandardCharsets;

public class Reto12 {

  public static void main(String[] args) {
    System.out.println(primeraMayuscula("Me comi 1 ñoqui o Dos - cientos"));
  }

  public static String primeraMayuscula(String frase) {
    String[] palabras;
    String fraseNueva = "";

    palabras = frase.split(" ");

    for (String palabra : palabras) {
      String primeraLetra = palabra.substring(0, 1);
      String restoLetras = palabra.substring(1, palabra.length());

      byte[] ascii = primeraLetra.getBytes(StandardCharsets.US_ASCII);
      if (ascii[0] >= 97 && ascii[0] <= 122) {
        ascii[0] -= 32;
        primeraLetra = Character.toString(ascii[0]);
      } else if (primeraLetra.equals("ñ")) {
        primeraLetra = "Ñ";
      }

      fraseNueva += primeraLetra + restoLetras + " ";
    }

    return fraseNueva;
  }
}
