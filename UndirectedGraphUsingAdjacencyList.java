package datastructures;
import java.util.*;
//code for undirected graph using Adjacency List
class GraphList{
	List<List<Integer>> graph=new ArrayList<>();
	GraphList(int v){
		for(int i=0;i<v;i++) {
			graph.add(new ArrayList<>());
		}
	}
	void addEdge(int s,int e) {
		graph.get(s).add(e);
		graph.get(e).add(s);
	}
	void display() {
		for(int i=0;i<graph.size();i++)
		{
			System.out.println();
		}
	}
}
public class UndirectedGraphUsingAdjacencyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    GraphList ob=new GraphList(5);//here 5 is vertex
    ob.addEdge(0, 1);
    ob.addEdge(0, 2);
    ob.addEdge(1, 3);
    ob.addEdge(2, 3);
    ob.addEdge(3, 4);
    ob.addEdge(4, 1);
    ob.display();
    
	}

}
