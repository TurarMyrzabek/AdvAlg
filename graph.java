import java.util.*;

public class graph {
    private final Map<Integer, ArrayList<Integer>> adjListsMap;

    public graph(final int vertices) {
        adjListsMap = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 1; i <= vertices; i++) {
            final ArrayList<Integer> Adjacencys = new ArrayList<Integer>();
            adjListsMap.put(i, Adjacencys);
        }
    }

    public void addEdge(int v, int w) {
        if (v > adjListsMap.size() || w > adjListsMap.size()) {
            return;
        }
        (adjListsMap.get(v)).add(w);
        (adjListsMap.get(w)).add(v);
    }

    public ArrayList<Integer> getNeighbors(int v) {
        if (v > adjListsMap.size()) {
            return null;
        }
        return new ArrayList<Integer>(adjListsMap.get(v));
    }

    public static void main(String args[]) {
        int count = 1, source, dest;
        Scanner scan = new Scanner(System.in);
        int num_vertices = scan.nextInt();
        int num_edges = scan.nextInt();
        graph adjacencyList = new graph(num_vertices);
        while (count <= num_edges) {
            source = scan.nextInt();
            dest = scan.nextInt();
            count++;
        }
        System.out.println("the given adjancecy list for the graph\n");
        for (int i = 1; i <= num_vertices; i++) {
            System.out.println(i + "->");
            ArrayList<Integer> edgelist = adjacencyList.getNeighbors(i);
            for (int j = 1;; j++) {
                if (j != edgelist.size()) {
                    System.out.println(edgelist.get(j - 1) + "->");
                } else {
                    System.out.println(edgelist.get(j - 1));
                    break;
                }
            }
            System.out.println();
        }
    }
}
