import java.util.ArrayList;

class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int top = 0;
        int bottom = r - 1;
        int left = 0;
        int right = c - 1;
        
        while (result.size() < r * c) {
            // Traverse from left to right
            for (int i = left; i <= right && result.size() < r * c; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            
            // Traverse from top to bottom
            for (int i = top; i <= bottom && result.size() < r * c; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            
            // Traverse from right to left
            for (int i = right; i >= left && result.size() < r * c; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom--;
            
            // Traverse from bottom to top
            for (int i = bottom; i >= top && result.size() < r * c; i--) {
                result.add(matrix[i][left]);
            }
            left++;
        }
        
        return result;
    }
}

