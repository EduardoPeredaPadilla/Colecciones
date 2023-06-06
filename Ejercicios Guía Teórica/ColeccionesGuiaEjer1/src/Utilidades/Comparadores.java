package Utilidades;

import Entidades.Perro;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Perro> ordenarPorRaza = new Comparator<Perro>() {
        @Override
        public int compare(Perro t, Perro t1) {
            return t.getRaza().compareTo(t1.getRaza());
        }
    };
    
}
