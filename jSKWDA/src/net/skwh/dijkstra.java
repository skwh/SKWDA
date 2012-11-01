package net.skwh;

import java.util.Set;

public class dijkstra {
	private Set<Node> VS;
	private Set<Node> S;
	
	public Set<Node> getVS() {
		return VS;
	}
	public Set<Node> getS() {
		return S;
	}
	
	public void initialize_single_source(Node n, Graph g) {
		for (Node no : g.getNodes()) {
			no.setDistance(no.INFINITY);
			no.setVisited(false);
		}
		n.setDistance(0);
	}
	public void relax(Node n1, Node n2, int w) {
		if (n2.getDistance() > n1.getDistance() + w) {
			n2.setDistance(n1.getDistance() + w);
			n2.setPi(n1);
		}
	}
	public Set<Set> Adjacent(Node n) {
		Set<Node> AdjacentNodes = null;
		Set<Integer> AdjacentEdges = null;
		for (int i=0;i<n.getEdges().size();i++) {
			Edge currentEdge = (Edge) n.getEdges().toArray()[i];
			Node neighborNode = null;
			if (currentEdge.getC1() != n) {
				neighborNode = currentEdge.getC1();
			} else {
				neighborNode = currentEdge.getC2();
			}
			if (!neighborNode.getVisited()) {
				AdjacentNodes.add(neighborNode);
				AdjacentEdges.add(currentEdge.getV());
			}
		}
		Set<Set> combined = null;
		combined.add(AdjacentNodes);
		combined.add(AdjacentEdges);
		return combined;
	}
}
