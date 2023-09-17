/*
 * Reto #16
 * ¿CUANTOS DIGITOS?
 * Dificultad: FÁCIL
 *
 * Enunciado: Realiza un programa que determine cuántos dígitos tiene un número entero.
 *
 * - Desarrolla una solución sin utilizar funciones propias del lenguaje y otra utilizandolas.
 *
 */

public class Reto16 {
    public static void main(String[] args) {
        System.out.println(digitosEntero1(12345));
        System.out.println(digitosEntero2(0));
        System.out.println(digitosEntero3(123));
    }

    public static int digitosEntero1(int num) {
        int digitos = 0;

        while (num != 0) {
            num /= 10;
            digitos++;
        }
        return digitos;
    }

    public static int digitosEntero2(int num) {
        return Integer.toString(num).length();
    }

    public static int digitosEntero3(int num){

         if (num < 10)
            return 1;

        return 1 + digitosEntero3(num/10);

    }
}
