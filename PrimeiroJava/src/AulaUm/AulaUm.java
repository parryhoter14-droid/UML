package AulaUm;

import java.util.Scanner;

public class AulaUm {
    public static void main(String[] args) {
        int num1, num2, soma;
        System.out.print( "Informe o primeiro número: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.print( "\nInforme o segundo número: ");
        num2 = sc.nextInt();
        soma = num1 + num2;
        System.out.print("\nA soma é" + soma);
        sc.close();
    }
    
} 

    
