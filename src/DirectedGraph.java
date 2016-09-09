
public class DirectedGraph extends Graph {

	public DirectedGraph(int n) {
		super(n);
	}

	@Override
	void addEdge(int source, int dest, int r) {		
		edges[source].put(dest, r);
		E++;
	}

	public static void main(String[] args) {
		Graph g = new DirectedGraph(5);
		
		g.addEdge(0, 1, 10);
		g.addEdge(0, 2, 5);
		g.addEdge(0, 0, 1);
		
		g.addEdge(1, 2, 8);
		g.addEdge(2, 3, 14);
		
		System.out.println(g);
	}
}
