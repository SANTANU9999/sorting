package Sorting;
import java.util.*;
public class insersort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println("\nSorted array is");
        for (int i = 1; i < arr.length ; i++) {
            int j=i-1;
            int c=arr[i];
            while(j>=0 && arr[j]>c){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=c;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
