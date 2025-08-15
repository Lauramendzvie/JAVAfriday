package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double media = 8.1;
        int faltas = 10;
        boolean postura = false;

        String situacao;

        /// verdadeiro ou falso ///

        if (media >= 5.0 && faltas < 25 && postura == true) {
            /// caso seja verdadeiro ele vai executar os comandos dentro das chaves ///
            situacao = "aprovado";

        } else if (media <= 5.0 && faltas < 25 && postura) {
            situacao = "recuperação";

        } else if (media >= 5 && faltas > 25 && postura) {
            situacao = "sem férias";

        } else if (media >= 5 && faltas > 25 && !postura) {
            situacao = "chamar para conversar";

        } else {
            situacao = "reprovado";
        }
        System.out.println(situacao);
    }
}
