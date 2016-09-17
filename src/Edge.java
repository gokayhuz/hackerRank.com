

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