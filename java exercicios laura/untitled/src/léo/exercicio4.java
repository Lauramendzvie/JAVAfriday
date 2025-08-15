package léo;
import java.util.Scanner;
class exercicio4 {
    public static void main(String[] args){

        Scanner jujuba = new Scanner(System.in);

        double numero, quadrado, cubo;

        System.out.println("Digite um número: ");
        numero = jujuba.nextDouble();

        quadrado = Math.pow(numero, 2);
        System.out.printf(" o quadrado do numero que voce digitou é: %.2f ", quadrado);

        cubo = Math.pow(numero, 3);
        System.out.printf("\n O cubo do numero que voce digitou é: %.2f", cubo);
        jujuba.close();


    }
}
