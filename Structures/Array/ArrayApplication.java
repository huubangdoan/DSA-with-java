package Structures.Array;

class application {
    public static int[] findSecondlargest(int[]arr){
        int max=findMax(arr,new int[]{});
        int second_index=findMax(arr, new int[]{max});
        int second=arr[second_index];
        System.out.printf("the second largest is %d%n",second);
        return new int[]{max, second_index};
    }
    public static int[] findThirdlargest(int[]arr){
        int[] skip=findSecondlargest(arr);
        int third_index=findMax(arr, skip);
        int third=arr[third_index];
        System.out.printf("the second largest is %d%n",third);
        return new int[]{skip, third_index};

    }
    public static int findMax(int[]arr, int[] skipIndex){
        int n=arr.length;
        int max=0;
        for (int i=0; i<n; i++){
            if (contains(skipIndex, i)){continue;}
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    public static boolean contains(int[] arr, int value){
        for (int v : arr){
            if (v == value) return true;
        }
        return false;
    }
}
public class ArrayApplication{
    public static void main(String[]args){
        int[] arr={1,2,3,4,9,10,1999};
        application.findSecondlargest(arr)   ;
        application.findThirdlargest(arr)   ;
    }
}
