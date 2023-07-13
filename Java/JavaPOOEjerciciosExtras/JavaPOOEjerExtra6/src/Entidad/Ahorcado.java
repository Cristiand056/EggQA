package Entidad;

public class Ahorcado {

    public String[] palabraABuscar;
    public int cantLetrasEncotradas;
    public int cantJuagdasMax;
    private String[] mostrar;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraABuscar, int cantLetrasEncotradas, int cantJuagdasMax) {
        this.palabraABuscar = palabraABuscar;
        this.cantLetrasEncotradas = cantLetrasEncotradas;
        this.cantJuagdasMax = cantJuagdasMax;
    }

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getCantLetrasEncotradas() {
        return cantLetrasEncotradas;
    }

    public void setCantLetrasEncotradas(int cantLetrasEncotradas) {
        this.cantLetrasEncotradas = cantLetrasEncotradas;
    }

    public int getCantJuagdasMax() {
        return cantJuagdasMax;
    }

    public void setCantJuagdasMax(int cantJuagdasMax) {
        this.cantJuagdasMax = cantJuagdasMax;
    }

    public String[] getMostrar() {
        return mostrar;
    }

    public void setMostrar(String[] mostrar) {
        this.mostrar = mostrar;
    }
    
}
