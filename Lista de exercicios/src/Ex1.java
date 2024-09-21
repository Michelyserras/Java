import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        int a, b, c;
        int soma = 0;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        a = leitor.nextInt();
        System.out.println("Insira o valor de B: ");
        b = leitor.nextInt();
        System.out.println("Insira o valor de C: ");
        c = leitor.nextInt();

        System.out.println("Os valores inseridos foram: \n A = " + a + " B = " + b + " C = " + c);

        soma = a + b;

        System.out.println("A + B = " + soma);

        if(soma < c){
            System.out.println("O resultado da soma de A + B é menor que o valor de C");
        } 
        else if(soma == c){
            System.out.println("O resultado da soma de A + B é igual ao valor de C");
        }
        else{
            System.out.println("O resultado da soma de A + B é maior que o valor de C");
        }

    }

}
