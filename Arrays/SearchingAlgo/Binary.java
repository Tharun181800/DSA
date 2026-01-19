//Linear Search : best for unsorted arrays
//Time Complexity:
// Best Case : O(1) 
// Average Case : O(log n) 
// Worst Case : O(log n)
//Space Complexity:
// O(n) -> for input array 
// Auxiliary Space Complexity: 
// O(1) -> iterative binary search, no extra data structures

package Arrays.SearchingAlgo;
import java.util.Scanner;

public class Binary {
    public static int binary(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;

        while(left<=right) {
            int mid = left + (right - left) / 2;
            if(arr[mid]==target) {
                return mid;
            } else if(arr[mid]<target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr size of an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the arrays (only sorted arrays allowed): ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target:");
        int target = sc.nextInt();
        int result = binary(arr,target);
        System.out.println("The target is on index: " + result);
        sc.close();
    }
}
