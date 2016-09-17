import Edge;

import java.util.ArrayList;

class ListGraph {
	int E;
	int V;
	ArrayList<Edge>[] edges;
	boolean isDirected;
	
	ListGraph(int v, boolean directed) {
		V = v;
		edges = (ArrayList<Edge>[])(new ArrayList[V]);
		for (int i = 0; i < V; i++) {
			edges[i] = new ArrayList<Edge>();
		}
		isDirected = directed;
	}
	
	public void addEdge(int src, int dst, int wght) {
		edges[src].add(new Edge(src,dst, wght));
		if (!isDirected)
			edges[dst].add(new Edge(dst, src, wght));
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (isDirected)
			sb.append("Directed Graph");
		else
			sb.append("Undirected Graph");
		sb.append(" with " + V + " vertices\n\n");
		for (int i = 0; i < V; i++) {
			sb.append("Vertex " + i + "\n");
			int l = edges[i].size();
			for (int j = 0; j < l; j++) {
				sb.append(edges[i].get(j));
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}