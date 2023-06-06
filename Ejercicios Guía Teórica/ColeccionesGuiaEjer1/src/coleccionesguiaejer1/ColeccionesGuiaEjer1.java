package coleccionesguiaejer1;

import Entidades.Perro;
import Services.PerroService;
import java.util.Scanner;

public class ColeccionesGuiaEjer1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        PerroService pServ = new PerroService();
        Perro p = pServ.crearPerro();
        pServ.mostrarPerros(p);
        
        //Para el Ejercicio 2
        pServ.buscarPerro(p);

        
    }

}
