package coleccionesguiaejer4;

import Services.PeliculaService;
import java.util.Scanner;

public class ColeccionesGuiaEjer4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        PeliculaService peliServ = new PeliculaService();
        
        peliServ.crearPelicula();
        peliServ.mostrarPeliculas();
        peliServ.mostrarPeliMayorUnaHora();
        peliServ.mostrarPeliDeMayor();
        peliServ.mostrarPeliDeMenor();
        peliServ.mostrarPeliPorTitulo();
        peliServ.mostrarPeliPorDirector();
    }

}
