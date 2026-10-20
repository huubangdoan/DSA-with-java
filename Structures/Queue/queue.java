public class queue {
    public static int deque(int[] arr){
        int front=arr[0];
        shiftLeft(arr, 0);
        return front;
    }
    public static int sizeArr(int[] arr){
        int count=0;
        int i=0;
        while((i<arr.length)&&(arr[i]>0)){
            count++;
            i++;
        }
        return count;
    }
    public static void shiftLeft(int[] arr, int pos){
        for ( int i=pos; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length - 1] = 0;
    }
    public static void printArr(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void enque(int[] arr, int e){
        int rear=sizeArr(arr);
        arr[rear+1]=e;
        printArr(arr);
    }
    
}
