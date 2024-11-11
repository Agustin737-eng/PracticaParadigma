package paquete;

public class Cuadrado extends Figura{
    private int lado;

    public Cuadrado(int lado, String color) {
        super(color);
        this.lado = lado;
    }

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    
    //sobre escribimos la clase padre
    @Override
    public void dibujar(){
        System.out.println("Soy un cuadrado de lado: " + lado);
    }
}
