#pragma once
#include <vector>
#include "Edge.h"
#include "Node.h"

class Graph {
private:
	std::vector<Node> nodes;
	std::vector<Edge> edges;
public:
	Graph(std::vector<Node> n, std::vector<Edge> e);
	~Graph(void);
	void loadSet(std::vector<Node> n, std::vector<Edge> e);
	std::vector<Node> getNodes();
	std::vector<Edge> getEdges();
};

