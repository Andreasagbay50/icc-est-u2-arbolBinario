package structures.grafos;

import java.util.List;
import java.util.Set;

import structures.node.Node;

public class PathResult <T>{
    private final Set<T> visitados;
    private final Set<T> paht;
    
    public PathResult(Set<T>visitados, Set<T> paht) {
        this.visitados = visitados;
        this.paht = paht;
    }
    public Set<T> getVisitados() {
        return visitados;
    }
    public Set<T> getPaht() {
        return paht;
    }
    @Override
    public String toString() {
        
        return "PathResult"
        +  "\nvisitados=" + visitados 
        + "\n"+ (!paht.isEmpty() ? "paht=" + paht : "No se encontro un camino entre los nodos");
    }
    
}
