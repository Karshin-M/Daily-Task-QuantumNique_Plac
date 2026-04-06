public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30, 35};
        int target = 25;
        int low = 0;
        int high = numbers.length - 1;
        int foundIndex = -1; 
        while (low <= high) {
            int mid = (low + high) / 2; 
            if (numbers[mid] == target) {
                foundIndex = mid;
                break;          
            } 
            else if (numbers[mid] < target) {
                low = mid + 1;  
            } 
            else {
                high = mid - 1;
            }
        }
        System.out.println(+ foundIndex);
    }
}