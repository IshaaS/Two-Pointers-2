// Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// start from button left or top right
// move by comparing target and current element until target is found or index goes out of bound.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length ==0) return false;
        int m =matrix.length;
        int n = matrix[0].length;
        int i = m-1;
        int j=0;
        while(i>=0 && j <n){
            if(matrix[i][j]==target) return true;
            if(matrix[i][j]<target) j++;
            else i--;
        }
        return false;
    }
}