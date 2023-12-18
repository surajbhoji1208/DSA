package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

    //add vertex method
    public  boolean addVertex(String vertex)
    {
        if (hashMap.get(vertex) ==  null)
        {
            hashMap.put(vertex,new ArrayList<String>());
            return true;
        }
        return false;
    }
    public  void printGraph()
    {
        System.out.println(hashMap);
    }

    //add edge

    public boolean addEdge(String vertex1,String vertex2)
    {
        System.out.println(hashMap.get(vertex2) != null);
        if(hashMap.get(vertex1) != null && hashMap.get(vertex2) != null)
        {
            hashMap.get(vertex1).add(vertex2);
            hashMap.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    //rempve edge
    public  boolean removeEdge(String vertex1,String vertex2)
    {
        if(hashMap.get(vertex1) != null && hashMap.get(vertex2) != null)
        {
            hashMap.get(vertex1).remove(vertex2);
            hashMap.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    // remove vertex
    public  boolean removeVertex(String vertex)
    {
        if(hashMap.get(vertex) == null) return false;
        for( String otherVertex : hashMap.get(vertex))
        {
            hashMap.get(otherVertex).remove(vertex);
        }
        hashMap.remove(vertex);
        return true;
    }

}
