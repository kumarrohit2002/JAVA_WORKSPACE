package Collections_Framwork;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class List_interface {
    public static void ArrayListExample(){
        System.out.println("\nArrayListExample.............");
        ArrayList<Integer> l=new ArrayList<>();
        l.add(1);   // 0 index val-> 1
        l.add(2);  // 1 index val -> 2
        l.add(3);    // 2 index val -> 3
        System.out.println(l);
        System.out.println(l.get(0));
        System.out.println(l.get(1));
        l.set(0,10);   // index 0 set value 10
        System.out.println(l.get(0));
        System.out.println(l.contains(10));   //true


    }
    public static void linkedListExample(){
        System.out.println("\nlinkedListExample.............");
        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);   // 0 index val-> 1
        l.add(2);  // 1 index val -> 2
        l.add(3);    // 2 index val -> 3
        System.out.println(l);
        System.out.println(l.get(0));
        System.out.println(l.get(1));
        l.set(0,10);   // index 0 set value 10
        System.out.println(l.get(0));
        System.out.println(l.contains(10));   //true


    }

    public static void StackExample(){
        System.out.println("\nStackExample.............");
        Stack<String> st=new Stack<>();
        st.push("Rohit");
        st.push("mohit");
        st.push("Ankita");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.empty());
        st.clear();
        System.out.println(st.size());
        System.out.println(st.empty());

    }
    public static void main(String[] args) {
        ArrayListExample();
        linkedListExample();
        StackExample();
    }

}
