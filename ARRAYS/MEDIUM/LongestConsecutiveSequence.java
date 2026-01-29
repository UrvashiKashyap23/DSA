import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all elements to HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Iterate through the set
        for (int num : set) {

            // Step 3: Check if num is the start of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // Step 4: Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
     public static void main(String[] args) {
        // Input array
        int[] a = {100, 4, 200, 1, 3, 2}; 
        System.out.println("The longest consecutive sequence is " + longestConsecutive(a)); 
    }
}
 
