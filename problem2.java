// Problem2 (https://leetcode.com/problems/merge-sorted-array/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// we are using 3 pointers one for end of nums1, one for end of nums2 and other for end of actual size of num1.
// We are comparing from back to avoid disturbing the sorting of newly generated array.


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int i = m+n -1;
        while(p1>=0 && p2>=0){
            if(nums1[p1]>=nums2[p2]){
                nums1[i] = nums1[p1];
                p1=p1-1;
            }
            else{
                nums1[i] = nums2[p2];
                p2--;
            }
            i=i-1;
        }
        while(p2>=0){
            nums1[i] = nums2[p2];
            i--;
            p2--;
        }
    }
}