package main;
import java.util.ArrayList;
import model.*;
import repository.*;


public class Main {
    public static void main(String[] args) {
        
        LibroRepository.add(new Libro(1, "harry potter", 20));
        LibroRepository.add(new Libro(2, "hobbit", 50));
        LibroRepository.add(new Libro(3, "el señor de los anillos", 40));
        LibroRepository.add(new Libro(4, "UML y patrones", 30));
        
        //socio - nuevo socio
        SocioRepository.add(new Socio(41184645, "Agustin", "Sanchez", 1, 46468));
        
        //create Prestamos 
        Libro libroPrestado = LibroRepository.buscar(2);
        Socio socioPrestamo = SocioRepository.buscar(41184645);
        
        //validacion
        crearPrestamo(libroPrestado, socioPrestamo, 20);
    }
    
    public static void crearPrestamo(Libro libro, Socio socio, int cantidad){
        if(libro.getStock()<=cantidad){
            System.err.println("cantidad insuficiente para realizar el prestamo");
            return;
        }
        
        int cantidadPrestamos = socio.cantidadPrestamos();
        
        if(cantidadPrestamos>=3){
            System.err.println("socio invalido para solicitar otro prestamo");
            return;
        }
        
        Prestamo prestamo = new Prestamo(socio, libro, cantidad);
        //prestamo.guardar();
    }
   
}
