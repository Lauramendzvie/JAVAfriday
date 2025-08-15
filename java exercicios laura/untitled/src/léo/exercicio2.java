package léo;
import java.util.Scanner;
class exercicio2 {
     public static void main(String[] args) {

         Scanner jhule = new Scanner(System.in);

         double celsius;
         double fahrenheit;
         System.out.println("Insira uma temperatura em fahrenheit: ");
         fahrenheit = jhule.nextDouble();
         fahrenheit= ( fahrenheit * 9/5 ) +32;

         System.out.printf(" A temperatura convertida de celsius para fahrenheit é: %.2f", fahrenheit);
         jhule.close();
     }
}
