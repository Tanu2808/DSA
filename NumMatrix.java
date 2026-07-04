class NumMatrix {

    int[][] prefix;
    public NumMatrix(int[][] matrix) {
        prefix = new int[matrix.length][matrix[0].length];
        prefix[0][0] = matrix[0][0];
        for (int i = 1; i < matrix[0].length; i++) {
            prefix[0][i] = matrix[0][i] + prefix[0][i - 1];
        }
        for (int i = 1; i < matrix.length; i++) {
            prefix[i][0] = matrix[i][0] + prefix[i - 1][0];
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                prefix[i][j] = prefix[i - 1][j] + prefix[i][j - 1] + matrix[i][j] - prefix[i - 1][j - 1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (col1 == 0 && row1 == 0) return prefix[row2][col2];
        if (col1 == 0) return prefix[row2][col2] - prefix[row1 - 1][col2];
        if (row1 == 0) return prefix[row2][col2] - prefix[row2][col1 - 1];
        return prefix[row2][col2] - prefix[row2][col1 - 1] - prefix[row1 - 1][col2] + prefix[row1 - 1][col1 - 1];
    }
}
