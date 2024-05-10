import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EjemploColecciones {
    public static void main(String[] args) throws Exception {
        // set
        System.out.println("interface set ");
        Set<String> miSet = new HashSet<>();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("400");
        miSet.add("400"); // valor repedtido no se agrega y no da error
        miSet.add("500");
        imprimir(miSet);

        // list
        System.out.println("interface list");
        List<String> mList = new ArrayList<>();
        mList.add("1");
        mList.add("2");
        mList.add("3");
        mList.add("4");
        mList.add("4"); // no hay problema en q se repita
        mList.add("5");
        imprimir(mList);

        // map
        System.out.println("interface map");
        Map<String, String> miMap = new HashMap<>();
        miMap.put("1", "po");
        miMap.put("2", "pu");
        miMap.put("3", "pe");
        miMap.put("4", "pa");
        imprimir(miMap.keySet());
        imprimir(miMap.values());

    }

    private static void imprimir(Collection<String> coleccion) {
        for (Object elemento : coleccion) {
            System.out.println(elemento + " ");
        }
        System.out.println("");
    }
}
