package repository;

import java.util.ArrayList;
import model.*;

public class LibroRepository {
    private static ArrayList<Libro> libros = new ArrayList<>();
    
    public static void add(Libro libro){
        libros.add(libro);
    }
    
    public static Libro buscar(int codigo){
        for (Libro libro : libros) {
            if(libro.getCodigo() == codigo){
                return libro;
            }
        }
        return null;
    }
}
