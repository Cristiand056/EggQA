package javarelacionesclasesEjer2.entities;

public class Jugador {

    private Integer id;
    private String nombre;
    private Boolean mojado;
    private Integer numerojugadores;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = false;
        this.numerojugadores = 6;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    public Integer getNumerojugadores() {
        return numerojugadores;
    }

    public void setNumerojugadores(Integer numerojugadores) {
        this.numerojugadores = numerojugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean disparo(Revolver r, Jugador j) {
        if (r.mojar(r))
        {
            j.setMojado(true);
            return true;
        } else
        {
            r.siguienteChorro(r);
            return false;
        }

    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + ", numerojugadores=" + numerojugadores + '}';
    }

}
