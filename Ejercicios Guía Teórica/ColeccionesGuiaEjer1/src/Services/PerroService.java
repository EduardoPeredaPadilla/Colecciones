package Services;

import Entidades.Perro;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class PerroService {
    
    Scanner scan = new Scanner(System.in);
    ArrayList<String> perros = new ArrayList();
    
    public Perro crearPerro() {
        
        Perro p = new Perro();
        boolean validar = true;
        
        while (validar == true) {           
            System.out.println("Ingrese la raza del perro");
            p.setRaza(scan.next());
            perros.add(String.valueOf(p));
            String resp;
            do {
                System.out.println("Desea agregar otro perro");
                System.out.println("(S) Si");
                System.out.println("(N) No");
                resp = scan.next();
                if (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
                    System.out.println("Opción inválida");
                }
            } while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n"));
            
            if (resp.equalsIgnoreCase("n")) {
                validar = false;
            }
        }
        return p;
    }
    
    public void mostrarPerros(Perro p) {
        
        for (String perro : perros) {
            System.out.println(perro);
        }
        
    }
    
    public void buscarPerro(Perro p) {
  
        System.out.println("Ingrese una raza de perro para buscarla en la lista");
        String raza = scan.next();
        
        Perro perroBuscado = new Perro(raza);
        
        Iterator<String> itPerros = perros.iterator();
        
        while (itPerros.hasNext()) {       
            String aux = itPerros.next();
            if (aux.equals(perroBuscado.toString())) {
                itPerros.remove();
            }
            else {
                System.out.println("El pero buscado no se encuentra en la lista");
            }
        }
        Collections.sort(perros);
        perros.forEach((e) -> System.out.println(e));
    }
    
}
