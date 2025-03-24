/*
@ASSESSME.USERID: ls5273
@ASSESSME.AUTHOR: Lana Sorak
@ASSESSME.ANALYZE: YES
*/

import java.time.temporal.ValueRange;
import java.util.HashSet;
import java.util.Set;


public class Vertex<E> {
    private E value;
    private Set<Vertex<E>> neighbors;
    
    public Vertex(E value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public E getValue() {
        return this.value;
    }

    //Add a vertex in the Set of connections of the current vertex
    //The vertex that we are adding into the set in connected to the current vertex 
    public void connect(Vertex<E> neighbor) {
        this.neighbors.add(neighbor);
    }

    public boolean connected(Vertex<E> neighbor) {
        return this.neighbors.contains(neighbor);
    }

    public Set<Vertex<E>> getNeighbors() {
        return this.neighbors;
    }


    //MAIN
    public static void main(String[] args) {
        //Creating vertices
        Vertex<String> vA = new Vertex<String>("A");
        Vertex<String> vB = new Vertex<String>("B");
        Vertex<String> vC = new Vertex<String>("C");
        
        //Connecting
        vA.connect(vB);
        vA.connect(vC);
        vB.connect(vC);
        vC.connect(vA);
        vC.connect(vB);
    }
}
