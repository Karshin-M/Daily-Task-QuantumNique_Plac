import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 20;
        int result = squareRoot(n);
        System.out.println(+ result);
    }

    public static int squareRoot(int n) {
        int left = 0;
        int right = n;
        int ans = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid * mid == n) {
                return mid;
            }
            else if (mid * mid < n) {
                ans = mid;          
                left = mid + 1;     
            }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }
}