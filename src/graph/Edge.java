package graph;

public class Edge implements EdgeInterface {
	
	public double neighbourPointer;
	//public Vertex from;
	//public Vertex neighbour;
	public int weight;
	public Vertex from;
	public Vertex neighbour;

	public Edge(Vertex v, Vertex from) {
		this.from =from;
		this.neighbour = v;
		
		//this.neighbourPointer = v.getHashCode();
		this.weight = 1; //default weight.
	}
	
	public Edge(Vertex v, Vertex from, int weight) {
		//this.neighbourPointer = v.getHashCode();
		this.neighbour = v;
		this.weight = weight;
	}

	
	//public double getNeighbourPointer() {
	//	return this.neighbourPointer;
	//}
	
	public Vertex getNeighbour() {
		return this.neighbour;
	}

	public int getWeight() {
		return this.weight;
	
	}

	public boolean setWeight(int weight) {
		try {
		this.weight = weight;
		return true;
		}
		catch(Exception e) {
			return false;
		}
	}

}
