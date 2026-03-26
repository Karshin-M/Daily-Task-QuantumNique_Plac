import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replace("[", "");
        s=s.replace("]", "");
        String arr[] = s.split(",");
        int larg=-9999;
        int sec=-9999;
        for(int i=0;i<arr.length;i++){
            int num=Integer.parseInt(arr[i].trim());
            if(num>larg){
                sec=larg;
                larg=num;
            } else if(num>sec && num !=larg){
                sec=num;
            }
        }
        System.out.println(sec);
    }
}