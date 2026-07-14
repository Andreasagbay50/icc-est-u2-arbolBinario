package structures.grafos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import structures.node.Node;

public class Graph<T> {
    //COOLLECTION DE NODOS
    //SET HASH SET TREE SET
    //MAP HASH MAP TREE MAP
    private Map<Node<T>, Set<Node<T>>> graph;

    public Graph() {
        this.graph = new HashMap<Node<T>, Set<Node<T>>>();
    }

    public void add(T data) {
        Node<T> node = new Node<T>(data);
        graph.putIfAbsent(node, new HashSet<Node<T>>());
    }
    public void addEdge(T v1, T v2 ) {
        Node<T> nv1 = new Node<T>(v1);
        Node<T> nv2 = new Node<T>(v2);
        add(v1);
        add(v2);
        graph.get(nv1).add(nv2);
        graph.get(nv2).add(nv1);
    }
    public void addEdgeUni(T v1, T v2 ) {
        Node<T> nv1 = new Node<T>(v1);
        Node<T> nv2 = new Node<T>(v2);
        add(v1);
        add(v2);
        graph.get(nv1).add(nv2);
    }

    public void printGraph() {
        for (Map.Entry<Node<T>, Set<Node<T>>> entry : graph.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Node<T> conecion : entry.getValue()) {
                System.out.print(conecion);
            }
            System.out.println();
        }
    }

    public Set<Node<T>> getVecino(Node<T> nC) {
        return graph.getOrDefault(nC, new HashSet<Node<T>>());
        
    }
    public Set<Node<T>> getVecino(T Value) {
        return graph.getOrDefault(new Node<T>(Value), new HashSet<Node<T>>());
        
    }

    



}
    






