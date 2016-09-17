package com.hackerrank.kruskalMstReallySpecialSubtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Edge implements Comparable<Edge> {
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
	public int compareTo(Edge other) {
		if (weight==other.weight) {
			if (src < other.src)
				return -1;
			else 
				return 1;
		}
		if (weight < other.weight)
			return -1;
		else 
			return 1;
	}
}

class UnionFind {
	
	ArrayList<Integer> data;
	ArrayList<Integer> parent;
	ArrayList<Integer> size;
	
	public UnionFind() {
		data   = new ArrayList<>();
		parent = new ArrayList<>();
		size   = new ArrayList<>();;
	}
	
	public UnionFind(int size) {
		data   = new ArrayList<>();
		parent = new ArrayList<>();
		this.size = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			data.add(i);
			parent.add(i);
			this.size.add(1);
		}
	}
	
	public void union(int a, int b) {
		if (getParent(a) == getParent(b))
			return;
		int sizeA = size.get(getParent(a));
		int sizeB = size.get(getParent(b));
		if (sizeA < sizeB) {
			parent.set(getParent(a), getParent(b));
			size.set(getParent(b), sizeA+sizeB);
		}
		else {
			parent.set(getParent(b), getParent(a));
			size.set(getParent(a), sizeA+sizeB);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < data.size(); i++) {
			sb.append(size.get(parent.get(i)));
		}
		return sb.toString();
	}
	
	public int getParent(int a) {
		int parentA = a;
		while (parent.get(parentA) != parentA)
			parentA = parent.get(parentA);
		return parentA;
	}
	
	public boolean isConnected(int a, int b) {
		return (getParent(a) == getParent(b));
	}
}


public class Solution {
	public static long kruskalWeight(int N, Edge[] edges) {
		long totalWeight = 0;
		int numOfEdges = 0;
		int curEdge = 0;
		UnionFind uf = new UnionFind(N);
		
		while (numOfEdges < N-1) {
			int curSrc = edges[curEdge].src;
			int curDst = edges[curEdge].dst;
			if (uf.isConnected(curSrc, curDst)) {
				
			}
			else { // add current edge to MST
				uf.union(curSrc, curDst);
				numOfEdges++;
				totalWeight += edges[curEdge].weight;
			}
			curEdge++;
		}
		return totalWeight;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UnionFind uf = new UnionFind();

		int N = sc.nextInt();	// num of vertices
		int M = sc.nextInt();	// num of edges
		Edge[] edges = new Edge[M];
		
		for (int i = 0; i < M; i++) {
			int src = sc.nextInt()-1;
			int dst = sc.nextInt()-1;
			int wgt = sc.nextInt();
			edges[i] = new Edge(src,dst,wgt);
		}
		
		Arrays.sort(edges);
		System.out.println(kruskalWeight(N, edges));
		
		sc.close();
	}
}
