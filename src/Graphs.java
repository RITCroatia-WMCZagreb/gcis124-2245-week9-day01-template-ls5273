/*
@ASSESSME.USERID: ls5273
@ASSESSME.AUTHOR: Lana Sorak
@ASSESSME.ANALYZE: YES
*/

public class Graphs {
    public static Graph<String> makeGraph() {
        Graph<String> graph = new AdjacencyGraph<>();
        
        graph.add("A");
        graph.add("B");
        graph.add("C");
        graph.add("D");
        graph.add("E");
        graph.add("F");
        graph.add("G");
        graph.add("H");
        graph.add("I");
        graph.add("J");
        graph.add("K");


        //A
        graph.connectDirected("A", "C");
        graph.connectUndirected("A", "B");

        //B
        graph.connectUndirected("B", "E");
        
        //C
        graph.connectUndirected("C", "E");
        graph.connectUndirected("C", "D");
        graph.connectDirected("C", "H");

        //D
        graph.connectUndirected("D","F");
        graph.connectDirected("D", "B");

        //E
        graph.connectDirected("E", "F");

        //F
        graph.connectUndirected("F", "G");

        //I
        graph.connectUndirected("I", "K");

        //J
        graph.connectDirected("J", "I");
        graph.connectUndirected("J", "K");

        return graph;
    }
}
