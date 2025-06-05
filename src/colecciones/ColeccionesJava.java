package colecciones;

public class ColeccionesJava {
    // Clase principal para probar las colecciones en Java
    public static void main(String[] args) {
        // Aquí puedes crear instancias de las colecciones y probar sus funcionalidades
        System.out.println("Colecciones en Java");
        
        // Ejemplo de uso de una lista
        java.util.List<String> lista = new java.util.ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        System.out.println("Lista: " + lista);

        // Ejemplo de uso de una lista ordenada
        java.util.List<String> listaOrdenada = new java.util.LinkedList<>();
        listaOrdenada.add("Elemento A");
        listaOrdenada.add("Elemento B");
        System.out.println("Lista Ordenada: " + listaOrdenada);
        
        // Ejemplo de uso de un conjunto
        java.util.Set<String> conjunto = new java.util.HashSet<>();
        conjunto.add("Elemento A");
        conjunto.add("Elemento B");
        System.out.println("Conjunto: " + conjunto);

        //Ejemplo de uso de un conjunto ordenado
        java.util.SortedSet<String> conjuntoOrdenado = new java.util.TreeSet<>();
        conjuntoOrdenado.add("Elemento 1");
        conjuntoOrdenado.add("Elemento 2");
        System.out.println("Conjunto Ordenado: " + conjuntoOrdenado);

        // Ejemplo de uso de un queue
        java.util.Queue<String> cola = new java.util.PriorityQueue<>();
        cola.add("Elemento 1");
        cola.add("Elemento 2");
        System.out.println("Cola: " + cola);

        // Ejemplo de uso de un deque
        java.util.Deque<String> deque = new java.util.ArrayDeque<>();
        deque.add("Elemento 1");
        deque.add("Elemento 2");
        System.out.println("Deque: " + deque);

        // Ejemplo de uso de un conjunto inmutable
        java.util.Set<String> conjuntoInmutable = java.util.Collections.unmodifiableSet(new java.util.HashSet<>(conjunto));
        System.out.println("Conjunto Inmutable: " + conjuntoInmutable);

        // Ejemplo de uso de un conjunto sincronizado
        java.util.Set<String> conjuntoSincronizado = java.util.Collections.synchronizedSet(new java.util.HashSet<>(conjunto));
        System.out.println("Conjunto Sincronizado: " + conjuntoSincronizado);


        // Ejemplo de uso de una pila
        java.util.Stack<String> pila = new java.util.Stack<>();
        pila.push("Elemento 1");    
        pila.push("Elemento 2");
        System.out.println("Pila: " + pila);
        
        // Ejemplo de uso de un mapa
        java.util.Map<String, Integer> mapa = new java.util.HashMap<>();
        mapa.put("Clave1", 1);
        mapa.put("Clave2", 2);
        System.out.println("Mapa: " + mapa);

        // Ejemplo de uso de un mapa ordenado
        java.util.Map<String, Integer> mapaOrdenado = new java.util.TreeMap<>();
        mapaOrdenado.put("ClaveA", 10);
        mapaOrdenado.put("ClaveB", 20);
        System.out.println("Mapa Ordenado: " + mapaOrdenado);

        // Ejemplo de uso de un mapa sincronizado
        java.util.Map<String, Integer> mapaSincronizado = java.util.Collections.synchronizedMap(new java.util.HashMap<>(mapa));
        System.out.println("Mapa Sincronizado: " + mapaSincronizado);

        // Ejemplo de uso de un mapa linked
        java.util.Map<String, Integer> mapaLinked = new java.util.LinkedHashMap<>();
        mapaLinked.put("Clave1", 100);
        mapaLinked.put("Clave2", 200);
        System.out.println("Mapa Linked: " + mapaLinked);

        
    }
}
