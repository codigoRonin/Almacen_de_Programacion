/*
 * Reto #2
 * POO BÁSICA - HERENCIA
 * Dificultad: FACIL
 *
 * Escribe un programa en Java que defina una clase padre Mueble,con atributos protegidos ancho, alto y largo,
 * constructor que les dé valor, getters y setters , y un método "imprimir" que saque por pantalla el 
 * volumen del mueble (ancho x alto x largo).
 * 
 * Define una subclase Mesa que heredará de la anterior y añadirá como atributo privado el número de patas
 * de la mesa, más el constructor y getter /setter para el nuevo atributo.
 * Redefine el método "imprimir" para que, además del volumen de la mesa, muestre su número de patas.
 * 
 * En el programa principal, crea una mesa de 70 de alto, 80 de ancho y 120 de largo,
 * y haz que muestre su información con "imprimir"
 *
 */

import Reto2.Mesa;

public class Reto2 {
    public static void main(String[] args) {
        
        Mesa mesa = new Mesa(70, 80, 120, 4);

        mesa.imprimir();
    }
}
