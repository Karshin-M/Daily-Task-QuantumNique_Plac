import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        int t = n;
        while(n > 0) {
            r = r * 10 + (n % 10);
            n = n / 10;
        }
        if(t == r)
            System.out.println("True");
        else
            System.out.println("False");
    }
}