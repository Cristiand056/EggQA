
package javaherenciaejerextra4.emuns;


public enum NumeroDespacho {
    A(101), B(201), C(301), D(401);
    public int mumero;

    private NumeroDespacho(int mumero) {
        this.mumero = mumero;
    }
    
}
