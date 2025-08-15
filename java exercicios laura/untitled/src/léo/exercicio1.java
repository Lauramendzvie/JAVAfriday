package léo;

import java.util.Scanner;

class exercicio1 {
    public static void main(String[] args) {

        Scanner layslla = new Scanner(System.in);

        double fahrenheit;
        double celsius;
        System.out.println("Insira uma temperatura em celsius: ");
        celsius = layslla.nextDouble();
        celsius= ( celsius - 32 ) * 5/9;

        System.out.printf(" A temperatura convertida de fahrenheit para celsius é: %.2f", celsius);


    }
}
