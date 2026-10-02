public class stack {
    public int[] arr;
    public int top;
    public stack(int size){
        arr= new int[size];
        top=-1;
    }
    public void push(int e){
        if(top>arr.length-1){
            return;
        }
        arr[top+1]=e;
        top++;
        printArr(arr);

    }
    public void pop(){
        if(top==-1){
            return;
        }
        arr[top]=0;
        top--;
        printArr(arr);
    }
    public void printArr(int[]arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
