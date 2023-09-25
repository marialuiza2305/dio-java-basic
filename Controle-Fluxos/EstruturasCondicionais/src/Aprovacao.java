public class Aprovacao {
    public static void main(String[] args) throws Exception {

        double ap1 = 9.5;
        double ap2 = 6.0;
        double ap3 = 5.0;

        double media = (ap1 + ap2 + ap3)/3;

        //Condição encadeada
        if(media >= 7) {
            System.out.println("Aprovado");
        } else if(5 < media && 7 > media) {
            System.out.println("AF");
        } else {
            System.out.println("Reprovado");
        }

        //Condição ternária
        String resultado = media >= 7 ? "Aprovado" : media > 5 && media < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
