package mascotasv2app;

import Entidades.Mascota;
import Services.MascotaService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MascotasV2APP {


    public static void main(String[] args) {

        MascotaService mascServ = new MascotaService();
        
        //mascServ.fabricaDeMayas(5);
        mascServ.fabricaDeMascotas(1);
        
        mascServ.mostrarMascotas();
        
        //mascServ.actualizarMascota(0);
//        mascServ.eliminarMascota(0);

        mascServ.eliminarMascotaPorNombre("Darks");
        
        mascServ.mostrarMascotas();
        
//        List <String> nombres = new ArrayList();
//        
//        nombres.add("Maya");
//        nombres.add("Moona");
//        nombres.add("Darks");

        
//        for (String aux : nombres) {
//            if (aux.equals("Darks")) {
//                nombres.remove(aux);
//            } 
//        }
//
//        for (int i = 0; i < nombres.size(); i++) {
//            
//            String m = nombres.get(i);
//            if (m.equals("Darks")) {
//                nombres.remove(m);
//            }
//        }


////Iterator
//        Iterator<String> it = nombres.iterator();
//        
//        while (it.hasNext()) {
//            String aux = it.next();
//            if (aux.endsWith("Darks")) {
//                it.remove();
//            }
//        }
//        
//        
//        nombres.forEach((e) ->System.out.println(e));
        
        


    }

}
