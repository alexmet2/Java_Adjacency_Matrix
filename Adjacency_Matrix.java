public class Adjacency_Matrix{
    public static void main(String[] args) {
        /*
            Adjacenty Matrix =  An array to store 1's or 0's represent edges
                                # of rows    = # of unique nodes
                                # of columns = # of unique nodes

                                runtime complexity to check an Edge: O(1)
                                space complexity: O(v^2) *v = # of vertices (nodes*
        */
        /* declares graph */
        Graph graph = new Graph(5);
        /* addding nodes */
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));
        /* adding edges to our nodes */
        graph.addEdge(0,1); /* for A to B */
        graph.addEdge(1,2); /* for B to C */
        graph.addEdge(2,3); /* for C to D */
        graph.addEdge(2,4); /* for C to E */
        graph.addEdge(4,0); /* for E to A */
        graph.addEdge(4,2); /* for E to C */
        /* prints the graph */
        graph.print();
        System.out.println();
        /* checks to see if the is a node between 0 and 1 (A and B) which here it is true */
        System.out.println("Node between A and B");
        System.out.println(graph.checkEdge(0, 1));
        /* checks to see if the is a node between 3 and 2 (D and C) which here it is false */
        System.out.println("\nNode between D and C");
        System.out.println(graph.checkEdge(3, 2));

    }
}