package Arrays.TwoPointers;

// Question: Remove duplicate elements in an array
// Time complexity: O(n)
// Space complexity: O(1)
// Note: This works only on sorted arrays we use Hashset for unsorted

import java.util.Scanner;
class Duplicate {

    public static int dup(int[] arr, int n) {
        if(n==0) {
            return n;
        }
        int i=0;
        for(int j=1;j<n;j++) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the sorted elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int result = dup(arr,n);

        System.out.print("The final array: ");
        for(int i=0;i<result;i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}