
package guia8_ejextra03;



import Entidad.Raices;
import Service.RaicesService;

public class Guia8_ejExtra03 {

    public static void main(String[] args) {
       
        RaicesService rs = new RaicesService();
        Raices r1 = rs.crearRaiz();
        
        rs.getDiscriminante(r1);
            
        rs.calcular(r1);
      
    }
    
}
