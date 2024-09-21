import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o seu peso: ");
        float peso = leitor.nextFloat();
        System.out.println("Insira a sua altura: ");
        float altura = leitor.nextFloat();

        float imc = peso / (altura * altura) ;

        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        }
        else if(imc > 18.5 && imc < 25){
            System.out.println("Peso ideal");
        }
        else if(imc > 25 && imc < 29.9){
            System.out.println("Levemente acima do peso");
        }
        else if(imc > 30 && imc < 34.9){
            System.out.println("Obesidade grau 1");
        }
        else if(imc > 35 && imc < 39.9){
            System.out.println("Obesidade grau 2");
        }
        else{
            System.out.println("Obesidade grau 3");
        }



    }

    
}
