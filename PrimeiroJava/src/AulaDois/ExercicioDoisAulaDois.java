package AulaDois;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExercicioDoisAulaDois {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(2, 5, 10, 0, 9);
        List<Integer> lista2 = Arrays.asList(0, 4, 5, 110, 29);

        Set<Integer> repetidos = new HashSet<>(lista1);
        repetidos.retainAll(lista2);

        if (!repetidos.isEmpty()) {
            System.out.println("Números repetidos: " + repetidos);
        }    else{
            System.out.println("Não há números repetidos!");
            }           
        }
    
}
