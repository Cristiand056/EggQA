/*
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
package javarelacionesclasesejerextra2.services;

import javarelacionesclasesejerextra2.entities.Asiento;
import javarelacionesclasesejerextra2.entities.Espectador;
import javarelacionesclasesejerextra2.entities.Pelicula;
import javarelacionesclasesejerextra2.entities.Sala;



public class SalaService {
    
    public Sala crearSala(Pelicula p, Asiento[][] a, Double pre){
        Sala s = new Sala(p, a, pre);
        return s;
    }
    
    public int asignarAsiento(Sala s, Espectador es, int fila, int col){
        int code = 0;
        Asiento[][] aux = s.getAsientos();
        if(es.getDineroDisponible() >= s.getPrecioEntrada() & es.getEdad() >= s.getPelicula().getEdadMinima()){
            if(aux[fila][col].getOcupado().equals("X")){
                aux[fila][col].setOcupado(" ");
                aux[fila][col].setEspectador(es);
                s.setAsientos(aux);
                
                return  code = 200;
            }else{
                System.out.println("Asiento ocupado");
                return code = 300;
            }
        
        }else{
            System.out.println("No cumple con los requistos");
              return code=400;
        } 
    }
    
    public void mostarSala(Sala s){
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                System.out.print("|"+s.getAsientos()[i][j].toString()+"| ");
            }
            System.out.println("");
        }
    }
}
