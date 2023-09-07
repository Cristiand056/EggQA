/*
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa.
 */
package javaherenciaejerextra3.entities;

public class ExtraHotelero {

    protected Boolean privado;
    protected Integer m2;

    public ExtraHotelero() {
    }

    public ExtraHotelero(Boolean privado, Integer m2) {
        this.privado = privado;
        this.m2 = m2;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getM2() {
        return m2;
    }

    public void setM2(Integer m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return "ExtraHotelero{" + "privado=" + privado + ", m2=" + m2 + '}';
    }

}
