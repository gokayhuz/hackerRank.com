package com.hackerrank.primsMstSpecialSubtree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

class EdgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (((Edge)o1).weight < ((Edge)o2).weight)			
			return -1;
		else
			return 1;
	}
	
}
class Edge implements Comparable {
	int src;
	int dst;
	int weight;
	Edge(int src, int dst, int w) {
		this.src = src; this.dst = dst; this.weight=w;
	}
	@Override
	public String toString() {
		return src + "-->" + dst + "(" + weight + ")\n";
	}
	@Override
	public int compareTo(Object other) {
		if (weight < ((Edge)(other)).weight)
			return -1;
		else 
			return 1;
	}
}

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


public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// num of vertices
		int M = sc.nextInt();	// num of edges
		ListGraph graph = new ListGraph(N, false);
		
		// read the inoput and create the graph
		for (int i = 0; i < M; i++) {
			int src = sc.nextInt()-1;
			int dst = sc.nextInt()-1;
			int wght = sc.nextInt();
			graph.addEdge(src, dst, wght);
		}
		int S = sc.nextInt();
		
		// start the main problem
		HashSet<Integer> subgraph = new HashSet<Integer>();
		subgraph.add(S-1);
		PriorityQueue<Edge> subGraphEdgePQ = new PriorityQueue<>();
		//System.out.println(graph);
		
		// process the initial root
		for (Edge e : graph.edges[S-1]) {
			subGraphEdgePQ.add(e);
		}
		
		int totalCost = 0;
		while (subgraph.size() < N) {
			
			// get the closest node that has not been already visited
			int nextCost = subGraphEdgePQ.peek().weight;
			int nextNode = subGraphEdgePQ.remove().dst;
			while (subgraph.contains(nextNode)) {
				nextCost = subGraphEdgePQ.peek().weight;
				nextNode = subGraphEdgePQ.remove().dst;
			}
				
			// add the closest node to the subGraph and all of its edges
			subgraph.add(nextNode);
			totalCost += nextCost;
			for (Edge e : graph.edges[nextNode]) {
				if (!subgraph.contains(e.dst))
					subGraphEdgePQ.add(e);
			}
		}
		System.out.println(totalCost);
		//System.out.println(subgraph);
	}
}

















