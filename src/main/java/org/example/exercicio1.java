package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = scanner.nextInt();

        if (num %2 == 0){
            System.out.println(" par ");
        }
        else{
            System.out.println(" impar ");
        }
        scanner.close();




    }
}
