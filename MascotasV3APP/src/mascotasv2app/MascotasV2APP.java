package mascotasv2app;

import Entidades.Mascota;
import Services.MascotaService;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;


public class MascotasV2APP {


    public static void main(String[] args) {
        
//        ArrayList<ArrayList<String>> matriz = new ArrayList();
        ArrayList<Mascota> mascotas = new ArrayList();
        
        mascotas.add(new Mascota("Darks", "Maya", "Perro"));
        mascotas.add(new Mascota("Darks", "Maya", "Perro"));
        mascotas.add(new Mascota("Darks", "Maya", "Perro"));
        mascotas.add(new Mascota("Mal", "Moona", "Gato"));
        mascotas.add(new Mascota("Mal", "Moona", "Gato"));
        mascotas.add(new Mascota("Mal", "Moona", "Gato"));
        
        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
        
        Collections.shuffle(mascotas);
        
        
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
        
    }

}
