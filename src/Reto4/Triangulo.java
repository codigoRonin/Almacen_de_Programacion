package Reto4;

public class Triangulo implements Poligono {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {

        return (this.base * this.altura) / 2;
    }

    @Override
    public void mostrarArea() {

        System.out.println("El area del triangulo es: " + area());

    }

}
