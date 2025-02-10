package repository;

import java.util.ArrayList;
import model.*;

public class SocioRepository {
    private static ArrayList<Socio> socios = new ArrayList<>();
    
    public static void add(Socio socio){
        socios.add(socio);
    }
    
    public static Socio buscar(int documento){
        for (Socio socio : socios) {
            if(socio.getDni() == documento){
                return socio;
            }
        }
        return null;
    }
}
