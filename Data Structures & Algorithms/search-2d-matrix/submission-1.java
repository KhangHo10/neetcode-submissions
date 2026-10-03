class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int l = 0, r = row * col - 1;

        while(r >= l) {
            int mid = l + (r-l)/2;
            int currentR = mid/col;
            if(matrix[currentR][mid%col] == target) {
                return true;
            }else if(matrix[currentR][mid%col] < target) {
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return false;
    }
}
