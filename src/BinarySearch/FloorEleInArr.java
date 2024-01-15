package BinarySearch;
// floor Element -> largest element smallest or equal to target element
public class FloorEleInArr {
    public static int binarySearch(int[] arr,int target,int s,int e){
        if(s>e){
            return arr[e];
        }else{
            int m=s+(e-s)/2;
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
        System.out.println(binarySearch(arr,15,0,n-1));
    }
}
