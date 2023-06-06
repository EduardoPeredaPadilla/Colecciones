package Services;

import Entidades.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PaisService {
    
    Scanner scan = new Scanner(System.in);
    Set<Pais> paises = new TreeSet();
    
    public void agregarPais() {
        
//        Pais pais = new Pais();
        String agregar;
        boolean add = true;
        String nombrePais;
        
        do {
            System.out.println("Ingrese el nombre de un pais");
//            pais.setNombre(scan.next());
            nombrePais = scan.next();
            paises.add(new Pais(nombrePais));
            System.out.println("Desea agregar otro pais");
            System.out.println("(s) Si");
            System.out.println("(n) No");
            agregar = scan.next();
            if (!agregar.equalsIgnoreCase("s") && !agregar.equalsIgnoreCase("n")) {
                System.out.println("Opcón inválida");
            }
            if(agregar.equalsIgnoreCase("n")) {
                add = false;
            }
            
        } while (add);
        
        
    }
    
    public void mostrarPaises() {
        paises.forEach((e) -> System.out.println(e));
//        for (Pais pais : paises) {
//            System.out.println(pais);
//        }
    }
    
    public void buscarPais() {
        
        System.out.println("Ingrese el pais a buscar y eliminar");
        Pais pais = new Pais(scan.next());
        int cont = 0;
        
        Iterator<Pais> itPaises = paises.iterator();
        
        
        
        while (itPaises.hasNext()) {
            Pais aux = itPaises.next();
            if(aux.equals(pais)) {
                itPaises.remove();
                mostrarPaises();
                return;
            } else {
                cont++;
            }
        }
        
//        System.out.println("Cantidad de paises = " + paises.size());
//        System.out.println(cont);
        
        if (cont == paises.size() ) {
            System.out.println("El pais buscado no se encuentra");
        }
        
    }
    
}
