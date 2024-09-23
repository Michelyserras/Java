import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] nota = new int[3];
        int soma = 0;
        float media = 0;

        System.out.println("Insira o nome do aluno: ");
        String nome = leitor.next();
        for(int i=0; i<3; i++){
            System.out.printf("Informe a %da nota: ", i+1);
            nota[i] = leitor.nextInt();
            soma += nota[i];
        }
        media = soma/3;
        System.out.println("Aluno: " + nome + "\n A media das notas é igual a: " + media);
        leitor.close();
    }
}
