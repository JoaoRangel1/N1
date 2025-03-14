import java.util.*;
//        a. Método que retorna quantas ocorrências de um elemento estão na lista
//int nOcorrencias(ArrayList<Integer> l, Integer el)
//

public class MetodoA {
    public static int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int count = 0;
        for (int num : l)
            if (num == el) count++;
        return count;
    }
    
}
