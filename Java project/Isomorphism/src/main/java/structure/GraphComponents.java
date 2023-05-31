package structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GraphComponents {
    private int numberOfVertices;
    private int numberOfEdges;
    private List<Integer> vertices;
    private int[] degrees;
    private List<Pair<Integer, Integer>> edges;
    private int[][] adjacencyMatrix;

    public GraphComponents() {}

    public GraphComponents(int numberOfVertices, int numberOfEdges) {
        this.numberOfVertices = numberOfVertices;
        this.numberOfEdges = numberOfEdges;
    }

    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    public void setNumberOfVertices(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
    }

    public int getNumberOfEdges() {
        return numberOfEdges;
    }

    public void setNumberOfEdges(int numberOfEdges) {
        this.numberOfEdges = numberOfEdges;
    }

    public List<Integer> getVertices() {
        return this.vertices;
    }

    public void setVertices() {
        this.vertices = new ArrayList<>();
        for(int i = 0; i < this.numberOfVertices; i++) {
            this.vertices.add(i + 1);
        }
    }

    public int[] getDegrees() {
        return this.degrees;
    }

    public void setDegrees() {
        this.degrees = new int[this.numberOfVertices];
        for(int i = 0; i < this.numberOfEdges; i++) {
            Pair<Integer, Integer> pair = this.edges.get(i);
            this.degrees[pair.getNode1() - 1] += 1;
            this.degrees[pair.getNode2() - 1] += 1;
        }
    }

    public List<Pair<Integer, Integer>> getEdges() {
        return this.edges;
    }

    public void setEdges() {
        this.edges = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < this.numberOfEdges; i++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            Pair<Integer, Integer> pair = new Pair(m, n);
            this.edges.add(pair);
        }
    }

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public int setAdjacencyMatrix() {
        int numberOfElements = 0;
        this.adjacencyMatrix = new int[this.numberOfVertices + 1][this.numberOfVertices + 1];
        for(int i = 0; i < this.numberOfEdges; i++) {
            Pair<Integer, Integer> pair = this.edges.get(i);
            if(pair.getNode1() == pair.getNode2()) {
                System.out.println("Edges from a vertex to himself are not allowed");
                return 0;
            }
            else if(pair.getNode1() > this.numberOfVertices) {
                System.out.println("Found inexistent edge in the first graph");
                return 0;
            }
            else if(pair.getNode2() > this.numberOfVertices) {
                System.out.println("Found inexistent edge in the second graph");
                return 0;
            }
            else if(this.adjacencyMatrix[pair.getNode1()][pair.getNode2()] == 1 || this.adjacencyMatrix[pair.getNode2()][pair.getNode1()] == 1) {
                System.out.println("Same edge was declared twice");
                return 0;
            }
            else {
                this.adjacencyMatrix[pair.getNode1()][pair.getNode2()] = 1;
                this.adjacencyMatrix[pair.getNode2()][pair.getNode1()] = 1;
            }
        }
        return 1;
    }

    public int verifyNumberOfEdges() {
        int number = (this.numberOfVertices * (this.numberOfVertices - 1)) / 2;
        if(this.numberOfEdges > number) {
            System.out.println("Number of edges is bigger than the maximum number of possible edges: " + number);
            return 0;
        }
        else return 1;
    }

    public int verifyEqualityVertices(int numberOfVertices) {
        if(this.numberOfVertices != numberOfVertices) {
            System.out.println("The graphs are not isomorphic: they don't have the same number of vertices");
            return 0;
        }
        return 1;
    }

    public int verifyEqualityEdges(int numberOfEdges) {
        if(this.numberOfEdges != numberOfEdges) {
            System.out.println("The graphs are not isomorphic: they don't have the same number of edges");
            return 0;
        }
        return 1;
    }
    public int verifyEqualityDegrees(int[] degrees) {
        for(int i = 0; i < this.degrees.length; i++) {
            if(this.degrees[i] != degrees[i]) {
                System.out.println("The graphs are not isomorphic: they don't have the same degrees of the nodes");
                return 0;
            }
        }
        return 1;
    }

}
