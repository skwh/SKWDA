package net.skwh;

import java.util.Set;

public class algorithm {
	public Set<Node> pathFinder(Node startNode, Node endNode, Graph sourceGraph) {
		dijkstra D = new dijkstra();
		D.initialize_single_source(startNode, sourceGraph);
		while (D.getVS().size() != 0) {
			//find a way to sort the set
			Node U = (Node) D.getVS().toArray()[D.getVS().size()];
			D.getVS().remove(U);
			U.setVisited(true);
			Set<Set> a = D.Adjacent(U);
			Set<Node> aN = (Set<Node>) a.toArray()[0];
			Set<Integer> aL = (Set<Integer>) a.toArray()[1];
			for (int i=0;i<aN.size();i++) {
				D.relax(U,(Node) aN.toArray()[i],(Integer) aL.toArray()[i]);
			}
		}
		Node chNode = null;
		for (int i=0;i<D.getS().size();i++) {
			if ((Node) D.getS().toArray()[i] == endNode) {
				chNode = (Node) D.getS().toArray()[i];
			}
		}
		Set<Node> path = null;
		path.add(chNode);
		boolean finished = false;
		while (!finished) {
			path.add(chNode.getPi());
			if (chNode.getPi() == startNode) {
				finished = true;
				break;
			} else {
				chNode = chNode.getPi();
			}
		}
		return path;
	}
}
