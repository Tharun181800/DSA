package Arrays.TwoPointers;

// Question: Reverse an array
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Scanner;
class Reverse {
    public static void rev(int arr[]) {
        int left = 0;
        int right = arr.length-1;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left ++;
            right --;
        }
        System.out.print("The reversed arrays are: ");
        for(int num: arr) {
            System.out.print(num + " ");
        }
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
        rev(arr);
        sc.close();
    }
}