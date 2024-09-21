import java.util.Scanner;
import java.util.Arrays;

public class ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[3];

        for(int i=0; i<vetor.length; i++){
            System.out.printf("Insira o %do valor: ", i+1);
            vetor[i] = leitor.nextInt();

        }

        for(int i=0; i<vetor.length-1; i++){ // loop para percorrer o vetor 3 vezes
            for(int j=0; j<vetor.length-1; j++){ // loop para trocar de posição os vetores se estiverem na ordem errada
                if(vetor[j] > vetor[j+1]){
                    int menor = vetor[j+1];
                    vetor[j+1] = vetor[j];
                    vetor[j] = menor;
                }
            }
        }
        System.out.println("vetor ordenado: " + Arrays.toString(vetor));

        
    }
    
}
