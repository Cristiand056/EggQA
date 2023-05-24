package javaejercicioextra2;


public class JavaEjercicioExtra2 {

    public static void main(String[] args) {
        int A, B, C, D, aux;
        A = 1;
        B = 2;
        C = 3;
        D = 4;
        
        aux = B;
        B = C;
        C=A;
        A=D;
        D = aux;
        System.out.println("Valor inicla de A "+C+" y su valor final es "+A);
        System.out.println("Valor inicla de B "+D+" y su valor final es "+B);
        System.out.println("Valor inicla de C "+B+" y su valor final es "+C);
        System.out.println("Valor inicla de D "+A+" y su valor final es "+D);
    }
    
}
