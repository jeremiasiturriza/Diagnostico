import java.util.ArrayList;
import java.util.List;

public class ListAnalyzer {
    
    public static int contadorImpares(List<Integer> lista){
        int  cantImpares = 0;    
        for (Integer n : lista){
                if (n % 2 != 0){
                    cantImpares++;
                }
            }
        return cantImpares;
    }

    public static List <Integer> numerosConsecutivos(List<Integer> lista){
        List<Integer> consecutivo = new ArrayList<>();
        for (int i = 0; i < lista.size() - 1; i++) {
            int numActual = lista.get(i);
            int numSiguiente = lista.get(i + 1);
            
            // Comprobar si los números son consecutivos
            if (numSiguiente == numActual + 1) {
                // Si son consecutivos, agregarlos a la lista
                consecutivo.add(numActual);
                consecutivo.add(numSiguiente);
        }
    }
    return consecutivo;
}}
