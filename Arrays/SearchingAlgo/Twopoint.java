// Two Sum using Two pointers technique
// Time Complexity:O(n)
// Space Complexity:O(n) for input array
// Auxiliary Space: O(1)

package Arrays.SearchingAlgo;
import java.util.Scanner;

public class Twopoint {
    public static int[] tpsearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;

        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                return new int[]{left, right};
            } else if(sum<target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1,-1};
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
        int result[] = tpsearch(arr,target);
        if (result[0] != -1) {
            System.out.println("Pair found at indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No pair found");
        }

        sc.close();
    }
}
