package src;

public class ContaBancaria {

    static class CuentaBancaria {
        private String titular;
        private double saldo;

        public CuentaBancaria(String titular) {
            this.titular = titular;
            this.saldo = 0.0;
        }

        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
            }
        }

        public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
            }
        }

        public void mostrarSaldo() {
            System.out.println("Titular: " + titular);
            System.out.println("Saldo atual: " + saldo);
        }
    }

    public static void main(String[] args) {
        CuentaBancaria conta = new CuentaBancaria("Brian");

        conta.depositar(500);
        conta.sacar(200);
        conta.mostrarSaldo();
    }
}
