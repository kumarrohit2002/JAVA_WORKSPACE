package practice_Question;

public class mergeSort {
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void merge(int[] arr,int lb,int mid,int ub){

        int an=mid-lb+1;
        int bn=ub-mid;
        int[] a=new int[an];
        int[] b=new int[bn];
        for(int i=0;i<an;i++){
            a[i]=arr[lb+i];
        }
        for(int i=0;i<bn;i++){
            b[i]=arr[mid+i+1];
        }
        int i=0;
        int j=0;
        int k=lb;
        while(i<an &&j<bn){
            if(a[i]<b[j]){
                arr[k++]=a[i++];
            }else{
                arr[k++]=b[j++];
            }
        }
        while(i<an){
            arr[k++]=a[i++];
        }
        while(j<bn){
            arr[k++]=b[j++];
        }
        return;
    }
    public static void mergesort(int[] arr,int lb,int ub){
        int mid=lb+(ub-lb)/2;
        if(lb<ub){
            mergesort(arr,lb,mid);
            mergesort(arr,mid+1,ub);
            merge(arr,lb,mid,ub);
        }
        return;
    }

    public static void main(String[] args) {
        int[] arr={5,3,8,4,6,2,7};
        int n=arr.length;
        mergesort(arr,0,n-1);
        print(arr);
    }
}
