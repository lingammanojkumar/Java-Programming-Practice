package datastructures;
class GraphDirected{
	static int graph[][];
	GraphDirected(int v)
	{
		graph=new int[v][v];
	}
	void addEdge(int s,int e)
	{
		graph[s][e]=1;
	}
	void display() {
		for(int i=0;i<graph.length;i++)
		{
			for(int j=0;j<graph[0].length;j++)
			{
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class DirectedGraphUsingAdjacencymatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  GraphDirected ob=new GraphDirected(5);
  ob.addEdge(0, 1);
  ob.addEdge(0, 2);
  ob.addEdge(1, 3);
  ob.addEdge(2, 3);
  ob.addEdge(3, 4);
  ob.addEdge(4, 1);
  ob.display();
	}

}
/*
0 1 1 0 0 
0 0 0 1 0 
0 0 0 1 0 
0 0 0 0 1 
0 1 0 0 0 
*/