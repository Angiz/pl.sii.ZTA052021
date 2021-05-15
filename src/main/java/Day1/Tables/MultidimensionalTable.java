package Day1.Tables;

public class MultidimensionalTable {

    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int [][] matrix = new int[rows][cols];

        int counter = 0;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = counter;
                counter++;

            }
        }
        for (int[] i: matrix) {
            for (int j: i) {
                System.out.println(j);
            }
        }

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.println("Tab["+i+","+j+"]="+matrix[i][j]);

            }
        }
    }
}
