import java.util.Scanner;

/*
 * Reto #8
 * ¡ME FALTA UNA PIEZA!
 * Fecha publicación enunciado: 21/07/22
 * Fecha publicación resolución: 28/07/22
 * Dificultad: MEDIA (si se resuelve de forma óptima)
 *
 * Enunciado:Un puzzle tiene N piezas numeradas de la 1 a la N, y nos falta una.
 * Escribe un programa que le pida al usuario que introduzca la cantidad de piezas N, 
 * y luego los números de las piezas que sí tiene, 
 * y finalmente le diga cuál es la que le falta.
 * 
 * Información adicional:
 * - Usa el canal de nuestro discord "retos-programación" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Revisaré el ejercicio en directo desde Twitch el jueves siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio.
 *
 */
public class Reto8 {
    public static void main(String[] args) {
        // opcionMenosOptima();
        // opcionCasiOptima();
        opcionOptima();
    }

    private static void opcionMenosOptima() {
        int numPiezas, posicion;
        int[] piezas;
        Scanner sc = new Scanner(System.in);

        // Construimos un array de N-1 posiciones y almacenamos los números de piezas

        System.out.println("Introduce el número de piezas del puzzle");
        numPiezas = sc.nextInt();
        piezas = new int[numPiezas - 1];
        System.out.println("Ahora introduce las " + numPiezas + " piezas que tienes: ");
        for (int i = 0; i < piezas.length; i++)
            piezas[i] = sc.nextInt();

        // Ordenamos el array

        for (int i = 0; i < piezas.length - 1; i++)
            for (int j = i + 1; j < piezas.length; j++) {
                if (piezas[i] > piezas[j]) {
                    int aux = piezas[i];
                    piezas[i] = piezas[j];
                    piezas[j] = aux;
                }
            }

        // Lo recorremos viendo cuál es la pieza que falta (allí donde el número de
        // pieza
        // ya no coincide con la casilla)

        posicion = 1;

        while ((posicion <= piezas.length) && posicion == piezas[posicion - 1])
            posicion++;

        System.out.println("La pieza que falta es: " + posicion);

    }

    private static void opcionCasiOptima() {
        int numPiezas, posicion, sumaTotal, sumaParcial;

        Scanner sc = new Scanner(System.in);

        // Pedimos el número de piezas de nuestro puzzle
        System.out.println("Introduce el número de piezas del puzzle");
        numPiezas = sc.nextInt();

        // Sumamos el valor de todas las piezas 1 + 2 + 3 + ... + N
        sumaTotal = 0;
        for (int i = 1; i <= numPiezas; i++)
            sumaTotal += i;

        // Pedimos las piezas que tiene y las sumamos
        sumaParcial = 0;
        System.out.println("Ahora introduce las " + numPiezas + " piezas que tienes: ");
        for (int i = 0; i < numPiezas - 1; i++) {
            sumaParcial += sc.nextInt();
        }

        // Vemos cual falta
        posicion = sumaTotal - sumaParcial;
        System.out.println("La pieza que falta es: " + posicion);

    }

    private static void opcionOptima() {
        int numPiezas, posicion, sumaTotal, sumaParcial;

        Scanner sc = new Scanner(System.in);

        // Pedimos el número de piezas de nuestro puzzle

        System.out.println("Introduce el número de piezas del puzzle");
        numPiezas = sc.nextInt();

        // Sumamos 1 + 2 + 3 + … + N sin bucle, empleando la fórmula de la suma de Gauss
        sumaTotal = 0;
        sumaTotal += numPiezas*(numPiezas+1)/2;

        // Pedimos las piezas que tiene y las sumamos
        sumaParcial = 0;
        System.out.println("Ahora introduce las " + numPiezas + " piezas que tienes: ");
        for (int i = 0; i < numPiezas - 1; i++) {
            sumaParcial += sc.nextInt();
        }

        // Vemos cual falta
        posicion = sumaTotal - sumaParcial;
        System.out.println("La pieza que falta es: " + posicion);

    }
}
