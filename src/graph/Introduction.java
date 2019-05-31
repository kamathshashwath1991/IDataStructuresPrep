package graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Introduction {

    private class Vertex{
        HashMap<String, Integer> neighbors = new HashMap<>();
    }

    HashMap<String, Vertex> vertices;

    Introduction(){
        vertices= new HashMap<>();
    }

    public int numVertex(){
        return this.vertices.size();
    }


    public boolean containssVertex(String vname){
        if (this.vertices.containsKey(vname)){
            return true;
        }
        return false;
    }


    public void addVertex(String vName){
        Vertex vtx = new Vertex();
        vertices.put(vName,vtx);
    }


    public void removeVertex(String vName){
        Vertex vtx = vertices.get(vName);

        ArrayList<String> keys = new ArrayList<>(vtx.neighbors.keySet());

        for (String key : keys){
            Vertex nbrVertex = vertices.get(key);
            nbrVertex.neighbors.remove(vName);
        }

        vertices.remove(vName);
    }

    public int numberOfEdges(){
        int count = 0;
        ArrayList<String> keys = new ArrayList<>(vertices.keySet());
        for (String key: keys){
            Vertex vtx = vertices.get(key);
            count = count+ vtx.neighbors.size();
        }
        return count/2;
    }

    public boolean containsEdge(String vname1, String vname2){
        Vertex vtx1 = vertices.get(vname1);
        Vertex vtx2 = vertices.get(vname2);

        if (vtx1 == null || vtx2 == null || !vtx1.neighbors.containsKey(vname2)){
            return false;
        }
        return true;
    }

    public void addEdge(String vName1, String vName2, int cost){
        Vertex vtx1 = vertices.get(vName1);
        Vertex vtx2 = vertices.get(vName2);

        if (vtx1 == null || vtx2 == null || !vtx1.neighbors.containsKey(vName2)){
            return;
        }
        vtx1.neighbors.put(vName2,cost);
        vtx2.neighbors.put(vName1,cost);
    }

    public void removeEdge(String vName1, String vName2, int cost){
        Vertex vtx1 = vertices.get(vName1);
        Vertex vtx2 = vertices.get(vName2);

        if (vtx1 == null || vtx2 == null || !vtx1.neighbors.containsKey(vName2)){
            return;
        }
        vtx1.neighbors.remove(vName2,cost);
        vtx2.neighbors.remove(vName1,cost);
    }

    public void display(){
        ArrayList<String> keys = new ArrayList<>(vertices.keySet());

        for (String key: keys){
            Vertex vtx = vertices.get(key);

            System.out.println(key + ":" + vtx.neighbors);
        }
    }

    public boolean hasPath(String vName1, String vName2){

        //contains edge
        if (containsEdge(vName1,vName2)){
            return true;
        }

        Vertex vtx = vertices.get(vName1);
        ArrayList<String> neighbors = new ArrayList<>(vtx.neighbors.keySet());

        for (String neighbor : neighbors){
            if (hasPath(neighbor,vName2)){
                return true;
            }
        }

        return false;
    }
}

