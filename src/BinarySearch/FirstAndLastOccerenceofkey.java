package BinarySearch;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastOccerenceofkey {
    public static int orrence(int[] arr,int target,boolean firstOrrence){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(target==arr[m]){
                ans=m;
                if(firstOrrence==true){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }
            else if(target>arr[m]){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return ans;
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0] = orrence(nums,target,true);
        ans[1]=orrence(nums,target,false);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,3,3,3,5};
        int[] ans=searchRange(arr,3);
        System.out.println("[ "+ans[0]+", "+ans[1]+" ]");

    }
}
