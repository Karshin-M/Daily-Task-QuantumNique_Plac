import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replace("[", "").replace("]", "");
        String[] parts=s.split(",");
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<parts.length;i++) {
            int num=Integer.parseInt(parts[i].trim());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int i=0;i<parts.length;i++){
            int num = Integer.parseInt(parts[i].trim());
            if (map.get(num)==1) {
                System.out.println(num);
                break; 
            }
        }
    }
}
