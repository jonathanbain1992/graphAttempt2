/**
 * 
 */
package graph;

import java.util.ArrayList;

/**
 * @author jonathanbain
 *
 */
public interface GraphInterface {

	
	static final double PROBABILITY_CONST = 0.3;
	public ArrayList<Edge> map = new ArrayList<Edge>();
	
	
	public Vertex createVertex();
	public Boolean removeVertex(Vertex v);
	public Edge createEdge();
	public Boolean removeEdge(Edge e);
	public Boolean populateGraph(int numOfVertex);
	
	
	
	
	
}
