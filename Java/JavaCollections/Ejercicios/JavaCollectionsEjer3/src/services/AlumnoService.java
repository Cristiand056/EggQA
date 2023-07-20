package services;

import entities.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Alumno> alumnos;

    public AlumnoService() {
        this.alumnos = new ArrayList();
    }

    public void crearAlumnos() {
        while (true)
        {
            System.out.println("Ingrese los datos del alumno: ");
            Alumno a = new Alumno();
            System.out.println("Ingrese el nombre");
            a.setNombre(leer.next());
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.println("Ingrese la primer nota");
            notas.add(leer.nextInt());
            System.out.println("Ingrese la segunda nota");
            notas.add(leer.nextInt());
            System.out.println("Ingrese la tercer nota");
            notas.add(leer.nextInt());

            a.setNotas(notas);

            alumnos.add(a);

            System.out.println("Desea ingresar otro alumno ingrese 's', de lo contrario ingrese cúlaquier otra letra ");
            if (!leer.next().equals("s"))
            {
                break;
            }
        }

    }
    
    public double notaFinal(){
        
        System.out.println("Ingrese el nombre del alumno");
        String nombre = leer.next();
        Iterator<Alumno> it = alumnos.iterator();
        double prom = 0.00;
        Integer sum = 0;
        boolean b= false;
       
        while(it.hasNext()){
            if(it.next().getNombre().equals(nombre)){
                sum = it.next().getNotas().get(0)+it.next().getNotas().get(1)+it.next().getNotas().get(2);
                b = true;
                break;
            }
        }
        
        if(!b){
            System.out.println("No se encontro el alumno");
        }
        
        prom = (double) sum/3;
        
        return prom;
    }
}
