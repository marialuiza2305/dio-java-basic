public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 100;
        double valorSolicitado = 70;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
    }
}