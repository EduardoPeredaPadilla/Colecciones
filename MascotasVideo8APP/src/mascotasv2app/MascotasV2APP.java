package mascotasv2app;

import Entidades.Mascota;
import Services.MascotaService;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class MascotasV2APP {


    public static void main(String[] args) {
        
        HashMap<Integer, Mascota> mascotas = new HashMap();
        
        mascotas.put(1, new Mascota("Mal", "Maya", "Perro"));
        mascotas.put(666, new Mascota("Darks", "Moona", "Gato"));
        
//        mascotas.remove(1, new Mascota("Mal", "Maya", "Perro"));
        mascotas.remove(1);
        
        for (Map.Entry<Integer, Mascota> aux : mascotas.entrySet()) {
            Integer key = aux.getKey();
            Mascota value = aux.getValue();
            
            System.out.println("Key " + key + " valor " + value);
        }

        
    }

}
