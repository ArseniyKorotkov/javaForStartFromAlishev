package Les1_13;

public class Main13MultiArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[4][3];
        matrix[0][1] = 46;

        int[][] matrix2 =  {{12, 13, 14, 15},
                            {21, 22, 23},
                            {31, 32, 33, 34, 35}};

        for(int q = 0; q < matrix2.length; q++) {
            for(int w = 0; w < matrix2[q].length; w++) {
                System.out.print(matrix2[q][w] + " ");
            }
            System.out.println();
        }
    }
}
