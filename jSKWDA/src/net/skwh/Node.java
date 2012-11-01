package net.skwh;

import java.util.Set;

public class Node {
	final int INFINITY = 10000000;
	private String name;
	private int distance;
	private boolean visited;
	private Set<Edge> edges;
	private Node pi;
	
	public String getName() {
		return name;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int d) {
		this.distance = d;
	}
	public boolean getVisited() {
		return visited;
	}
	public void setVisited(boolean b) {
		this.visited = b;
	}
	public Set<Edge> getEdges() {
		return edges;
	}
	public void setEdges(Set<Edge> s) {
		this.edges = s;
	}
	public Node getPi() {
		return pi;
	}
	public void setPi(Node n) {
		this.pi = n;
	}
	
	public void setAsEdge(Edge e) {
		edges.add(e);
	}
	
	public Node(String n) {
		setName(n);
		setDistance(INFINITY);
	}
	public void setName(String name) {
		this.name = name;
	}
}
