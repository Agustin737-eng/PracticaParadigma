package repository;

import java.util.ArrayList;
import model.*;

public class PrestamoRepository {
    private static ArrayList<Prestamo> prestamos = new ArrayList<>();

    public static void add(Prestamo prestamo) {
        prestamos.add(prestamo);
    }
    
    public static ArrayList<Prestamo> getPrestamosBySocio(int documento){
        ArrayList<Prestamo> prestamosSocio = new ArrayList<>();
        
        for (Prestamo prestamo : prestamosSocio) {
            if(prestamo.getSocio().getDni() == documento){
                prestamosSocio.add(prestamo);
            }
        }
        
        return prestamosSocio;
    }
}
