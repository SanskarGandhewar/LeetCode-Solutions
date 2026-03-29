// Problem: Check if Two Strings Can Be Made Equal Using Index Swaps
// LeetCode: 2839
// Difficulty: Easy/Medium (based on platform)
// Approach: Compare even and odd indices separately
// Time: O(1) | Space: O(1)

class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.length() != s2.length()) 
            return false;
        
        boolean even = (s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0)) || 
            (s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2));
        
        boolean odd = (s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3)) || 
            (s1.charAt(3) == s2.charAt(1) && s1.charAt(1) == s2.charAt(3));
        
        return even && odd;
    }
}