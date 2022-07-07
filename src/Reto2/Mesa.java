package Reto2;

public class Mesa extends Mueble {

    private int numPatas;

    public Mesa(int ancho, int alto, int largo, int numPatas) {
        // Llamamos al constructor del padre para asignar -> alto, ancho y largo
        super(ancho, alto, largo);
        this.numPatas = numPatas;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    // Sobreescribimos el método imprimir
    @Override
    public void imprimir() {

        super.imprimir();
        System.out.println("Número de patas = " + numPatas);
    }

}
