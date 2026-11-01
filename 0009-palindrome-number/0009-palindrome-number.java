class Solution {
    public boolean isPalindrome(int x) {
        long reverse = 0;
        int num = x;
        int digit;
        if (num < 0) {
            return false;
        }
        while (num != 0) {
            digit = num % 10;
            reverse = (reverse * 10) + digit;
            num /= 10;
        }
        return reverse == x;
    }
}