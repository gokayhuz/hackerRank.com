package com.hackerrank.primsMstSpecialSubtree;
/*
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

import Edge;
import ListGraph;

class EdgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (((Edge)o1).weight < ((Edge)o2).weight)			
			return -1;
		else
			return 1;
	}
	
}

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// num of vertices
		int M = sc.nextInt();	// num of edges
		ListGraph graph = new ListGraph(N, false);
		
		// read the input and create the graph
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











*/





