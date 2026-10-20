import java.util.Arrays;

public class mergeSort{
    public static void main(String[]args){
        int[] arr={1,3,10,0};
        printArr(merSort(arr));
    }
    public static int[][] divideArr(int[]arr){
        int mid=arr.length/2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return new int[][] { left, right };
    }
    public static int[] merSort(int[]arr){
         if (arr.length==1||arr.length==0){
                return arr;}
        int[][] divided=divideArr(arr);
        int[] right=divided[1];
        int[] left=divided[0];
        right=merSort(right);
        left=merSort(left);
        return conquerArr(left, right);

    }
    public static int[] conquerArr(int[]left, int[]right){
        int[] ans = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] > right[j]) {
                ans[k++] = right[j++];
            } else {
                ans[k++] = left[i++];
            }
        }

        // Thay cho ans.extend(arr1[i:]) và ans.extend(arr2[j:])
        while (i < left.length) {
            ans[k++] = left[i++];
        }
        while (j < right.length) {
            ans[k++] = right[j++];
        }

        return ans;
    }
    public static void printArr(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}
}