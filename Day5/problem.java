import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace("[", "").replace("]", "");
        String arrStr[] = s.split(",");
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arrStr.length; i++) {
            int num = Integer.parseInt(arrStr[i].trim());

            if (set.contains(num)) {
                System.out.println(num);
                return;
            }
            set.add(num);
        }
    }
}