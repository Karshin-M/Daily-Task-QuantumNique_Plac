public class Main{
    public static void main(String[] args){
        int[] arr={5, 8, 2, 10, 7};
        int first=0;
        int second=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>first){
                first=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=first) {
                if(arr[i]>second) {
                    second=arr[i];
                }
            }
        }
        System.out.println(second);
    }
}