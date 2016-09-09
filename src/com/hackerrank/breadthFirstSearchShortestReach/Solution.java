package com.hackerrank.breadthFirstSearchShortestReach;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class MatrixGraph {
	int V;
	int E;
	int[][] edges;
	boolean[] visited;
	int[] value;
	
	MatrixGraph(int numVertices) {
		V = numVertices;
		E = 0;
		edges = new int[V+1][V+1];
		for (int i = 0; i <= V; i++) {
			for (int j = 0; j <= V; j++) {
				edges[i][j] = -1;
			}
		}
		visited = new boolean[V+1];
		value = new int[V+1];
		for (int i = 0; i <= V; i++) {
			visited[i] = false;
			value[i] = -1;
		}
	}
	
	void addEdge(int from, int to, int weight) {
		edges[from][to] = weight;
		edges[to][from] = weight;
		E++;
	}
	void visit(int n, int v) {
		visited[n] = true;
		value[n] = v;
	}
	boolean isVisited(int n) {
		return visited[n];
	}
	int getValue(int n) {
		return value[n];
	}
	
	int[] getNeighbors(int n) {
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		for (int i = 0; i <= V; i++) {
			if (edges[n][i] != -1)
				resultList.add(i);
		}
		int[] result = new int[resultList.size()];
		for (int i = 0; i < resultList.size(); i++) {
			result[i] = resultList.get(i);
		}
		return result;
	}
}


public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintStream out = System.out;
		int q = sc.nextInt();
		while (q-->0) {
			int n = sc.nextInt();	// numberOfNodes
			int m = sc.nextInt();
			
			// number of edges
			MatrixGraph graph = new MatrixGraph(n);
			for (int i = 0; i < m; i++) {
				int from = sc.nextInt();
				int to = sc.nextInt();
				graph.addEdge(from, to, 6);
			}
			int startNode = sc.nextInt();
			Queue<Integer> queue = new LinkedList<>();
			queue.add(startNode);
			
			graph.visit(startNode,0);
			
			int[] distances = new int[n+1];
			for (int i = 0; i <= n; i++) 
				distances[i] = -1;
			int depth = 0;
			while (!queue.isEmpty()) {
				int curNode = queue.remove();
				//graph.visit(curNode,depth);
				int[] curNeighbors = graph.getNeighbors(curNode);
				for (int i : curNeighbors) {
					if (!graph.isVisited(i)) {
						queue.add(i);
						graph.visit(i, graph.getValue(curNode)+6);
					}
				}
				depth++;
			}
			for (int i = 1; i <= n; i++) {
				if (i != startNode)
					out.print(graph.value[i] + " ");
			}
			System.out.println();
		}
		

	}

}
