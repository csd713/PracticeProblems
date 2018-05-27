/**
 * File created by csd on May 26, 2018
 */
package cci;

public class TestGraph {

	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.addEdge(1, 0);
		g.addEdge(0, 2);
		g.addEdge(2, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 4);
		System.out.println("Printing DFS:");
		g.DFS(2);
		System.out.println("Printing BFS:");
		g.BFS(2);
	}

}
