//https://leetcode.com/problems/two-sum/description/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Step1: Create a HashMap containing key, value pair where key is always unique and value can be same
        Map<Integer,Integer> map = new HashMap<>();
        // loop through the array
        for(int i=0; i<nums.length;i++){
            // find the complement of the selected element
            Integer complement = target - nums[i];
            // checking if the map contains the complement in map as the key
            if(map.containsKey(complement))
            {
                // if it does exist it is our answer, add it to returning array result
                int returnTo[] = {map.get(complement), i};
                return returnTo;
            }else{
                // if it does not exist then add it into the map
                map.put(nums[i],i);
            }
        }
        // if in case the pair does not exist then simply return null
        return null;
    }
}