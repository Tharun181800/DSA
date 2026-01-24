//Selection Sort
// Time Complexity : O(n2)
// Space Complexity : O(1)

class Selection {
    public static void selection(int[] arr, int n) {
        
        for(int i=0;i<n-1;i++) {
            int min = arr[i];
            int pos = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j]<min) {
                    min = arr[j];
                    pos = j;
                }
             }
             int temp = arr[i];
             arr[i] = arr[pos];
             arr[pos] = temp;
        }
    }

    public static void main(String[] args) {
       int[] arr = {100,50,150,25,75,1,175};
       int n = arr.length;
       selection(arr,n);
       for(int num:arr) {
           System.out.print(num + " ");
       }
    }
}