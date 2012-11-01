package net.skwh;

public class gNode {
	private int x;
	private int y;
	private int radius;
	private Node sourceNode;
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getRadius() {
		return this.radius;
	}
	public Node getSourceNode() {
		return this.sourceNode;
	}
	public gNode(Node n, int X, int Y, int r) {
		this.sourceNode = n;
		this.x = X;
		this.y = Y;
		this.radius = r;
	}
}
