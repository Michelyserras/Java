import java.util.Scanner;
public class ex3 {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um valor para A: ");
        int a = leitor.nextInt();
        System.out.println("Insira um valor para B: ");
        int b = leitor.nextInt();

        soma_Multiplica(a, b);


    }

    public static int soma_Multiplica(int a, int b){
        int soma = 0;
        int multiplica = 0;
        if(a == b){
            soma = a + b;
            int c = soma;
            System.out.println(" a soma de A + B = " + c);
            return c;    
        }else{
            multiplica = a * b;
            int c = multiplica;
            System.out.println("a multiplicacao de A * B = " + c);
            return c;

        }
    }
}
