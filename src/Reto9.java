/*
 * Reto #9
 * ¡ORDENANDO!
 * Fecha publicación enunciado: 28/07/22
 * Fecha publicación resolución: 11/08/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que ordene y retorne una array de números.
 * - La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro adicional
 *   "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor o de mayor a menor.
 * 
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 *  
 * Información adicional:
 * - Usa el canal de nuestro discord "retos-programación" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Revisaré el ejercicio en directo desde Twitch el jueves siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio.
 *
 */

public class Reto9 {
    enum Ordenacion {
        ASC, DESC;
    }

    public static void main(String[] args) {
        int[] vector = { 2, 4, 6, 8, 9 };

        vector = ordenarVector(vector, Ordenacion.DESC);

        for (int i = 0; i < vector.length; i++)
            System.out.print(vector[i] + " ");
    }

    public static int[] ordenarVector(int[] vector, Ordenacion tipo) {

        // Ordenamos el array con el método de la burbúja de forma ascendente
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] > vector[j]) {
                    int aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }

        // En caso de que haya que ordenar el arrar de forma descendente le damos la
        // vuelta
        if (tipo == Ordenacion.DESC) {
            for (int i = 0, j = vector.length - 1; i < vector.length / 2; i++, j--) {
                int aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux;
            }
        }
        return vector;
    }
}