#pragma once
#include <string>
#include <vector>
#include "Edge.h"

class Node {
private:
	long int distance;
	std::string name;
	Node* Pi;
	bool visited;
	std::vector<Edge> edges;
public:
	Node(std::string n);
	~Node(void);
	void setAsEdge(Edge e);
	void setName(std::string n);
	std::string getName();
	void setDistance(int d);
	int getDistance();
	void setPi(Node n);
	Node getPi();
	void setVisited(bool b);
	bool getVisited();
};