package AProgramacionJava.test.GenericosColecciones.test;

import java.util.*;

public class TestGenericosColecciones {
    public static void main(String[] args) {

        List<String> miLista = new ArrayList<>();//guarda el orden y duplicados
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("miercoles");
        miLista.add(0, "miercoles");//recibe un index
        TestGenericosColecciones.imprimir(miLista);

        Set<String> miSet = new HashSet<>();//no guarda el orden y quita duplicado
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Miercoles");
        TestGenericosColecciones.imprimir(miSet);

        Map<String, String> miMap = new HashMap<>();//no guarda el orden y recibe un key
        miMap.put("value1", "Juan");
        miMap.put("value2", "Pedro");
        miMap.put("value3", "Jose");
        miMap.put("value3", "Pepe");//remplaza el último valor porque es (set)
        //miMap es de tipo hasMap por lo que se castea a String
        String elemento = miMap.get("value1");
//        System.out.println("\nelemento = " + elemento);
        System.out.println("\nelemento = " + miMap.get("value1"));
        //KeySet() retorna un set solo con las key
        TestGenericosColecciones.imprimir(miMap.keySet());
        //KeySet() retorna un collection solo con los valores
        TestGenericosColecciones.imprimir(miMap.values());
    }

    public static void imprimir(Collection<String> collection) {
        System.out.println();
        collection.forEach(elemento -> System.out.println("elemento = " + elemento));
    }
}
