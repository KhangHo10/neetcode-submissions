class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = locateRow(matrix, target);

        if (row == -1) return false;

        int left = 0;
        int right = matrix[row].length - 1;

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
        int left = 0;
        int right = m.length - 1;

        while (left <= right) {
            int middle = (right - left)/2 + left;

            if (m[middle][m[middle].length - 1] >= t && m[middle][0] <= t) {
                return middle;
            }else if (m[middle][m[middle].length - 1] < t) {
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }

        return -1;
    }
}
