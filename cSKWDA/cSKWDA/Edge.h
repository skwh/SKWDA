#pragma once
#include "Node.h"
class Edge {
	int v;
	Node* n1;
	Node* n2;
public:
	Edge(Node n1, Node n2, int length);
	~Edge(void);
	int getV();
	void setV(int d);
	Node getN1();
	void setN1(Node n);
	Node getN2();
	void setN2(Node n);
};

