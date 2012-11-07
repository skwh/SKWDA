#include "StdAfx.h"
#include "Graph.h"
#include "Node.h"
#include "Edge.h"
#include <vector>

Graph::Graph(std::vector<Node> n, std::vector<Edge> e) {
	nodes = n;
	edges = e;
}
Graph::~Graph(void){}

std::vector<Edge> Graph::getEdges() {
	return edges;
}
std::vector<Node> Graph::getNodes() {
	return nodes;
}

void Graph::loadSet(std::vector<Node> n, std::vector<Edge> e) {
	nodes = n;
	edges = e;
}