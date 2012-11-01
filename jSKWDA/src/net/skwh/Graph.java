package net.skwh;

import java.util.Set;

public class Graph {
	private Set<Node> nodes;
	private Set<Edge> edges;
	
	public Set<Node> getNodes() {
		return nodes;
	}
	public void setNodes(Set<Node> ns) {
		nodes = ns;
	}
	public Set<Edge> getEdges() {
		return edges;
	}
	public void setEdges(Set<Edge> es) {
		edges = es;
	}
	
	public Graph(Set<Node> n, Set<Edge> e) {
		nodes = n;
		edges = e;
	}
	public Edge findEdge(Node node1, Node node2) throws Exception {
		Edge e = null;
		for (int i=0;i<node1.getEdges().size();i++) {
			Edge E = (Edge) node1.getEdges().toArray()[i];
			Node neighborNode;
			if (e.getC1() != node1) {
				neighborNode = e.getC1();
			} else {
				neighborNode = e.getC2();
			}
			if (neighborNode == node2) {
				e = E;
			}
		}
		if (e == null) {
			throw new Exception("The two nodes are not connected.");
		} else {
			return e;
		}
	}
}
