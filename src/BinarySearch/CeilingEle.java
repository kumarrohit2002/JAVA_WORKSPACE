package BinarySearch;
// Ceiling Element -> Smallest element greatest or equal to target element
public class CeilingEle {

    public static int binarySearch(int[] arr,int target,int s,int e){
        if(s>e){
            return arr[s];
        }else{
            int m=(s+e)/2;
            if(target==arr[m]){
                return arr[m];
            }
            else if(target>arr[m]){
                return binarySearch(arr, target, m+1, e);
            }
            else{
                return binarySearch(arr, target, s, m-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={2,4,6,14,16,18};
        int n=arr.length;
        System.out.println(binarySearch(arr,15,0,n));
    }
}
