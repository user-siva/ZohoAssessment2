import java.util.Arrays;

public class Generate {
    public static String subString(int start, int end, String s) {
        String res = "";
        for (int i = start; i < end; i++) {
            res += s.charAt(i);
        }
        return res;
    }

    public static void generate(int n, int l, int r, String s) {
        if (s.length() == 2 * n) {
            System.out.println(s);
            return;
        }
        if (l < n) {
            s += "(";
            generate(n, l + 1, r, s);
            s = subString(0, s.length() - 1, s);
        }
        if (r < l) {
            s += ")";
            generate(n, l, r + 1, s);
            s = subString(0, s.length() - 1, s);
        }

    }

    public static void main(String[] args) {
        int n = 5;

        String s = "";
        generate(n, 0, 0, s);
    }
}
