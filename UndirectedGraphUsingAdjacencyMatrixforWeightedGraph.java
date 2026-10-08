package datastructures;
//COde for undirected graph ,it is a bidirectional
class GraphWeight{
	static int graph[][];
	GraphWeight(int v){
		graph=new int[v][v];
	}
	void addEdge(int s,int e,int weight) {  //s->Starting, e->ending
		graph[s][e]=weight;
		graph[e][s]=weight;
	}
	//Using display method we need to print that in a matrix form
	void display() {
		for(int i=0;i<graph.length;i++)
		{
			for(int j=0;j<graph[0].length;j++) {
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
public class UndirectedGraphUsingAdjacencyMatrixforWeightedGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    GraphWeight ob=new GraphWeight(5);
    ob.addEdge(0, 1,5);
    ob.addEdge(0, 2,3);
    ob.addEdge(1, 3,9);
    ob.addEdge(2, 3,6);
    ob.addEdge(3, 4,1);
    ob.addEdge(4, 1,8);
    ob.display();
	}

}
/*
0 5 3 0 0 
5 0 0 9 8 
3 0 0 6 0 
0 9 6 0 1 
0 8 0 1 0 
*/