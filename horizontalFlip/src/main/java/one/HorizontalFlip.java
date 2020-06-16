package one;

/**
 * Hello world!
 */
public final class HorizontalFlip {
    private HorizontalFlip() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // int[][] matrix = {{1,1,1}, {0,0,0}};
        int[][] matrix = {{1,2,3}, {4,5,6},{7,8,9}};
        flipHorizontalAxis(matrix);
    }

    public static void flipHorizontalAxis(int[][] matrix){
        // Check if m is even or odd
        if (matrix.length % 2 == 0){
            for (int row = 0; row < matrix.length/2; row=row+2) {
                for (int col = 0; col < matrix[row].length; col++) {
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[row + 1][col];
                    matrix[row + 1][col] = temp;
                }
            }
        } else {
            for (int row = 0; row < matrix.length/2; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[row + 2][col];
                    matrix[row + 2][col] = temp;
                }
            }
        }
    }
}
