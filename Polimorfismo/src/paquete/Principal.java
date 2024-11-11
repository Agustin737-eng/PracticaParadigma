package paquete;

public class Principal {

    public static void main(String[] args) {
       Cuadrado c = new Cuadrado(5);
       Rectangulo r = new Rectangulo(6, 3);
       TrianguloRectangulo tr = new TrianguloRectangulo(3,5);
       
       Figura[] figura = new Figura[3];
       figura[0] = c;
       figura[1] = r;
       figura[2] = tr;
       
        for (Figura figura1 : figura) {
            //Polimorfismo: le digo a las figuras que estan dentro de mi arreglo de figuras que se dibujen
            //cada figura se dibuja como lo implemento en su clase
            figura1.dibujar();
        }
    }
    
}
