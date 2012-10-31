function pathFinder(startNode,endNode,sourceGraph) {
	var S = [];
	var vS = sourceGraph.nodes;
	function initialize_single_source(graph,node) { //initializes graph, starting point, and all other nodes
		for (var v in graph.nodes) {
			if (v instanceof Node) {
				v.distance = infinity;
				v.pi = null;
			}
		}
		node.distance = 0;
	}
	function relax(node1,node2,w) { //relaxes node
		if (node2.distance > node1.distance + w) {
			node2.distance = node1.distance + w;
			node2.pi = node1;	
		}
	}
	function Adjacent(node) { //returns an array of adjacent nodes
		if (!(node instanceof Node)) {
			return null;
		}
		var AdjacentNodes = [];
		var AdjacentLengths = [];
		for (var i=0;i<node.edges.length;i++) {
			var currentEdge = node.edges[i];
			var neighborNode;
			if (currentEdge.c1 != node) {
				neighborNode = currentEdge.c1;
			} else {
				neighborNode = currentEdge.c2;	
			}
			if (!neighborNode.visited) {
				AdjacentLengths.push(currentEdge.v);
				AdjacentNodes.push(neighborNode);	
			}
		}
		return [AdjacentNodes,AdjacentLengths];
	}
	initialize_single_source(sourceGraph,startNode);
	while (vS.length != 0) {
		vS = vS.sort(function(a,b) { return a.distance-b.distance; });
		var u = vS.shift();
		S.push(u);
		u.visited = true;
		var a = Adjacent(u);
		var aN = a[0];
		var aL = a[1];
		for (var v=0;v<aN.length;v++) {
			relax(u, aN[v], aL[v]);
		}
	}
	var chNode = null;
	for (var i=0;i<S.length;i++) {
		if (S[i] == endNode) {
			chNode = S[i];	
		}
	}
	var path = [chNode];
	var finished = false;
	while (!finished) {
		path.push(chNode.pi);
		if (chNode.pi == startNode) {
			finished = true;
			path = path.reverse();
			break;	
		} else {
			chNode = chNode.pi;	
		}
	}
	return path;
}
//