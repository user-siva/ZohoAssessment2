public class P4 {
    public static int find(int[] arr, int target) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int target = 7;
        System.out.println(find(arr, target));
    }
}
