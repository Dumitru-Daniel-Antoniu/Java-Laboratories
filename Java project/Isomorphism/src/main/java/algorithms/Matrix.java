package algorithms;

import structure.*;

public class Matrix {

    public Matrix() {}
    public int verifyIsomorphism(GraphComponents graph1, GraphComponents graph2) {
        int[][] matrix1 = graph1.getAdjacencyMatrix();
        int[][] matrix2 = graph2.getAdjacencyMatrix();
        if(graph1.verifyEqualityVertices(graph2.getNumberOfVertices()) == 0) return 0;
        if(graph1.verifyEqualityEdges(graph2.getNumberOfEdges()) == 0) return 0;
        if(graph1.verifyEqualityDegrees(graph2.getDegrees()) == 0) return 0;
        for(int i = 1; i <= graph1.getNumberOfVertices(); i++) {
            for(int j = 1; j <= graph1.getNumberOfVertices(); i++) {
                if(matrix1[i][j] != matrix2[i][j]) return 0;
            }
        }
        return 1;
    }
}
