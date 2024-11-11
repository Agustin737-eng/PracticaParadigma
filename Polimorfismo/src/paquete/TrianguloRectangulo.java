
package paquete;

public class TrianguloRectangulo extends Figura{
    private int base;
    private int altura;
   
    //<editor-fold desc="Constructors">
    public TrianguloRectangulo(int base, int altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public TrianguloRectangulo() {
    }
    
    // </editor-fold>
    
    // <editor-fold desc="getters and setters">>  
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    // </editor-fold>
    
    @Override
    public void dibujar() {
        System.out.println("base: "+base+" altura: "+ altura);
    }
}
