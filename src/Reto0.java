/*
 * Reto #0
 * LA SERIE DE FIBONACCI
 * Fecha publicación enunciado: 30/06/22
 * Fecha publicación resolución: 03/07/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: 
 * Escribe un programa que imprima los 50 primeros números de la serie de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por la suma de los dos últimos números comenzando desde 0 y 1. 
 * Si uno quiere encontrar el n-ésimo elemento, entonces el número se encuentra sumando (n-1) y (n-2) términos,
 * donde n debe ser mayor que 0.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 * Información adicional:
 * - Usa el canal de nuestro discord "retos-programación" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Revisaré el ejercicio en directo desde Twitch el jueves siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio.
 *
 */

public class Reto0 {

    public static void main(String[] args) {
        for(int i=0;i<50;i++)
            System.out.println(obtenerFibonacci(i));
    }

    public static long obtenerFibonacci(long num){
        // Caso Base: f(0) -> 0 f(1) -> 1
        if(num < 2)
            return num;
        return obtenerFibonacci(num-1) + obtenerFibonacci(num -2);
    }
    
    // Ejemplo calculo del factorial de forma recursiva
    public static int Factorial(int num) {

        // Caso Base: !0 -> 1
        if (num == 0)
            return 1;

        return num * Factorial(num - 1);
    }

}
