package AulaDois;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioUmAulaDois {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int qtd, min, max, valor;
        double med, soma = 0.0;

        System.out.print("Quantos números você vai inserir? ");
        qtd = sc.nextInt();

       for(int i = 0; i < qtd; i++){
        System.out.print("Digite o número " + (i+1) + ": ");
        valor = sc.nextInt();
        numeros.add(valor);
       } 
       sc.close();
       max = Collections.max(numeros);
       min = Collections.min(numeros);
       for (Integer j : numeros) {
            soma += j;

       }
       med = soma / qtd;
       System.out.println("\nValor máximo: " + max
                        + "\nValor minimo: " + min
                        + "\nMédia: " + med
       );
    }
}
