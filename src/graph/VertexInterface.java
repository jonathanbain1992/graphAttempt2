package graph;

import java.util.ArrayList;

public interface VertexInterface {

	public double getHashCode(); //id of vertex
	public ArrayList<Edge> neighbourhood = new ArrayList<Edge>();
	public boolean containsNeighbour(Edge e);
	public boolean addNeighbour(Vertex v);
	public boolean removeNeighbour(Edge e);
	
}
