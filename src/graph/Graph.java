/**
 * 
 */
package graph;

import java.util.ArrayList;

/**
 * @author jonathanbain
 *
 */
public class Graph {
	
	public ArrayList<Edge> allEdges;
	public ArrayList<Vertex> allVertices;
	public int[][] matrixRepresentation;

	public Graph() {
		this.allEdges = new ArrayList<Edge>();
		this.allVertices = new ArrayList<Vertex>();
		
	}

	public void createVertex() {
		Vertex v = new Vertex();
		if(allVertices.contains(v)) {
			return;
		}
		allVertices.add(v);
		System.out.println("VERTEX ID:    "+v.id+"        METHOD CALLED = allVertices.add(v).");
	}


	public Boolean removeVertex(Vertex v) {
		return allVertices.remove(v);
	
	}

	

	//public void createEdge(Vertex v) {
	//	Edge e = new Edge(v);
	//	if(allEdges.contains(v)) {
	//		return;
	//	}
	//	allEdges.add(e);
	//}


	public Boolean removeEdge(Edge e) {
		return allEdges.remove(e);
	}
	

	public Boolean populateGraph(int numOfVertex) {
		matrixRepresentation = new int[numOfVertex][numOfVertex];
	
		for(int i=0; i<numOfVertex; i++) {
			allVertices.add(new Vertex());
		}
		int columnIndex = 0;
		int rowIndex=0;
		
		for(Vertex v:allVertices) {
			//row
			for(Vertex V:allVertices) {
				//column
				if((v.hashCode() != V.hashCode()) && (Math.random() <= 0.3)) {
					
				 Edge newEdge = new Edge(v,V);
						
					
					if(V.containsNeighbour(newEdge)  && v.containsNeighbour(newEdge)){
						continue;
					}
				///		System.out.println(V.neighbourHood.contains(newEdge));
					//	System.out.println(v.neighbourHood.contains(newEdge));
					//	System.out.println(randDoub<0.3);
					else {
						V.neighbourHood.add(newEdge);
						v.neighbourHood.add(newEdge);
						matrixRepresentation[rowIndex][columnIndex] = 1;
						matrixRepresentation[columnIndex][rowIndex] = 1;
						
					}
					
					}
				columnIndex++;
				}
			rowIndex++;
			columnIndex=0;
			}
		
		//for(Vertex v : allVertices) {
			//System.out.println(v.hashCode());
			//System.out.println("     *****     "+v.hashCode());
		//	System.out.println(v.neighbourHood.size());
		//	for(Edge e: v.neighbourHood) {
				//System.out.println(e.neighbour.hashCode() +"     "+e.from.hashCode());
			//	System.out.println();
			//}
			//System.out.println(v.neighbourHood.size());
		//}
		return true;
		
		
	
	}
		
}
