package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Syntax {

    static void HashMapMethod(){
        Map<String, Integer> mp=new HashMap<>();
        //Adding Element
        mp.put("rohit",34);
        mp.put("prince",20);
        mp.put("Ankita",57);
        mp.put("lav",43);
        mp.put("yash",23);

        //Getting value of a key from the HashMap

        System.out.println("Ankita : "+mp.get("Ankita"));  // 57
        System.out.println("Rohit: "+mp.get("rohit"));  // 34
        System.out.println("rohan : "+mp.get("rohan"));   // null

        //Changing value of a key in the HashMap

        mp.put("rohit",58);  //rohit:58
        System.out.println("Rohit: "+mp.get("rohit"));  // 58

        //remove the pair from the HashMap

        mp.remove("yash");  //remove yash pair
        mp.remove("sumit");  //not give error
        System.out.println("yash : "+mp.get("yash"));   //null



        //Checking if a key is in the HashMap
        System.out.println(mp.containsKey("rohit"));  //true
        System.out.println(mp.containsKey("rahul"));   //false

        //Adding a new entry only if the new key does't exist already

        mp.putIfAbsent("yash",32);
        mp.putIfAbsent("rohit",23);

        //Get all keys in the HashMap

        System.out.println(mp.keySet());

        //Get all values in the HashMap
        System.out.println(mp.values());

        //Get all entries in the HashMap
        System.out.println(mp.entrySet());

        //Traversing all entries of HashMap - multiple methods
        System.out.println("-----------------------------------");
        for(String key:mp.keySet()){
            System.out.printf("name: %s ,Roll no: %d\n",key,mp.get(key));
        }
        System.out.println("-----------------------------------");

        for(Map.Entry<String,Integer> e:mp.entrySet()){
            System.out.printf("name: %s ,Roll no: %d\n",e.getKey(),e.getValue());

        }
        System.out.println("-----------------------------------");

        for(var e:mp.entrySet()){
            System.out.printf("name: %s ,Roll no: %d\n",e.getKey(),e.getValue());

        }


    }

    public static void main(String[] args) {

        HashMapMethod();
    }
}
