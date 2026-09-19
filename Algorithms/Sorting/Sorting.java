import java.util.Arrays;

class algo {
    public int[] bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1 - i; j++){ 
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        return arr;
    }
    public int[] selectionSort(int[] arr){
        int n=arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<=n-1; j++){
                if (arr[j]>arr[i]){
                }
            }
        }
        return arr;
    }
}

public class Sorting{
    public static void main(String[] args){
        algo algo = new algo();
        int[] arr = {1, 100, 3, 4, 1, 3, 5};
        //System.out.println(Arrays.toString(algo.bubbleSort(arr)));
        System.out.println(Arrays.toString(algo.selectionSort(arr)));
    }
}