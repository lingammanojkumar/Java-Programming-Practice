package datastructures;
//COde for undirected graph ,it is a bidirectional
class Graph{
	static int graph[][];
	Graph(int v){
		graph=new int[v][v];
	}
	void addEdge(int s,int e) {  //s->Starting, e->ending
		graph[s][e]=1;
		graph[e][s]=1;
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
	}
}
public class UndirectedGrapUsingAdjacencyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Graph ob=new Graph(5);
    ob.addEdge(0, 1);
    ob.addEdge(0, 2);
    ob.addEdge(1, 3);
    ob.addEdge(2, 3);
    ob.addEdge(3, 4);
    ob.addEdge(4, 1);
    ob.display();
	}

}
