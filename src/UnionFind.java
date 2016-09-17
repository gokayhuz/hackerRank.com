

import java.util.ArrayList;

public class UnionFind {
	
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
		if (parent.get(a) == parent.get(b))
			return;
		int sizeA = size.get(parent.get(a));
		int sizeB = size.get(parent.get(b));
		if (sizeA < sizeB) {
			parent.set(parent.get(a), parent.get(b));
			size.set(parent.get(b), sizeA+sizeB);
		}
		else {
			parent.set(parent.get(b), parent.get(a));
			size.set(parent.get(a), sizeA+sizeB);
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