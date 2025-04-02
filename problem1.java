//Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//we keep one pinter for current index and one for calculating frequecy... until frequency of element does not
//cross 2, we keeep writing it to the current index, after frequency crosses 2, we just increment 2nd pointer
//until it reached new element and make count to 1.

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int current = 0;
        int count =1;
        while(i<nums.length){
            if(nums[i]==nums[i-1])count++;
            else count = 1;
            if(count <=2){
                current++;
                nums[current] = nums[i];
            }
            i++;
        }
        return current+1;
    }
}