/*
@ASSESSME.USERID: ls5273
@ASSESSME.AUTHOR: Lana Sorak
@ASSESSME.ANALYZE: YES
*/

import java.util.HashMap;
import java.util.Map;


public class AdjacencyGraph<E> implements Graph<E> {
    private Map<E, Vertex<E>> vertices;

    public AdjacencyGraph() {
        vertices = new HashMap<>();
    }

    //Creating a Vertex from a given value and adding it into the Map
    @Override
    public void add(E value) {
        Vertex<E> vertex = new Vertex<E>(value);
        this.vertices.put(value, vertex);
    }

    //Does the Map contain the given value
    @Override
    public boolean contains(E value) {
        return this.vertices.containsKey(value);
    }

    //Get size
    @Override
    public int size() {
       return this.vertices.size();
    }

    //One-sided connection
    @Override
    public void connectDirected(E a, E b) {
        //Get the values from the Map
        Vertex<E> vA = vertices.get(a);
        Vertex<E> vB = vertices.get(b);

        //Connect first vertex with the second vertex
        vA.connect(vB);
    }

    @Override
    public void connectUndirected(E a, E b) {
       
    }

    @Override
    public boolean connect(E a, E b) {

    }
    
}
