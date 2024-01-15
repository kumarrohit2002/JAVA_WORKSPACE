package BinarySearch;

public class binarySearch {
    public static int  BSearch(int[] arr, int target, int s, int e){
        if(s>=e) return -1;
        int m=s+(e-s)/2;
        if(target==arr[m]) return m;
        else if(target>arr[m]){
           return  BSearch(arr, target, m+1, e);
        }
        else{
            return BSearch(arr, target, s, m-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8,9,10};
        int n=arr.length;
        System.out.println(BSearch(arr,5,0,n-1));
    }
}
