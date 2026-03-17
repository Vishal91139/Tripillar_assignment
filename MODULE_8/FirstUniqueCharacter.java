// LeetCode 387 – First Unique Character in a String (Easy)

package MODULE_8;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        int[] count = new int[26];

        // count frequency
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // find first unique
        for(int i = 0; i < s.length(); i++) {
            if(count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
