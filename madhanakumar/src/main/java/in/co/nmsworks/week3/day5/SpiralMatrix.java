package in.co.nmsworks.week3.day5;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        spiralMatrix.printValues(matrix);
    }

    private void printValues(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int p1 = 0, p2 = 0, p3 = n-1, p4 = m-1;
        while (p1 <= p4 && p2 <= p3){
            for (int i = p2; i <= p3; i++) {
                System.out.print(matrix[p1][i] + " ");
            }
            p1++;
            for (int i = p1; i <= p4; i++) {
                System.out.print(matrix[i][p3] + " ");
            }
            p3--;
            if (p1 <= p4) {
                for (int i = p3; i >= p2; i--) {
                    System.out.print(matrix[p4][i] + " ");
                }
                p4--;
            }
            if (p2 <= p3) {
                for (int i = p4; i >= p1; i--) {
                    System.out.print(matrix[i][p2] + " ");
                }
                p2++;
            }
        }

    }
}
