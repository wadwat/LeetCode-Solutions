class Solution {
    public int reverse(int x) {
        long reverse = 0;
        int digit;
        int num = x;
        while (num != 0) {
            digit = num % 10;
            reverse = (reverse * 10) + digit;
            num = num / 10;
        }

        if (reverse>Integer.MAX_VALUE || reverse<Integer.MIN_VALUE){
            return 0;
        }
        
        return (int) reverse;
    }
}