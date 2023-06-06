package mascotasv2app;

import Entidades.Mascota;
import Services.MascotaService;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class MascotasV2APP {


    public static void main(String[] args) {
        
//        HashSet<String> nombres = new HashSet();
//        TreeSet<String> nombres = new TreeSet();
//        
//        nombres.add("Moona");
//        nombres.add("Moona");
//        nombres.add("Moona");
//        
//        for (String nombre : nombres) {
//            System.out.println(nombre);
//        }

        Set<Mascota> mascotas = new TreeSet();
        
        
        mascotas.add(new Mascota("Darks", "Moona", "Gato"));
        mascotas.add(new Mascota("Darks", "Moona", "Gato"));
        mascotas.add(new Mascota("Darks", "Moona", "Gato"));
        mascotas.add(new Mascota("Mal", "Maya", "Perro"));
        mascotas.add(new Mascota("Mal", "Maya", "Perro"));
        mascotas.add(new Mascota("Mal", "Maya", "Perro"));
        mascotas.add(new Mascota("Zoo", "Zaaa", "Perro"));
        
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
        
    }

}
