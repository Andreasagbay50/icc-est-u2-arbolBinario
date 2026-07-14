import java.util.Random;
import java.util.Set;

import collections.maps.Maps;
import collections.set.Sets;
import models.Contacto;
import models.Person;
import structures.grafos.Graph;
import structures.grafos.PathResult;
import structures.grafos.implementations.BFSPathFinder;
import structures.grafos.implementations.DFSPathFinder;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.Ejercicio3;
import structures.trees.Ejercicio4;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {

        //runIntTree();
        //runEjercicios1();
        //runEjercicios2();
        //runEjercicio3();
        //runEjercicio4();
       // runSets();
       //runMaps();
        //runGraphs();
       runGraphs2();
        runGraphs3();
    }

    private static void runGraphs3() {
        Graph<String> g = new Graph<>();
        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("B", "D");
        g.addEdge("C", "J");
        g.addEdgeUni("D", "E");
        g.addEdge("E", "F");
        g.addEdgeUni("K", "j");
        g.printGraph();

        BFSPathFinder<String> bfs = new BFSPathFinder<>();
        PathResult<String> result =bfs.find(g, "A", "F");
        System.out.println(result);
        PathResult<String> result2 =bfs.find(g, "A", "J");
        System.out.println(result2);
        PathResult<String> result3 =bfs.find(g, "A", "K");
        System.out.println(result3);
    }

    private static void runGraphs2() {
        Graph<String> g = new Graph<>();
        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("B", "D");
        g.addEdge("C", "J");
        g.addEdgeUni("D", "E");
        g.addEdge("E", "F");
        g.addEdgeUni("K", "j");
        g.printGraph();

        DFSPathFinder<String> dfs = new DFSPathFinder<>();
        PathResult<String> result =dfs.find(g, "A", "F");
        System.out.println(result);
        PathResult<String> result2 =dfs.find(g, "A", "J");
        System.out.println(result2);
        PathResult<String> result3 =dfs.find(g, "A", "K");
        System.out.println(result3);
    }

    
    private static void runGraphs(){
        Graph<String>graph = new Graph<>();
        graph.add("A");
        graph.add("B");
        graph.add("C");
        graph.add("D");
        graph.add("J");

        graph.addEdgeUni("A","B" );
        graph.addEdgeUni("B","C" );
        graph.addEdgeUni("C","D" );
        graph.addEdgeUni("C","A" );
        graph.addEdge("C","D" );
      
        graph.addEdge("D","J" );
        graph.printGraph();
       
        


    }
        
        

        



    

    
       //private static void runMaps() {
        //Maps maps = new Maps();
       // maps.cTreMap();
       //}


       //private static void runMaps() {
        //Maps maps = new Maps();
        //maps.coLinkedHashMap();
       //}
   // private static void runMaps() {
     //   Maps maps = new Maps();
       // maps.construirHashMap();

    //}
   private static void runSets() {
        Sets sets = new Sets();
        //Primera implementacion: HashSet
        System.out.println("HashSet");
        Set<String> hashSet = sets.construirHasSet();
        System.out.println(hashSet);
        System.out.println("Tamaño: " + hashSet.size());
        System.out.println(hashSet.contains("F"));

        Set<String> linkedHashSet = sets.construirLinkedHashSets();
        System.out.println(linkedHashSet);
        System.out.println("Tamaño: " + linkedHashSet.size());
        System.out.println(linkedHashSet.contains("B"));

          Set<String> treSet = sets.construirTreSet();
        System.out.println(treSet);
        System.out.println("Tamaño: " + treSet.size());
        System.out.println(treSet.contains("B"));

        System.out.println("TreSet");
        Set<Contacto> tCSet = sets.construirTreeSetConComparador();
        System.out.println(tCSet);
        System.out.println(tCSet.size());

        System.out.println("TreSet");
        Set<Contacto> hCSet = sets.construirHashSetContactos();
        System.out.println(hCSet);
        System.out.println(hCSet.size());



   }
   
public static void runEjercicios1() {

    Ejercicio1 ejercicio1 = new Ejercicio1();

    int[] numeros = { 5, 3, 7, 2, 4, 6, 8 };

    ejercicio1.insert(numeros);
}

public static void runEjercicios2() {

    BinaryTree<Integer> arbol = new BinaryTree<>();

    int[] numeros = { 4, 2, 7, 1, 3, 6, 9 };

    for (int num : numeros) {
        arbol.insert(num);
    }

    Ejercicio2 ejercicio2 = new Ejercicio2();

    System.out.println("Ejercicio 2: Invertir Arbol Binario");
    System.out.println("Arbol Original:");

    ejercicio2.printTree(arbol.getRoot());

    ejercicio2.invertTree(arbol.getRoot());

    System.out.println("\nArbol Invertido:");

    ejercicio2.printTree(arbol.getRoot());
}

private static void runEjercicio3() {

    System.out.println(" Ejercicio 3");

    Ejercicio3 ejercicio3 = new Ejercicio3();

    int[] numeros = {4, 2, 7, 1, 3, 6, 9};

    ejercicio3.insert(numeros);

    

}

private static void runEjercicio4() {
    System.out.println(" Ejercicio 4");

    BinaryTree<Integer> arbol = new BinaryTree<>();

    int[] numeros = { 4, 2, 7, 1, 3, 0 };

    for (int numero : numeros) {
        arbol.insert(numero);
    }

    Ejercicio4 ejercicio4 = new Ejercicio4();

    System.out.println("Entrada:");

    System.out.println("        4");
    System.out.println("      2   7");
    System.out.println("     1 3");
    System.out.println("    0");

    System.out.println();

    int profundidad = ejercicio4.maxDepth(arbol.getRoot());

    System.out.println("Salida: " + profundidad);
}


// private static void runEjercicio() {
// Ejercicio1 ejercicio1 = new Ejercicio1();
// int[] numeros = new int[]{5,3,7,2,4,6,8};
// ejercicio1.insert(numeros);

private static void runEjercicio() {
    Ejercicio1 ejercicio1 = new Ejercicio1();
    int[] numeros = new int[] { 4, 7, 2, 9, 6, 3, 1 };
    ejercicio1.insert(numeros);
}

private static void runPersonTree() {
    BinaryTree<Person> personTree = new BinaryTree<>();
    personTree.insert(new Person("Alice", 30));
    personTree.insert(new Person("Bob", 25));
    personTree.insert(new Person("Diego", 35));
    personTree.insert(new Person("Rafael", 35));
    personTree.insert(new Person("Ana", 35));

    personTree.inOrder();
}

private static void runIntTree() {
    IntTree arbolNumeros = new IntTree();

    /// CLASE ARBOL

    // Node<Integer> node3 = new Node<>(30);
    // Node<Integer> node4 = new Node<>(40);
    // Node<Integer> node5 = new Node<>(50);

    // Node<Integer> root = arbolNumeros.getRoot();

    // root.setLeft(node2);
    // root.setRight(node3);

    // node2.setLeft(node4);
    // node4.setRight(node5);

    //// ERROR GENERA CLICLOS
    // node5.setLeft(root);

    arbolNumeros.insert(10);
    arbolNumeros.insert(5);
    arbolNumeros.insert(3);
    arbolNumeros.insert(8); /// INORDER 3, 5, 8, 10, 15, 20
    arbolNumeros.insert(20); /// POSTORDER 3 8 5 15 20 10
    arbolNumeros.insert(15); // ANCHURA O NIVELES: 10 5 20 3 8 15

    System.out.println("pre Order");

    arbolNumeros.preOrder();
    System.out.println();

    System.out.println("Pos Order");
    arbolNumeros.posOrder();
    System.out.println();

    System.out.println("In Order");
    arbolNumeros.inOrder();
    System.out.println();

    System.out.println("Niveles");
    arbolNumeros.niveles();
    System.out.println();
    System.out.println("Altura");
    System.out.println(arbolNumeros.altura());
    System.out.println("Peso");
    System.out.println(arbolNumeros.peso());

}

private static void runIntComparativaPesos() {
    IntTree tree = new IntTree();
    Random random = new Random();

    final int TOTAL_NODOS = 50_000;
    final int MIN = 1;
    final int MAX = 50_000;

    // Insertar 50 000 números aleatorios entre 1 y 50 000
    for (int i = 0; i < TOTAL_NODOS; i++) {
        int value = random.nextInt(MAX - MIN + 1) + MIN;
        tree.insert(value);
    }

    // Medir peso con variable acumulada
    long inicioPesoVariable = System.nanoTime();

    int pesoVariable = tree.getPeso();

    long finPesoVariable = System.nanoTime();

    double tiempoPesoVariableMs = (finPesoVariable - inicioPesoVariable) / 1_000_000.0;

    // Medir peso recursivo
    long inicioPesoRecursivo = System.nanoTime();

    int pesoRecursivo = tree.peso();

    long finPesoRecursivo = System.nanoTime();

    double tiempoPesoRecursivoMs = (finPesoRecursivo - inicioPesoRecursivo) / 1_000_000.0;

    // Resultados
    System.out.println("Cantidad de nodos insertados: " + TOTAL_NODOS);
    System.out.println("Peso usando variable: " + pesoVariable);
    System.out.println("Peso usando recursion: " + pesoRecursivo);

    System.out.println();

    System.out.println("Tiempo getPeso(): "
            + tiempoPesoVariableMs + " ms");

    System.out.println("Tiempo pesoRecursivo(): "
            + tiempoPesoRecursivoMs + " ms");
}
}
