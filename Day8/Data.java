BLOCK 5 â€“ DATA STRUCTURES & ALGORITHMS

Topic: Sorting

Problem â€“ Bubble Sort

Sort the array:
[5,2,9,1,5,6]

Python Logic

def bubbleSort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

Time Complexity: O(n^2)

Practice Problem

Implement Selection Sort

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String[] input=a.split(" ");
        int[] arr=new int[input.length];
        for (int i=0; i < input.length; i++) {
            arr[i]=Integer.parseInt(input[i]);
        }
        for (int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}