import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        int valor = leitor.nextInt();

        if(valor < 0){
            System.out.println("O numero " + valor + " é negativo");
        }
        if(valor > 0){
            System.out.println("O numero " + valor + " é positivo");
        }

        if(valor % 2 == 0){
            System.out.println("O numero " + valor + " é par");
        }else{
            System.out.println("O numero " + valor + " é ímpar");
        }

    }
}
