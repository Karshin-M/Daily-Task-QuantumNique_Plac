BLOCK 5 â€“ DATA STRUCTURES & ALGORITHMS (Medium)

Topic: Sliding Window


Practice Problem

Find first non-repeating character in string?
soln:
      import java.util.Scanner;
      public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                int count = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        count++;
                        }
                        }
                        if (count == 1) {
                            System.out.println(s.charAt(i));
                            break;
                            }
                            }
                            }
                            }
