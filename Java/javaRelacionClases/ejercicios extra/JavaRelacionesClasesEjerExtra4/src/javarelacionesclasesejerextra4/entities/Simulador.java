/*
• La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.

 Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.
 */
package javarelacionesclasesejerextra4.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import javarelacionesclasesejerextra4.data.Data;
import javarelacionesclasesejerextra4.data.utils.Comparators;

public class Simulador {

    private ArrayList<String> generarNombresCompletos(ArrayList<String> nombres, ArrayList<String> apellidos) {
        ArrayList<String> salida = new ArrayList<>();
        nombres.forEach((_item) ->
        {
            int i = (int) (Math.random() * 19);
            salida.add(_item+" " + apellidos.get(i));
        });
        return salida;
    }

    private HashSet<Integer> generarDNIs(ArrayList<String> nombresCompletos) {
        HashSet<Integer> salida = new HashSet<>();

        for (String nombres : nombresCompletos)
        {
            String aux = "";
            int max = (int) ((Math.random() * 9 ));
            if(max < 4){
                max += 5;
            }
            for (int i = 0; i < max; i++)
            {
                int r = (int) (Math.random() * 9);
                aux = aux + String.valueOf(r);
            }
            salida.add(Integer.valueOf(aux));
        }
        return salida;
    }

    public ArrayList<Alumno> crearAlumnos() {
        ArrayList<String> nombresCompletos = new ArrayList<>();
        HashSet<Integer> DNIs = new HashSet<>();
        ArrayList<Alumno> salida = new ArrayList<>();
        nombresCompletos = generarNombresCompletos(Data.nombres, Data.apellidos);
        DNIs = generarDNIs(nombresCompletos);
        int i = 0;
        for (Integer DNI : DNIs)
        {
            salida.add(new Alumno(nombresCompletos.get(i), DNI));
            i++;
        } 
        
        return salida;
    }
    
    public ArrayList<Voto> votacion(ArrayList<Alumno> al){
        ArrayList<Voto> votos = new ArrayList<>();
        for (Alumno alumno : al)
        {
            votos.add(new Voto(alumno, alumnosRandom(alumno, al)));
        }
        return votos;
    }
    private HashSet<Alumno> alumnosRandom(Alumno alumno, ArrayList<Alumno> al){
        int cont1 = 0; 

        HashSet<Alumno> salida = new HashSet<>();
        while(cont1 <= 3){
             int r = (int) (Math.random() * 19);
             Alumno a = al.get(r);
            if(!alumno.equals(a) & !salida.contains(a)){
                a.setCantidadVotos(a.getCantidadVotos()+1);
                salida.add(a);
                cont1++;
            }
        }
        return salida;
    }
    
    public void recuentoVotos(ArrayList<Alumno> al){
        /*Alumno aux = new Alumno();
        
        for(int i = 0; i < al.size(); i++){
            for (int j = 0; j < al.size(); j++)
            {
                if(al.get(i).getCantidadVotos() > al.get(j).getCantidadVotos()){
                    aux = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, aux);
                }
            }
        }*/
        
        Collections.sort(al, Comparators.compararVotos);
        
        for (int i = 0; i < 10; i++)
        {
            if(i < 5){
                System.out.println("facilitador "+(i+1)+" es: "+al.get(i).toString());
            }else{
                System.out.println("facilitador suplente "+(i+1-5)+" es: "+al.get(i).toString());
            }
        }
    }
}
