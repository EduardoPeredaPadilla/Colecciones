package Services;

import Entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MascotaService {
    
    private final Scanner scan ;
    private final List<Mascota> mascotas;

    public MascotaService() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList<Mascota>();
    }
    
    
    
    public Mascota crearMascota() {
        
        System.out.println("Introducir nombre");
        String nombre = scan.next();
        
        System.out.println("Introducir apodo");
        String apodo = scan.next();
        
        System.out.println("Introducir tipo");
        String tipo = scan.next();
        
        return new Mascota(nombre, apodo, tipo);
        
    }
    
    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }
    
    
    public void mostrarMascotas() {
        
        System.out.println("Las mascotas actuales de la lista mascotas son :");
        for (Mascota aux : mascotas) {
            
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = " + mascotas.size());
        
    }
    
    /**
     * Crea mascotas, solo Mayas
     * @param cantidad equivale  la cantidad de mascotas a crear y añadir ala lista
     */
    public void fabricaDeMayas(int cantidad) {
        
        for (int i = 0; i < cantidad; i++) {

            mascotas.add(new Mascota("DelMal", "Maya", "Perro"));
            
        }
        
    }
    
    /**
     * Crea mascotas introducidas por teclado
     * @param cantidad equivale  la cantidad de mascotas a crear y añadir ala lista
     */
    public void fabricaDeMascotas(int cantidad) {
        
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            agregarMascota(mascotaCreada);
            System.out.println(mascotaCreada.toString());
        }
        
    }
    //ToDo añadir Try and catch
//    public void actualizarMascota(int index) {
//        
//        Mascota m = mascotas.get(index);
//        m.setApodo("LaMoonita");
//    }
    
    public void actualizarMascota(int index) {
        
        if (index <= mascotas.size() - 1) {
            System.out.println("");
            System.out.println("----------Actualizar---------");
            Mascota m = crearMascota();
            mascotas.set(index, m);
        } else {    
            System.out.println("Fallo al actualzar, el índice es erroneo");
        }
    }
    
    public void eliminarMascota(int index) {
        
        if (index <= mascotas.size() - 1) {
            System.out.println("");
            System.out.println(" ---------- Eliminar ----------");
            mascotas.remove(index);
        }else {    
            System.out.println("Fallo al eliminar, el índice es erroneo");
        }
    }
    
    public void eliminarMascotaPorNombre(String nombre) {
        
        for (int i = 0; i < mascotas.size(); i++) {
            
            Mascota m = mascotas.get(i);
            if (m.getNombre().equals(nombre)) {
                mascotas.remove(i);
            }
            
        }
    }
        
        public void actualizarMascotaPorNom(String nombreViejo, String nombreNuevo) {
            
            for (int i = 0; i < mascotas.size(); i++) {
            
            Mascota m = mascotas.get(i);
            if (m.getNombre().equals(nombreViejo)) {
                m.setNombre(nombreNuevo);
            }
            
        }
        }
}
