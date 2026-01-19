//Linear Search : best for unsorted arrays
//Time Complexity:O(n)
//Space Complexity:O(1)

package Arrays.SearchingAlgo;
import java.util.Scanner;

public class Linear {
        public static int linear(int[] arr, int target) {
            for(int i=0;i<arr.length;i++) {
                if(arr[i]==target) {
                    return i;
                }
            }
            return-1;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr size of an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the arrays: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target:");
        int target = sc.nextInt();
        int result = linear(arr,target);
        System.out.println("The target is on index: " + result);
        sc.close();
    }
}
