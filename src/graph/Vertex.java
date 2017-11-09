package graph;

import java.util.ArrayList;

public class Vertex {
	
	public long id;
	ArrayList<Edge> neighbourHood = new ArrayList<Edge>();

	public Vertex() {
		this.id = this.hashCode();
	}

	
	public double getHashCode() {
		return this.hashCode();
	}


	public boolean containsNeighbour(Edge edge) {
		
		boolean b = false;
		for(Edge e : neighbourHood) {
			if((e.neighbour.id == edge.neighbour.id) || (e.from.id == edge.from.id) || e.neighbour.id == edge.from.id) {
				b = true;
			}
			
		}
		return b;
		
	}


	//public boolean addNeighbour(Vertex v) {
	//	Edge e = new Edge(v.hashCode(), this.hashCode());
	//	System.out.println("EDGE HASHCODE:    "+e.hashCode()+"        NEIGHBOUR VALUE:"+e.neighbourPointer+"        NEIGHBOUR HASHCODE:  "+e.hashCode());
	//	if(!(containsNeighbour(e))) {
		//	System.out.println("containsNeighbour on edge returned false.");
		//	return neighbourHood.add(e);
		//}
		//else {
	//	System.out.println("containsNeighbour on edge returned true");
	//	return false;
	//	}
	//}


	public boolean removeNeighbour(Edge e) {
		return this.neighbourHood.remove(e);
	}
	

}
