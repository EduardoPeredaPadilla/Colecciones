package Services;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {
    
    Scanner scan = new Scanner(System.in);
    public ArrayList<Alumno> alumnos = new ArrayList();
    
    public void crearAlumno() {
        
        Alumno alum = new Alumno();
        ArrayList<Integer> notas = alum.getNotas();
        Integer nota;
        String resp;
        boolean validar = true;
        
        System.out.println("Ingrese el nombre del alumno");
            alum.setNombre(scan.next());
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i + 1));
                nota = scan.nextInt();
                notas.add(nota);
            }
            
            alumnos.add(alum);
            
            do {
                
                System.out.println("Desea agregar un nuevo alumno");
                System.out.println("(S) Si");
                System.out.println("(N) No");
                resp = scan.next();
                if (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
                    System.out.println("Opción inválida");
                } 
            } while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n"));
            
            if (resp.equalsIgnoreCase("s")) {
                crearAlumno();
            }
//        return alum;
    }
    
    public void mostrarAlumnos() {
        
        System.out.println(alumnos);
        
    }
    
    public double promAlumno(String alumBuscado) {
        
        double prom;
        int suma = 0;
        int cantNotas = 0;
        
        for (Alumno alumno : alumnos) {
            System.out.println("alumno lista = " + alumno.getNombre());
            System.out.println("alum buscado = " + alumBuscado);
            if (alumno.getNombre().equals(alumBuscado)) {
                for (int i = 0; i < alumno.getNotas().size(); i++) {
                    suma = alumno.getNotas(i) + suma;
                }
            } else {
                System.out.println("El alumno buscado no se encuentra en la lista");
                return prom = 0;
            }
            cantNotas = alumno.getNotas().size();
        }
        
        prom = suma / cantNotas;
        
        return prom;
    }

    @Override
    public String toString() {
        return "AlumnoService{" + "alumnos=" + alumnos + '}';
    }
    
    
    
}
