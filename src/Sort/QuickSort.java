package Sort;

public class QuickSort {
public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
    public static int partation(int[] arr, int lb, int ub){
        int pivot=arr[ub];
        int i=lb-1;
        int j=lb;
        for(;j<ub;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,ub);
        return i+1;
    }

    public static void quickSort(int[] arr,int lb,int ub){
        if(lb<ub){
           int pi=partation(arr,lb,ub);
           quickSort(arr,lb,pi-1);
           quickSort(arr,pi+1,ub);
        }
        return;
    }
    public static void main(String[] args) {
        int[] arr={4,2,6,3,8,5,7};
        int n=arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
