package net.skwh;

public class Edge {
	private Node c1;
	private Node c2;
	private int v;
	
	public Node getC1() {
		return c1;
	}
	public Node getC2() {
		return c2;
	}
	public int getV() {
		return v;
	}
	public Edge (Node C1, Node C2, int value) {
		c1 = C1;
		c2 = C2;
		v = value;
	}
}
