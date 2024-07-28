import java.util.*;

public class Solution {
    public int romanToInt(String s) {
        // Initialize a map for Roman numeral values
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;
        
        // Traverse the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));
            
            // If current value is less than previous value, subtract it
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            
            // Update previous value for the next iteration
            prevValue = currentValue;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Solution converter = new Solution();
        
        // Test cases
        System.out.println(converter.romanToInt("III"));      // Output: 3
        System.out.println(converter.romanToInt("LVIII"));    // Output: 58
        System.out.println(converter.romanToInt("MCMXCIV"));  // Output: 1994
    }
}
