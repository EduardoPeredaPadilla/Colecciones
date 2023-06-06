package coleccionesguiaejer5;

import Services.PaisService;
import java.util.Scanner;

public class ColeccionesGuiaEjer5 {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        PaisService pServ = new PaisService();
        pServ.agregarPais();
        pServ.mostrarPaises();
        pServ.buscarPais();
    }

}
