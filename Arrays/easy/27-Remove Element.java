// Problem No: 27
// Problem: Remove Element
// Difficulty: Easy

/*
Approach (Two Pointer Pattern):
- Use two pointers:
  i → iterate through array
  j → place position for valid elements

- If nums[i] != val:
    place it at nums[j]
    increment j

- Return j (count of valid elements)

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0; // position for next valid element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}