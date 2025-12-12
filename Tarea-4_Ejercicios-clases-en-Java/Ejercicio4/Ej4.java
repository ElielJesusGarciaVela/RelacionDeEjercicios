class CuentaBancaria {
    double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    void depositar(double cantidad) {
        saldo += cantidad;
    }

    void retirar(double cantidad) {
        if (saldo - cantidad >= 0) {
            saldo -= cantidad;
        } else {
            System.out.println("Error: saldo insuficiente");
        }
    }
}

public class Ej4 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        System.out.println("Saldo actua: "+cuenta.saldo);
        cuenta.depositar(1000);
        System.out.println("Saldo despues de depositar €1000: "+cuenta.saldo);
        cuenta.retirar(1500);
        System.out.println("Saldo despues de retirar €1500: "+cuenta.saldo);
    }
}
