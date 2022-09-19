package AProgramacionJava.test.ColeccionesAPI.test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {

        List miLista = new ArrayList();//guarda el orden y duplicados
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("miercoles");
        miLista.add(0, "miercoles");//recibe un index
        TestColecciones.imprimir(miLista);

        Set miSet = new HashSet();//no guarda el orden y quita duplicado
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Miercoles");
        TestColecciones.imprimir(miSet);

        Map miMap = new HashMap();
        miMap.put("value1", "Juan");
        miMap.put("value2", "Pedro");
        miMap.put("value3", "Jose");
        //miMap es de tipo hasMap por lo que se castea a String
        String elemento = (String) miMap.get("value1");
//        System.out.println("\nelemento = " + elemento);
        System.out.println("\nelemento = " + miMap.get("value1"));
        //KeySet() retorna un set solo con las key
        TestColecciones.imprimir(miMap.keySet());
        //KeySet() retorna un collection solo con los valores
        TestColecciones.imprimir(miMap.values());

        //EQUIVALENTES
//        for (Object elemento : miLista) {
//            System.out.println("elemento = " + elemento);
//        }
//        miLista.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
    }

    public static void imprimir(Collection collection) {
        System.out.println();
        collection.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
