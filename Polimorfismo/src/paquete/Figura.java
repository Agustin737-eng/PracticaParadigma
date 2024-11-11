package paquete;

public abstract class Figura {
    //La definimos como clase abstracta por que solo la usaremos como clase padre y no vamos a tener instancias de esta clase
    
    private String color;

    public Figura() {
    }

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //definos el metodo abstracto. Esto significa que todas las clases hijas implementaran este metodo
    //public void dibujar () {} => definirlo de esta forma implica que todavia el metodo no esta terminado 
    public abstract void dibujar();
}
