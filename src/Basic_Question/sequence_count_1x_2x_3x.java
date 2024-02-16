package Basic_Question;



public class sequence_count_1x_2x_3x {
    public static void main(String[] args) {

        int[] arr={1,2,3,10,20,30};
        int c=0;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i+1]%2==0 && arr[i+2]%3==0){
                c++;
                i=i+1;
            }
        }
        System.out.println(c);

    }
}
