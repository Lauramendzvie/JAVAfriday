package léo;
import java.util.Scanner;
 class exercicio3 {
     public static void main(String[] args) {

         Scanner julya = new Scanner(System.in);

         double altura, peso, imc;

         System.out.println("insira seu peso: ");
         peso = julya.nextDouble();

         System.out.println("insira sua altura: ");
         altura = julya.nextDouble();

         imc = peso / (altura * altura);
         System.out.printf("O Cálculo de IMC feito com seu peso e sua altura é: %.2f  ", imc);
        julya.close();

     }
}