class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = locateRow(matrix, target);

        if (row == -1) return false;

        int left = 0;
        int right = matrix[row].length;

        while (left <= right) {
            int middle = (right - left)/2 + left;

            if (matrix[row][middle] == target) {
                return true;
            }else if (matrix[row][middle] > target) {
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }

        return false;
    }

    public int locateRow(int[][] m, int t) {
        for (int i = 0; i < m.length; i++) {
            int left = 0;
            int right = m[i].length - 1;

            if (m[i][right] >= t && m[i][left] <= t) return i;
        }

        return -1;
    }
}
