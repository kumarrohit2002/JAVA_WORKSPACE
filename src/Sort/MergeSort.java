package Sort;

public class MergeSort {
    public static void merge(int[] arr,int lb,int mid,int ub){
        //temp first array size
        int an=mid-lb+1;
        //temp second array size
        int bn=ub-mid;
        int[] a=new int[an];
        int[] b=new int[bn];
        for(int i=0;i<an;i++){
            a[i]=arr[lb+i];
        }
        for(int i=0;i<bn;i++){
            b[i]=arr[mid+1+i];
        }
        int k=lb;
        int i=0;
        int j=0;
        while(i<an && j<bn){
            if(a[i]<b[j]) arr[k++]=a[i++];
            else arr[k++]=b[j++];
        }
        while(i<an){
            arr[k++]=a[i++];
        }
        while(j<bn){
            arr[k++]=b[j++];
        }
        return;
    }


    public static void mergeSort(int[] arr,int lb,int ub){
        int mid=lb+(ub-lb)/2;
        if(lb<ub){
            mergeSort(arr,lb,mid);
            mergeSort(arr,mid+1,ub);
            merge(arr,lb,mid,ub);
        }
        return;
    }
    public static void main(String[] args) {
        int[] arr={4,2,8,3,9,7,5};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
