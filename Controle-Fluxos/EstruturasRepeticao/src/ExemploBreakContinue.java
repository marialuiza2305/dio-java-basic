public class ExemploBreakContinue {
    public static void main(String[] args) {

        //for com o break
        for (int numero = 1; numero <=5; numero ++) {
            if (numero == 3)
                break;

            System.out.println(numero);
        }

        //for com o continue
        for (int numero = 1; numero <=5; numero ++) {
            if (numero == 3)
                continue;

            System.out.println(numero);
        }
    }
}
