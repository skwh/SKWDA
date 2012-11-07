#include "StdAfx.h"
#include "Edge.h"

Edge::Edge(Node N1, Node N2, int length) {
	*n1 = N1;
	*n2 = N2;
	v = length;
	n1->setAsEdge(this);
	n2->setAsEdge(this);
}
Edge::~Edge(void) {}

int Edge::getV() {
	return v;
}
void Edge::setV(int d) {
	v = d;
}
Node Edge::getN1() {
	return *n1;
}
void Edge::setN1(Node n) {
	*n1 = n;
}
Node Edge::getN2() {
	return *n2;
}
void Edge::setN2(Node n) {
	*n2 = n;
}