package graph;

public class GraphClient {

    public static void main(String[] args) {
        Introduction graph = new Introduction();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
    /*


     */
        graph.addEdge("A", "B",2);
        graph.addEdge("A", "D",3);
        graph.addEdge("B", "C",7);
        graph.addEdge("C", "D",8);
        graph.addEdge("D", "E",10);
        graph.addEdge("E", "F",1);
        graph.addEdge("E", "G",2);
        graph.addEdge("F", "G",2);


        System.out.println(graph.hasPath("A","F"));
    }
}
