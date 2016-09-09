import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
    	try {
			System.setIn(new FileInputStream("input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	System.out.println(N + " " + M);
    	Graph g = new DirectedGraph(N);
    	for (int i = 0; i < M; i++ ){
    		int src = sc.nextInt()-1;
    		int dst = sc.nextInt()-1;
    		int w = sc.nextInt();
    		g.addEdge(src, dst, w);
    		g.addEdge(dst, src, w);
    	}
    	System.out.println(g);
    	
    }
}