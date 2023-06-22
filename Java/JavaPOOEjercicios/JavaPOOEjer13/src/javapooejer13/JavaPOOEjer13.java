package javapooejer13;

import Entidad.Curso;
import Servicios.CursoServicios;

public class JavaPOOEjer13 {

    public static void main(String[] args) {
        CursoServicios cs = new CursoServicios();
        Curso c = cs.crearCurso();
        float cg = cs.calcularGananciaSemanal(c);
        System.out.println("La ganacia semanal del curso es: " + cg);

    }

}
