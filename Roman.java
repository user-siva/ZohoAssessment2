
public class Roman {
    public static int getVal(char roman) {
        int value = 0;
        switch (roman) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
        }
        return value;
    }

    public static int find(String s) {
        int l = s.length();
        int res = 0, i = 0;
        while (i < l) {
            char roman = s.charAt(i);
            int value = getVal(roman);
            if (i < l - 1 && value < getVal(s.charAt(i + 1))) {
                // System.out.println("in:" + getVal(s.charAt(i + 1)));
                res += (getVal(s.charAt(i + 1)) - value);
                i += 2;
            } else {
                res += value;
                i += 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(find(s));
    }
}
