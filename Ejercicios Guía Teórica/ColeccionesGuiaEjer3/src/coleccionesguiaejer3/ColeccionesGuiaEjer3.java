package coleccionesguiaejer3;

import Entidades.Alumno;
import Services.AlumnoService;
import java.util.Scanner;

public class ColeccionesGuiaEjer3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        AlumnoService  alumServ = new AlumnoService();
        alumServ.crearAlumno();
        
        alumServ.mostrarAlumnos();
        
        System.out.println("Ingrese el nombre del alumno para calcular su promedio final");
        System.out.println("El promedio del alumno buscado es " + alumServ.promAlumno(scan.next()));
        
    }

}
