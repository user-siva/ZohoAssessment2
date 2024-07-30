import java.util.ArrayList;
import java.util.Arrays;

public class P3 {
    static int k = 0;

    public static String subString(int start, int end, String s) {
        String res = "";
        for (int i = start; i < end; i++) {
            res += s.charAt(i);
        }
        return res;
    }

    public static void findPermutations(int i, String[] words, String[] perms, String ds, boolean[] freq) {
        if (i == words.length) {
            perms[P3.k] = ds;
            P3.k++;

            return;
        } else {
            for (int j = 0; j < words.length; j++) {
                if (!freq[j]) {
                    freq[j] = true;
                    ds += words[j];
                    findPermutations(i + 1, words, perms, ds, freq);
                    freq[j] = false;
                    ds = subString(0, ds.length() - words[j].length(), ds);

                }
            }
        }

    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = { "foo", "bar" };
        int f = 1, wordLen = words.length;

        for (int i = 1; i <= wordLen; i++) {
            f *= i;
        }
        String[] perms = new String[f];

        String ds = "";
        boolean[] freq = new boolean[wordLen];

        findPermutations(0, words, perms, ds, freq);
        // System.out.println(Arrays.toString(perms));
        int permsLength = words.length * words[0].length();

        for (int i = 0; i < s.length() - permsLength; i++) {
            String curr = subString(i, i + permsLength, s);
            for (int j = 0; j < perms.length; j++) {
                if (perms[j].equals(curr)) {
                    System.out.println(i);
                }
            }
        }

    }
}
