/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsejerextra3.entities;

import java.util.HashSet;

/**
 *
 * @author USER
 */
public class Libro {

    private String titulo;
    private String autor;
    private Integer numeroEjemplares;
    private Integer numeroEjemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer numeroEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(Integer numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public Integer getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(Integer numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    public boolean prestamo(HashSet<Libro> l, String crit) {
        boolean b = false;
        for (Libro libro : l)
        {
            if (libro.getTitulo().equals(crit))
            {
                if (libro.getNumeroEjemplares() >= libro.getNumeroEjemplaresPrestados())
                {
                    libro.setNumeroEjemplaresPrestados(libro.getNumeroEjemplaresPrestados() + 1);
                    b = true;
                }

            }
        }

        return b;
    }

    public boolean devolucion(HashSet<Libro> l, String crit) {
        boolean b = false;
        for (Libro libro : l)
        {
            if (libro.getTitulo().equals(crit))
            {
                if (libro.getNumeroEjemplaresPrestados() > 0)
                {
                    libro.setNumeroEjemplaresPrestados(libro.getNumeroEjemplaresPrestados() - 1);
                    b = true;
                }

            }
        }

        return b;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numeroEjemplares=" + numeroEjemplares + ", numeroEjemplaresPrestados=" + numeroEjemplaresPrestados + '}';
    }

}
