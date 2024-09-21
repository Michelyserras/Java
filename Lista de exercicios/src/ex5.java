import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        float divisao = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o valor do seu salário: ");
        float salario = leitor.nextFloat();

        System.out.println("Insira o valor do salário minimo atual: ");
        float salarioMin = leitor.nextFloat();

        divisao = salario / salarioMin;

        System.out.println("Você recebe o equivalente a  " + divisao + " salarios minimos");
        
    }

}
