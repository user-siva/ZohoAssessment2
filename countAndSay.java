public class countAndSay {
    public static String find(int n) {
        String res = "";
        int i = 1;
        String current = "1";
        while (i < n) {
            String next = "";
            int l = current.length(); // 1
            int count = 1;
            int j = 0;
            while (j < l) {
                if (j < l - 1 && current.charAt(j) == current.charAt(j + 1))
                    count++;
                else {
                    next += count;
                    next += current.charAt(j);
                    // System.out.println(count);
                    // System.out.println(current.charAt(j));
                    // System.out.println(next);
                    count = 1;
                }
                j++;
            }
            current = next;
            res = next;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(find(n));
    }
}
