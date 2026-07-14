package structures.grafos.implementations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import structures.grafos.Graph;
import structures.grafos.PathFinder;
import structures.grafos.PathResult;
import structures.node.Node;



public class DFSPathFinder<T> implements PathFinder<T> {
    @Override
    public PathResult<T> find(Graph<T> graph, T start, T end) {
        Set<T> visited = new LinkedHashSet<>();
        Set<T> path = new LinkedHashSet<>();
        boolean encontrado = dfs(graph, start, end, visited, path);
        if (!encontrado) {
            path.clear();

        }

        return new PathResult<>(visited, path);
    }

    private boolean dfs(Graph<T> graph, T current, T end, Set<T> visited, Set<T> path) {
        visited.add(current);
        path.add(current);
        // Caso Base;
        Node<T> nC = new Node<T>(current);
        Node<T> nE = new Node<T>(end);
        if (nC.equals(nE)) {
            return true;
        }
        for(Node<T> vecino : graph.getVecino(nC)) {
            if (!visited.contains(vecino.getValue())) {
                boolean encontrado = dfs(graph, vecino.getValue(), end, visited, path);
                if (encontrado) {
                    return true;
                }
            }
        }
        //Bactracking
        path.remove(current);

        return false;
    }

}