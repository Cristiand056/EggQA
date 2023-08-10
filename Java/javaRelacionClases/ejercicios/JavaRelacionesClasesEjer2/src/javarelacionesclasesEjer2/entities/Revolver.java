package javarelacionesclasesEjer2.entities;

import java.util.Objects;

public class Revolver {

    private Integer posicionActual;
    private Integer posicionAgua;

    public Revolver() {
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public Revolver llenarRevolver() {
        Revolver r = new Revolver();

        r.setPosicionActual((int) (Math.random() * 6 + 1));
        r.setPosicionAgua((int) (Math.random() * 6 + 1));
        return r;
    }

    public Boolean mojar(Revolver r) {
        return Objects.equals(r.getPosicionActual(), r.getPosicionAgua());
    }

    public void siguienteChorro(Revolver r) {
        if (r.getPosicionActual() < 6)
        {
            r.setPosicionActual(r.getPosicionActual() + 1);
        } else
        {
            r.setPosicionActual(1);
        }
    }

    @Override
    public String toString() {
        return "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua;
    }

}
