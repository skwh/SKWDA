#include "StdAfx.h"
#include "Node.h"
#include "Edge.h"
#include <string>

Node::Node(void){}
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

void Node::setDistance(int d) {
	distance = d;
}

void Node::setPi(Node n) {
	Pi = n;
}