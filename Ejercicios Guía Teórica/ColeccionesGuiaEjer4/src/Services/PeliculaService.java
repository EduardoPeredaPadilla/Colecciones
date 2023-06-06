package Services;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaService {
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> listaPelisculas = new ArrayList();
                
    public void crearPelicula() {

        boolean agregar = true;
        int duracion;
        String resp;
        
        Pelicula peli = new Pelicula();
            System.out.println("Ingrese el nombre de la pelicula");
            peli.setTitulo(scan.next());
            System.out.println("Ingrese el director de la pelicula");
            peli.setDirector(scan.next());
            System.out.println("Ingrese la duración de la pelicula en horas");
            duracion = scan.nextInt();
            peli.setDuracion(duracion);
            listaPelisculas.add(peli);
            
            do {
                
                System.out.println("Desea agregar otra pelicula");
                System.out.println("(S) Si");
                System.out.println("(N) No");
                resp = scan.next();
                if (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
                    System.out.println("Opción inválida");
                } 
            } while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n"));
            
            if (resp.equalsIgnoreCase("s")) {
                crearPelicula();
            }
        
    }
    
    public void mostrarPeliculas() {
        System.out.println("***** LISTA DE PELICULAS ********");
        for (Pelicula pelicula : listaPelisculas) {
            System.out.println(pelicula);
        }
    }
    
    public void mostrarPeliMayorUnaHora() {
        System.out.println("***** LISTA DE PELICULAS + 1 HORA ********");
        for (Pelicula pelicula : listaPelisculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }
    
    
    public void mostrarPeliDeMayor() {
        System.out.println("***** LISTA DE PELICULAS ORDENADAS DE MAYOR DURACIÓN ********");
        Collections.sort(listaPelisculas, Comparadores.ordenarPeliMayor);
        for (Pelicula pelicula : listaPelisculas) {
            System.out.println(pelicula);
        }
        
    }
    
    public void mostrarPeliDeMenor() {
        System.out.println("***** LISTA DE PELICULAS ORDENADAS DE MENOR DURACIÓN ********");
        Collections.sort(listaPelisculas, Comparadores.ordenarPeliMenor);
        for (Pelicula pelicula : listaPelisculas) {
            System.out.println(pelicula);
        }
        
    }

   public void mostrarPeliPorTitulo() {
       System.out.println("***** LISTA DE PELICULAS ORDENADAS POR TÍTULO ********");
       Collections.sort(listaPelisculas, Comparadores.ordenarPeliTitulo);
       for (Pelicula pelicula : listaPelisculas) {
            System.out.println(pelicula);
        }
   }
   
   public void mostrarPeliPorDirector() {
       System.out.println("***** LISTA DE PELICULAS ORDENADAS POR TÍTULO ********");
       Collections.sort(listaPelisculas, Comparadores.ordenarPeliDirector);
       for (Pelicula pelicula : listaPelisculas) {
            System.out.println(pelicula);
        }
   }

    @Override
    public String toString() {
        return "PeliculaService{" + "listaPelisculas=" + listaPelisculas + '}';
    }
    
    
    
}
