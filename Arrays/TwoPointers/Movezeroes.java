package Arrays.TwoPointers;

// Question: Move all zeroes to end
// Time complexity: O(n)
// Space complexity: O(1)

import java.util.Scanner;;
class Movezeroes {
    public static int[] zero(int[] arr, int n) {
        int k = 0;
        for(int i=0;i<n;i++) {
            if(arr[i] != 0) {
                arr[k++] = arr[i];
            }
        }
         while (k < arr.length) {
            arr[k++] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int result[] = zero(arr,n);

        System.out.print("The final array: ");
        for(int j=0;j<result.length;j++) {
            System.out.print(result[j] + " ");
        }
        sc.close();
    }
}
