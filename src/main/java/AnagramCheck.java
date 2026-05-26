public class AnagramCheck {

    public static boolean areAnagrams(String s1, String s2) {

        // Step 1: If lengths are different
        // then strings cannot be anagrams
        if(s1.length() != s2.length()) {
            return false;
        }

        // Step 2: Create frequency array
        // 26 because only lowercase letters a-z
        int[] freq = new int[26];

        // Step 3:
        // Increase count for s1 characters
        // Decrease count for s2 characters
        for(int i = 0; i < s1.length(); i++) {

            // Example:
            // 'a' - 'a' = 0
            // 'b' - 'a' = 1

            freq[s1.charAt(i) - 'a']++;

            freq[s2.charAt(i) - 'a']--;
        }

        // Step 4:
        // If any value is not 0
        // then strings are not anagrams
        for(int i = 0; i < 26; i++) {

            if(freq[i] != 0) {
                return false;
            }
        }

        // All frequencies became 0
        // so strings are anagrams
        return true;
    }

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        System.out.println(areAnagrams(s1, s2));
    }
}