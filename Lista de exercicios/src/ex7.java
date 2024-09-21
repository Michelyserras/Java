import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        boolean valor1 = leitor.nextBoolean();
        System.out.println("Insira um segundo valor: ");
        boolean valor2 = leitor.nextBoolean();

        verdadeFalso(valor1, valor2);

           
    }

    public static void verdadeFalso(boolean valor1, boolean valor2){
        if(valor1 && valor2){
            System.out.println("Os dois valores são VERDADEIROS");
        } 
        else if(!valor1 && !valor2){
            System.out.println("Os dois valores são FALSOS");
        }
        else{
            System.out.println("Os valores são difentes: um é FALSO e o outro VERDADEIRO");
        }

    }
    
}
