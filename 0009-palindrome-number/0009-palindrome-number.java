class Solution {
    public boolean isPalindrome(int x) {
        long reverse = 0;
        int num = x;
        int digit;
        while (num != 0) {
            digit = num % 10;
            reverse = (reverse * 10) + digit;
            num /= 10;
        }
        if (reverse == x && reverse >= 0) {
            return true;
        } else {
            return false;
        }
    }
}