#https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int balance = target - nums[i];
            if(map.containsKey(balance)){
                return new int[]{map.get(balance), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1,-1};
    }
}
