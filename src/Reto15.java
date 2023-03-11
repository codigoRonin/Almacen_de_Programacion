/*
 * Reto #15
 * AÑOS BISIESTOS
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que imprima los 30 próximos años bisiestos siguientes
 * a un año dado.
 *
 * - Utiliza el menor número de líneas para resolver el ejercicio.
 *
 */

public class Reto15 {

    public static void main(String[] args) {
        proximosTrentaBisiestos(1980);
    }

    private static void proximosTrentaBisiestos(int anio) {
        int anioBisiesto = 0;
        while (anioBisiesto < 30) {
            anio++;
            if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                System.out.println(anio);
                anioBisiesto++;
            }
        }
    }
}
