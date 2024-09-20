import java.util.Scanner; // para conseguir utilizar o scanner

public class App {
    public static void main(String[] args){
        // System.out.println("Hello, World!"); // serve para printar uma linha 

        int op = 0; // precisa ser inicializado para não ter nenhum erro
        while(op != 5){
            menu();
            
            Scanner leitor = new Scanner(System.in); // lê a entrada do usuario
            op = leitor.nextInt(); // grava a entrada do usuario 

            switch(op){
                case 1:
                   System.out.println("Resultado da soma: " + soma());
                break;

                case 2:
                    System.out.println("Resultado da subtracao:" + subtrair());
                break;

                case 3:
                    System.out.println("Resultado da multiplicacao:" + multiplicar());
                break;

                case 4:
                    System.out.println("Resultado da divisao: " + dividir());
                break;
            }
            

        }
    }

    //são metodos da classe app, servem para determinar as ações que o objeto pode efetuar.
    

    public static int soma(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        int a = leitor.nextInt();
        System.out.println("Insira o segundo valor: ");
        int b = leitor.nextInt();

        return a + b;
    }

    public static int subtrair(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        int a = leitor.nextInt();
        System.out.println("Insira o segundo valor: ");
        int b = leitor.nextInt();
        return a - b;
    }

    public static int multiplicar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        int a = leitor.nextInt();
        System.out.println("Insira o segundo valor: ");
        int b = leitor.nextInt();
        return a * b;
    }

    public static int dividir(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        int a = leitor.nextInt();
        System.out.println("Insira o segundo valor: ");
        int b = leitor.nextInt();
        return a / b;
    }

    public static void menu(){
        System.out.println("Escolha uma opcao: ");
        System.out.println(" 1 - soma");
        System.out.println(" 2 - subtracao");
        System.out.println(" 3 - multiplicacao ");
        System.out.println(" 4 - divisao ");
        System.out.println(" 5 - sair ");
    }
}
