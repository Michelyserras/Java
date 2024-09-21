import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        double valor = leitor.nextDouble();

        double ajuste = 0;

        ajuste = valor + (valor * 5 / 100);

        System.out.println("Valor: " + valor + "\nValor com reajuste: " + ajuste);
        leitor.close();
        
    }
}
