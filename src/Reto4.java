/*
 * Reto #4
 * POO BÁSICA - INTERFACES
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 */

import Reto4.Cuadrado;
import Reto4.Poligono;
import Reto4.Rectangulo;
import Reto4.Triangulo;

public class Reto4 {
    public static void main(String[] args) {

        area(new Triangulo(9, 5));
        area(new Rectangulo(5, 3));
        area(new Cuadrado(3));
    }

    public static double area(Poligono poligono) {
        poligono.mostrarArea();
        return poligono.area();

    }
}
