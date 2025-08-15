import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.security.PublicKey;
import java.sql.SQLOutput;

public class Main {
  public static void main(String[] args) {

    System.out.println("");
    System.out.println("\n");

    /* \n pula linha
    e esses simbolos servem para comentar em varias linhas
     */

    //println é uma linha só
    //aspas duplas é uma "frase" / aspa sozinha é apenas um caractere

    System.out.println("");

    //tipos de variaveis
    // padrão de nomenclatura Comel Case - primeira palavra inicia com letra maiuscula e segunda ou demais palavras iniciam com letra maiuscula//

    byte variavelByte = 2;
    System.out.println(variavelByte);

    short variavelShort = 3276;
    System.out.println(variavelShort);

    System.out.printf("tamanho do byte: %d", variavelByte);

    /*
    - tipos das mascaras
    * %d - inteiros- byte, short, int, long
    * %f - reais - float, double
    * %c - caractere - char
    * %b - lógico - boolean
    * %s - String
     */

    long variavelLong = 9_334_345_343_233_2434L;
    System.out.printf("\nTamanho do long: %d\n", variavelLong);

    float variavelFloat = 3.4e+38F;
    System.out.printf("Valor de float: %f\n", variavelFloat);

    double variavelDouble = 1.7e+308;
    System.out.printf("Valor de double: %f\n", variavelDouble);

    char variavelCaractere = 'A';
    System.out.printf("Meu caracter é: %c\n", variavelCaractere);

    boolean variavelBoolean = true;
    System.out.printf("Meu boolean é: %b\n", variavelBoolean);

//ATIVIDADE PARA ESCREVER O NOME, IDADE E DATA DE NASCIMENTO. //


    int variavelInt = 16, dia = 06, mes = 06, ano = 2008; //Voce pode adicionar mais variaveis em uma mesma variavel
    String variavelNome = "Laura Mendes";
    System.out.printf("Olá! Meu nome é %s\n e eu tenho %d anos e eu nasci no dia %d/%d/%d\n", variavelNome, variavelInt, dia, mes, ano);

// FIM DE ATIVIDADE. //


    // FUNÇÕES: //

    String variavelString = "Bem-vindo a bosch!";
    System.out.println(variavelString.length());
    //length conta a quantidade de caracteres


    System.out.println(variavelString.toUpperCase());
    // toUpperCase deixa tudo maiusculo


    System.out.println(variavelString.toLowerCase());
    //ToLowerCase deixa tudo minusculo


   // System.out.println(variavelString.charAt());
    //retorna o caractere de uma posição especifica


    System.out.println(variavelString + "!!!");
    //concatenação


    variavelString = variavelString + "!!!";
    System.out.println(variavelString);
    //Alterando o valor da variavel

    // VOLTANDO PARA OS NUMEROS E SAINDO DO TEXTO //

    int numero1 = 9;
    int numero2 = 2;

    System.out.println(numero1+numero2);
    //Adição

    System.out.println(numero1-numero2);
    //Subtração

    System.out.println(numero1*numero2);
    //Multiplicação

    System.out.println(numero1/numero2);
    //Divisão

    System.out.println(numero1%numero2);
    //Resto da divisão

  }
}