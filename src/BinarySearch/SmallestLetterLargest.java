package BinarySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetterLargest {
    public static char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e=letters.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(target<letters[m]) e=m-1;
            else s=m+1;
        }
//        System.out.println(s%arr.length);
        return letters[s%letters.length];
    }
    public static void main(String[] args) {
        char[] arr={'a','d','f','h'};
        int n=arr.length;
        char target='a';
        System.out.println(nextGreatestLetter(arr,target));
    }
}
