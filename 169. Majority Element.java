#https://leetcode.com/problems/majority-element/description/

class Solution {
    public int majorityElement(int[] nums) {
        return helper(nums, 0, nums[0]);
    }
    static int helper(int[] nums, int startElement, int majorityElement){
        int occ = 0;
        for(int i = startElement; i < nums.length; i++) {
            if(nums[i] == majorityElement)
                occ++;
            else
                occ--;
            if(occ == -1)
                return helper(nums, i, nums[i]);
        }
        return majorityElement;
    }

}
