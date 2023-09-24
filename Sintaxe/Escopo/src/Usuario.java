public class Usuario {
    public static void main(String[] args) {
        
        Conta conta = new Conta();

        System.out.println("O saldo atual é: " + conta.saldo);

        conta.sacar(500.00);
        System.out.println("O novo saldo após sacar: " + conta.novoSaldo);

        conta.calcularDivida();
        System.out.println("Sua dívida é: " + conta.valorMontante);

    }
}
