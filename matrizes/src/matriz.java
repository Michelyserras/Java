import java.util.Scanner;

public class matriz {
    public static void main(String[] args){
        int op = 0;
        int[][] matriz = new int[2][2];

        while(op != 4){
            menu();
            Scanner leitor = new Scanner(System.in);
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    matriz = criarMatriz();
                    break;

                case 2:
                    matriz = preencherMatriz(matriz);
                    break;

                case 3:
                    mostrarMatriz(matriz);
                    break;

                default:
                    break;
            }
        }
    }

    public static void menu(){
        System.out.println("Escolha uma opcao: ");
        System.out.println(" 1 - criar matriz");
        System.out.println(" 2 - preencher matriz");
        System.out.println(" 3 - mostrar matriz");
        System.out.println(" 4 - sair ");
    }

    public static int[][] criarMatriz(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o numero de linhas: ");
        int linhas = leitor.nextInt();
        System.out.println("Insira o numero de colunas: ");
        int colunas = leitor.nextInt();

        return new int[linhas][colunas]; // cria uma nova matriz com o tamanho digitado pelo usuario
    }

    public static int[][] preencherMatriz(int[][] matriz){
        Scanner leitor = new Scanner(System.in);
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                matriz[i][j] = leitor.nextInt(); // preenche cada linha e coluna da matriz
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] +  " "); // printa cada uma das linhas da matriz
            }
            System.out.println(" ");
        }
    }


}
