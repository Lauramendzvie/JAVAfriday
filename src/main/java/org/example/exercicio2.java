package org.example;
import java.util.Scanner;


public class exercicio2 {
    public static void main(String[] args) {
        int num;


        System.out.println(" digite um numero: ");
        Scanner julya = new Scanner(System.in);
        num = julya.nextInt();

        if( num %2 ==0 && num %5 == 0){
            System.out.println(" FIZZBUZZ ");
        }
        else if (num %5 ==0){
            System.out.println(" BUZZ ");
        }
        else if( num %2 == 0){
            System.out.println(" FIZZ");
        }
        else{
            System.out.println(" ERRO!");
        }
    }
}

