
public class Edge implements Comparable {

	int src;
	int dst;
	int wght;
	
	public Edge() {
	}
	
	public Edge(int s, int d) {
		src = s;
		dst = d;
	}
	
	public Edge(int s, int d, int w) {
		src = s;
		dst = d;
		wght = w;
	}

	@Override
	public int compareTo(Object o) {
		return (wght < ((Edge)o).wght ? -1 : 1);
	}

}
