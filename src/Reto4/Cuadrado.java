package Reto4;

public class Cuadrado implements Poligono {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public void mostrarArea() {
        System.out.println("El area del cuadrado es: " + area());
    }

}
