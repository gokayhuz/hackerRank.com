import java.util.HashMap;

public abstract class Graph {
	
	int V;
	int E;
	HashMap<Integer, Integer>[] edges;
	
	/**
	 * 
	 * @param v		number of vertices in the graph
	 */
	Graph(int v) {
		V = v;
		edges = (HashMap<Integer, Integer>[]) new HashMap[v];
		for (int i = 0; i < v; i++)
			edges[i] = new HashMap<Integer, Integer>();
	}
	
	abstract void addEdge(int source, int dest, int r);
	
	void addEdge(int source, int dest) {
		addEdge(source, dest, 0);
	}
	
	/**
	 * prints the textual representation of the graph using 1-based indexing for vertices
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices. " + E + " edges\n");
		for (int edgeIndex = 0; edgeIndex < edges.length; edgeIndex++) {
			for (int j : edges[edgeIndex].keySet()) {
				sb.append( edgeIndex+1 + " --> " + (j+1) + " (" + edges[edgeIndex].get(j) + ")" + "\n");
			}
		}
		return sb.toString();
	}


}