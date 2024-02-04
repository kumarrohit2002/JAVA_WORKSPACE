package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplemation {
    public static class Hash{

        private Map<Integer,Integer>[] arr=new Map[10];
        Hash() {
            // Initialize each element of the array as a HashMap
            for (int i = 0; i < 10; i++) {
                arr[i] = new HashMap<>();
            }
        }
        private int idx=0;
        void put(int key,int val){

            arr[key%10].put(key,val);
        }
        void get(int key){
//            return arr[key%10].get(key);
            System.out.println(arr[key%10]);
        }


    }
    public static void main(String[] args) {
        Hash h=new Hash();
        h.put(738,500);
        h.put(75849,1000);
//        System.out.println(h.get(738));
        h.get(738);

    }
}

//put
//remove
//