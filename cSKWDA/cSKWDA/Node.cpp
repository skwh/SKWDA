#include "StdAfx.h"
#include "Node.h"
#include "Edge.h"
#include <string>


Node::Node(std::string n) {
	name = n;
}
Node::~Node(void) {}

void Node::setAsEdge(Edge e) {
	edges.push_back(e);
}

void Node::setName(std::string n) {
	name = n;
}
std::string Node::getName() {
	return name;
}
void Node::setDistance(int d) {
	distance = d;
}
int Node::getDistance() {
	return distance;
}

void Node::setPi(Node n) {
	*Pi = n;
}
Node Node::getPi() {
	return *Pi;
}

void Node::setVisited(bool b) {
	visited = b;
}