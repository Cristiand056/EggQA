package Entidad;

public class Cuenta {
    private int numeroCuenta;
    private long DNI_cliente;
    private int saldo_actual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI_cliente, int saldo_actual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI_cliente = DNI_cliente;
        this.saldo_actual = saldo_actual;
    }
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI_cliente() {
        return DNI_cliente;
    }

        public void setDNI_cliente(long DNI_cliente) {
        this.DNI_cliente = DNI_cliente;
    }

    public int getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(int saldo_actual) {
        this.saldo_actual = saldo_actual;
    }
    
    
}
