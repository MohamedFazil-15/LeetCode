class Solution {
    public boolean isPalindrome(int x) {
         int number = x;
        int reversedNumber = 0;

        if(x < 0){
            return false;
        }

        while(number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        if(x==reversedNumber){
            return true;
        }else{
            return false;
        }
        
    }
}
