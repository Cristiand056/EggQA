package Entidad;


public class Cafetera {
    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    public void llenarCafetera(){
        capacidadActual = capacidadMaxima;
    }
    
    public void servirTaza(int tTaza){
        if(capacidadActual - tTaza   < 0){
            System.out.println("La taza no se lleno, se ingreseso "+capacidadActual+" llame a mantenimento");
            capacidadActual = 0;
        }else{
            capacidadActual = capacidadActual - tTaza;
            System.out.println("La taza se lleno sin problemas");
        }
    }
    
    public void vaciarCafetera(){
        capacidadActual = 0;
    }
    
    public void agregarCafe(int nC){
        if(nC > capacidadMaxima || nC+capacidadActual > capacidadMaxima){
            capacidadActual = capacidadMaxima;
        }else{
            capacidadActual = capacidadActual+nC;
        }
    }
}
