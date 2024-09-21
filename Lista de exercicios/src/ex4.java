import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        int num = leitor.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println(" Numero inserido =  " + num + "\n Antecessor = " + antecessor + "\n Sucessor = " + sucessor);
        
    }

}
