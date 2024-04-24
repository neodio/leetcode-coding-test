class Solution {
    public boolean isPalindrome(int x) {
        
        String origin = Integer.toString(x);
        String reverse = "";
        for (int i = origin.length() - 1; i >= 0; i--) {
            reverse = reverse + origin.charAt(i);
        }
        
        if (origin.equals(reverse)) {
            return true;
        }
        return false;
    }
}