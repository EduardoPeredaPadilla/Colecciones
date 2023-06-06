package Utilidades;

import Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Pelicula> ordenarPeliMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
        public static Comparator<Pelicula> ordenarPeliMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
        
        public static Comparator<Pelicula> ordenarPeliTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
        
        public static Comparator<Pelicula> ordenarPeliDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };

    
}
