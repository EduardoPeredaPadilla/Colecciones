package Utilidades;

import Entidades.Mascota;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Mascota> ordenarPorNombreDesc = new Comparator<Mascota> () {
        @Override
        public int compare(Mascota t, Mascota t1) {
            return t1.getNombre().compareTo(t.getNombre());
        }
    };
    
    public static Comparator<Mascota> ordenarPorEdadDesc = new Comparator<Mascota> () {
        @Override
        public int compare(Mascota t, Mascota t1) {
            return t1.getEdad().compareTo(t.getEdad());
        }
    };
    
}
