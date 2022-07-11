package Reto4;

public class Rectangulo implements Poligono {

    private double ancho;
    private double largo;

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public double area() {
        return this.ancho * this.largo;
    }

    @Override
    public void mostrarArea() {
        System.out.println("El area del Rectangulo es: " + area());
    }

}
