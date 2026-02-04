package AulaUm;

import java.util.Scanner;

public class AulaDois {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double c, f;
        System.out.print("Digite a temperatura de célsius: ");
        c = sc.nextDouble();
        f = (c * 9/5) + 32;
        System.out.print("A temperatura em fahrenheit é: " + f);
        sc.close();

    }
}
