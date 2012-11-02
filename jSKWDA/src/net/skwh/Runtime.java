package net.skwh;

import java.util.Set;

public class Runtime {
	private Graph simpleGraph = new Graph(null,null);
	
	public static void main(String[] args) {
		algorithm A = new algorithm();
		
	}
	private void runMe() {
		simpleGraph = new Graph(null,null);
		Set<Node> graphNode = null;
		for (int i=0;i<6;i++) {
			graphNode.add(new Node(Integer.toString(i+1)));
		}
		simpleGraph.setNodes(graphNode);
		Set<Edge> graphEdge = null;
		graphEdge.add(new Edge((Node) graphNode.toArray()[0], (Node) graphNode.toArray()[5], 14));
		//TODO: Continue example
	}
}
