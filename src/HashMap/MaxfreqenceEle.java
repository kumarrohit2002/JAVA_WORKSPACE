package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MaxfreqenceEle {

    public static void main(String[] args) {
        int[] arr={1,3,2,4,2,5,1,1,2,1};
        Map<Integer,Integer> freq=new HashMap<>();
        for(int el: arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }else{
                freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println("Frquence element "+ freq.entrySet());
        int maxf=-1;
        int ans=-1;
        for(var ele :freq.entrySet()){
            if(maxf<ele.getValue()){
                maxf=ele.getValue();
                ans=ele.getKey();
            }
        }
        System.out.println(ans+" ka frequence "+maxf);
    }
}
