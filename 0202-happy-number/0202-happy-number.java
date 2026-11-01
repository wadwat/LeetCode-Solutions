class Solution {
    public boolean isHappy(int n) {
        while (true) {
            int sum = 0;
            int num = n;
            int digit;
            while (num != 0) {
                digit = num % 10;
                sum = sum + (digit * digit);
                num /= 10;
            }
            if (sum == 1) {
                return true;
            }
            if (sum == 4) {
                return false;
            }
            n = sum;
        }
    }
}