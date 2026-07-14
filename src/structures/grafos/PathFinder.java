package structures.grafos;

// Interface =>
//- No contiene logica interna
//- Define lls metodos
//- No se puede instanciar
public interface PathFinder <T> {
    PathResult<T> find(Graph<T> graph, T start, T end);

    
}
