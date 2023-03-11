/*
 * Reto #5
 * CÓDIGO MORSE
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 *
 */

import java.util.HashMap;
import java.util.regex.Pattern;

public class Reto5 {
    public static void main(String[] args) {

        String texto = "---- --- -.-. --- .-.. .- - . ";
        String textoCodificado, textoDecodificado;

        textoCodificado = codificar(texto);
        textoDecodificado = codificar(textoCodificado);

        System.out.println(textoCodificado);
        System.out.println(textoDecodificado);

    }

    public static String codificar(String cadena) {

        if (!esMorse(cadena))
            return codificarMorse(cadena);

        return codificarNatural(cadena);
    }

    public static boolean esMorse(String cadena) {
        if (Pattern.matches("[-. ]+", cadena))
            return true;
        return false;
    }

    public static String codificarNatural(String cadena) {
        String textoNatural = "";
        HashMap<String, String> equivalenciasNatural;

        equivalenciasNatural = obtenerEquivalenciasNatural();
        String[] palabras = cadena.split("  ");

        for (String palabraActual : palabras) {
            String[] letras = palabraActual.split(" ");
            for (String letraActual : letras) {
                textoNatural += equivalenciasNatural.get(letraActual);
            }
            textoNatural += " ";
        }
        return textoNatural;
    }

    public static String codificarMorse(String cadena) {
        String textoMorse = "";
        HashMap<String, String> equivalenciasMorse;

        equivalenciasMorse = obtenerEquivalenciasMorse();
        for (int i = 0; i < cadena.length(); i++) {
            if (!esCh(cadena, i))
                textoMorse += equivalenciasMorse.getOrDefault(String.valueOf(cadena.toUpperCase().charAt(i)), "");
               
            else{
                textoMorse += equivalenciasMorse.get("CH");
                i++;
            }
            textoMorse += " ";
        }
        return textoMorse;
    }

    public static boolean esCh(String cadena, int indice) {
        if (cadena.toUpperCase().charAt(indice) == 'C' &&
                cadena.toUpperCase().charAt(indice + 1) == 'H')
            return true;
        return false;
    }

    public static HashMap<String, String> obtenerEquivalenciasNatural() {
        HashMap<String, String> equivalencias = new HashMap<>();
        HashMap<String, String> equivalenciasInvertidas = new HashMap<>();
        
        equivalencias = obtenerEquivalenciasMorse();
        equivalencias.forEach((key, value) -> equivalenciasInvertidas.put(value, key));
        // for (HashMap.Entry<String, String> equivalencia : equivalencias.entrySet()) {
        //     equivalenciasInvertidas.put(equivalencia.getValue(), equivalencia.getKey());
        // }
        return equivalenciasInvertidas;
    }

    public static HashMap<String, String> obtenerEquivalenciasMorse() {
        HashMap<String, String> equivalencias = new HashMap<>();

        equivalencias.put("A", ".-");
        equivalencias.put("B", "-...");
        equivalencias.put("C", "-.-.");
        equivalencias.put("CH", "----");
        equivalencias.put("D", "-..");
        equivalencias.put("E", ".");
        equivalencias.put("F", "..-.");
        equivalencias.put("G", "--.");
        equivalencias.put("H", "....");
        equivalencias.put("I", "..");
        equivalencias.put("J", ".---");
        equivalencias.put("K", "-.-");
        equivalencias.put("L", ".-..");
        equivalencias.put("M", "--");
        equivalencias.put("N", "-.");
        equivalencias.put("Ñ", "--.--");
        equivalencias.put("O", "---");
        equivalencias.put("P", ".--.");
        equivalencias.put("Q", "--.-");
        equivalencias.put("R", ".-.");
        equivalencias.put("S", "...");
        equivalencias.put("T", "-");
        equivalencias.put("U", "..-");
        equivalencias.put("V", "...-");
        equivalencias.put("W", ".--");
        equivalencias.put("X", "-..-");
        equivalencias.put("Y", "-.--");
        equivalencias.put("Z", "--..");
        equivalencias.put("0", "-----");
        equivalencias.put("1", ".----");
        equivalencias.put("2", "..---");
        equivalencias.put("3", "...--");
        equivalencias.put("4", "....-");
        equivalencias.put("5", ".....");
        equivalencias.put("6", "-....");
        equivalencias.put("7", "--...");
        equivalencias.put("8", "---..");
        equivalencias.put("9", "----.");
        equivalencias.put(".", ".-.-.-");
        equivalencias.put(",", "--..--");
        equivalencias.put(":", "---...");
        equivalencias.put("?", "..--..");
        equivalencias.put("'", ".----.");
        equivalencias.put("-", "-....-");
        equivalencias.put("/", "-..-.");
        equivalencias.put("\"", ".-..-.");
        equivalencias.put("@", ".--.-.");
        equivalencias.put("=", "-...-");
        equivalencias.put("!", "-.-.--");

        return equivalencias;
    }
}
