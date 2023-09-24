public class Conta {

    double saldo = 1000.0;
    double novoSaldo = 0.0;
    double valorParcela = 50.0;
    double valorMontante = 0.0;
    double valorCalculado = 0.0;

    public void sacar(Double valor) {

        if (valor < saldo) {
            novoSaldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    public double calcularDivida() {
        for (int x = 1; x <= 5; x++) {
            valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        return valorMontante;
    }

}
