package Week7;

import java.util.Iterator;
import java.util.LinkedList;

public class UndirectedGraph {
	

      int Vertex; 
     LinkedList<Integer> adjancyList[];
     void addEdge(int noOfver,int widthOfUndirectedGraph) 
	    { 
	        adjancyList[noOfver].add(widthOfUndirectedGraph); 
	    } 
     public static void main(String args[])
     {
         UndirectedGraph Graph = new UndirectedGraph(7);
  
         Graph.addEdge(0, 1);
         Graph.addEdge(0, 2);
         Graph.addEdge(1, 2);
         Graph.addEdge(2, 0);
         Graph.addEdge(2, 3);
         Graph.addEdge(3, 3);
         Graph.addEdge(3, 4);
         Graph.addEdge(3, 5);
         Graph.addEdge(3, 6);
  
         System.out.println("Following is Breadth First Traversal "+
                            "(starting from vertex 2)");
  
         Graph.BFS(3);
     }
    
    
  
    
    void BFS(int s) 
    { 
        boolean visited[] = new boolean[Vertex]; 
  
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
  
     
        visited[s]=true; 
        queue.add(s); 
  
        while (queue.size() != 0) 
        { 
            
            s = queue.poll(); 
            System.out.print(s+" "); 
  
          
            Iterator<Integer> i = adjancyList[s].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    } 
 
    public UndirectedGraph(int ver) 
    { 
        Vertex = ver; 
        adjancyList = new LinkedList[ver]; 
        for (int i=0; i<ver; ++i) {
            adjancyList[i] = new LinkedList(); 
        }
    } 
	     
} 
