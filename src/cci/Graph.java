/**
 * File created by csd on May 26, 2018
 * 
 * Implementing DFS and BFS
 */

package cci;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {

	LinkedList<Integer>[] adjacencyList;
	int size;

	public Graph(int size) {
		this.size = size;
		adjacencyList = new LinkedList[size];

		for (int i = 0; i < size; i++)
			adjacencyList[i] = new LinkedList<Integer>();
	}

	public void addEdge(int u, int v) {
		adjacencyList[u].add(v);
	}

	public void DFS(int start) {

		// To keep track of visited nodes
		boolean[] visited = new boolean[size];

		Stack<Integer> stack = new Stack<>();

		stack.push(start);

		while (!(stack.empty())) {
			int var;
			var = stack.peek();
			// remove the top node
			stack.pop();

			// visit it if it's not visited already
			if (!visited[var]) {
				System.out.println(var + " ");
				visited[var] = true;
			}
			// add the neighbors of the current node to stack if they aren't visited
			// already
			Iterator<Integer> itr = adjacencyList[var].iterator();
			while (itr.hasNext()) {
				int v = itr.next();
				if (!visited[v]) {
					stack.push(v);
				}
			}
		}
	}
}
