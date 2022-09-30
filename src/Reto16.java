/*
 * Reto #16
 * ¿CUANTOS DIGITOS?
 * Fecha publicación enunciado: 15/09/22
 * Fecha publicación resolución: 22/09/22
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
        System.out.println(digitosEntero2(9));
        System.out.println(digitosEntero2(0));
    }

    public static int digitosEntero1(int num) {
        int digitos = 0;
        if (num == 0)
            return 1;
        while (num != 0) {
            num /= 10;
            digitos++;
        }
        return digitos;
    }

    public static int digitosEntero2(int num) {
        return Integer.toString(num).length();
    }
}
