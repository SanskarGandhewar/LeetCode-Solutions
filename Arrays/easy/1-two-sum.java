// Problem No: 1
// Problem: Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Difficulty: Easy

/*
Approach:
- Use a HashMap to store value -> index
- For each element, calculate complement = target - nums[i]
- If complement exists in map, return indices
- Otherwise, store current element in map

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
