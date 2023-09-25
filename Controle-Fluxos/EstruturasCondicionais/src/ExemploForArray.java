public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = { "MARIA", "MARCOS", "VINI", "LARA" };

        //em arrays o indice inicia em ZERO
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no indice i = " + i + " é " + alunos[i]);
        }

        //forma abreviada
        for (String aluno : alunos){
            System.out.println("Nome do aluno é: "+ aluno);
        }
    }
}
