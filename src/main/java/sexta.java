import java.util.Scanner;

public class sexta {
    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            String valor = "";

            /* vez que o usuário digitar algo
            diferente de sair, o código continua,
            quando o usuário digitar a palavra "sair",
            o código encerra

            *
            *
            * */

        /* strings só se compara com
        "méthod (em portugues) equals"
        não utilize == */

        /* só se utiliza para tipo primitivo de dados,
        int, double, boolean e etc */

        while(!valor.equalsIgnoreCase("sair")) {
            System.out.print("Digite algo:");
            valor = entrada.nextLine();
        }

        int contador =0, acumulador=0;
        while (contador<5){
            System.out.println(contador);
            contador++;
            System.out.print("digite um numero: ");
            acumulador = acumulador + entrada.nextInt();
            entrada.nextLine();
            System.out.printf("Contador está em %d e " +
                    " o acumulador está em %d\n", contador, acumulador);

        }

                for (int i = 1; i <= 10; i++) {
                    System.out.println("Tabuada do " + i + ":");
                    for (int j = 1; j <= 10; j++) {
                        System.out.printf("%d x %d = %2d%n", i, j, (i * j));
                    }
                    System.out.println();
                }
            }
        }








