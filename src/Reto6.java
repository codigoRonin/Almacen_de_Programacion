/*
 * Reto #6
 * TRABAJANDO CON FICHEROS
 * Fecha publicación enunciado: 14/07/22
 * Fecha publicación resolución: 21/07/22
 * Dificultad: FÁCIL
 *
 * Crea un programa en Java que lea un archivo de texto con información de libros, llamado "libros.txt".
 * Cada libro se almacena en una línea, separando su título, autor y precio por punto y coma: 
 * 
 *      El juego de Ender;Orson Scott Card;9.95
 *      La tabla de Flandes;Arturo Pérez Reverte;7.90 
 *      ... 
 * 
 * El programa debe leer cada libro, crear un objeto de tipo Libro con él y almacenarlo en una lista genérica de libros.
 * Después, guardará en un archivo llamado "libros_ordenados.txt" los datos de los libros, ordenados alfabéticamente por título.
 *
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import Reto6.Libro;

public class Reto6 {

    private static final String FICHERO_LECTURA = "src/Reto6/libros.txt";
    private static final String FICHERO_ESCRITURA = "src/Reto6/libros_ordenados.txt";

    public static void main(String[] args) {

        ArrayList<Libro> libros;

        libros = leerFichero();
        Collections.sort(libros);
        escribirFichero(libros);
    }

    private static void escribirFichero(ArrayList<Libro> libros) {

        try {
            BufferedWriter escritura = new BufferedWriter(new FileWriter(FICHERO_ESCRITURA, true));
            for (Libro libro : libros) {
                escritura.write(libro.getTitulo());
                escritura.write(";");
                escritura.write(libro.getAutor());
                escritura.write(";");
                escritura.write(String.valueOf(libro.getPrecio()));
                escritura.write(";");
                escritura.newLine();
            }
            escritura.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static ArrayList<Libro> leerFichero() {
        String linea;
        String[] partes;
        ArrayList<Libro> libros = new ArrayList<>();

        try {
            BufferedReader lectura = new BufferedReader(new FileReader(FICHERO_LECTURA));

            while ((linea = lectura.readLine()) != null) {
                partes = linea.split(";");
                Libro libro = new Libro(partes[0], partes[1], Float.parseFloat(partes[2]));
                libros.add(libro);
            }
            lectura.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return libros;
    }
}
