// Example script: 
// adding Nodes to a graph and using the gGraph methods to draw the node map.
var simpleGraph = new Graph([],[]);
var simpleGraphicalGraph;
function runMe() {
	simpleGraph = new Graph([],[]);
	simpleGraphicalGraph;
	for (var i=0;i<6;i++) {
		simpleGraph.nodes.push(new Node(i+1));	
	}
	simpleGraph.edges.push(new Edge(simpleGraph.nodes[0],simpleGraph.nodes[5],14));
	simpleGraph.edges.push(new Edge(simpleGraph.nodes[0],simpleGraph.nodes[2],9));
	simpleGraph.edges.push(new Edge(simpleGraph.nodes[0],simpleGraph.nodes[1],7));
	simpleGraph.edges.push(new Edge(simpleGraph.nodes[1],simpleGraph.nodes[2],10));
	simpleGraph.edges.push(new Edge(simpleGraph.nodes[1],simpleGraph.nodes[3],15));
	simpleGraph.edges.push(new Edge(simpleGraph.nodes[2],simpleGraph.nodes[5],2));
	simpleGraph.edges.push(new Edge(simpleGraph.nodes[2],simpleGraph.nodes[3],11));
	simpleGraph.edges.push(new Edge(simpleGraph.nodes[3],simpleGraph.nodes[4],15));
	simpleGraph.edges.push(new Edge(simpleGraph.nodes[5],simpleGraph.nodes[4],9));
	simpleGraphicalGraph = graphToGraphicalGraph(simpleGraph,document.getElementById('theCanvas'));
	simpleGraphicalGraph.draw(simpleGraphicalGraph.ctxt);
}
function pathMe() {
	runMe();
	var node1 = document.getElementById('s1').value;
	var node2 = document.getElementById('s2').value;
	for (var i=0;i<simpleGraph.nodes.length;i++) {
		if (simpleGraph.nodes[i].n == node1) {
			node1 = simpleGraph.nodes[i];	
		} else if (simpleGraph.nodes[i].n == node2) {
			node2 = simpleGraph.nodes[i];
		}
	}
	if (!(node1 instanceof Node) || !(node2 instanceof Node)) {
		alert("Oops! There was a problem.");
		return;	
	}
	var path = pathFinder(node1,node2,simpleGraph);
	console.log(path);
	simpleGraphicalGraph.drawPath(path,simpleGraphicalGraph.ctxt);
}
function graphToGraphicalGraph(graph,canvasElement) {
	return new gGraph(graph,canvasElement,canvasElement.getContext('2d'));	
}