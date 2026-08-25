public class Searching{
    //O(n)
    public void linearSearch(int[] arr, int e){
        for (int i=0; i<    arr.length; i++){
            if (arr[i]==e){
                System.out.printf("Found %s at index %s%n", e, i);
            }
        }
    }
    //O(log(n))
    public void binarySearch(int[] arr,int e, int start, int end){
        if (start>end){
            System.out.print("input error");
        }
        int mid= (end-start)/2;
        int median=arr[mid];
        if (median==e){
            System.out.printf("Found %s at index %s%n", e, mid);
        }
        else if (median>e){
            binarySearch(arr, e, start, mid);
        }
        else{
            binarySearch(arr, e, mid, end);
        }
    }
}