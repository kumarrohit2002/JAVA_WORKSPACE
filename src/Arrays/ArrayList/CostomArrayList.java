package Arrays.ArrayList;
import java.util.Arrays;
public class CostomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CostomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int n){
        if(isfull()){
            resize();
        }else{
            data[size++]=n;
        }
    }

    private void resize(){
        int[] temp=new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    public int remove(){
        int removed=data[size--];
        return removed;
    }


    public int get(int idx){
        return data[idx];
    }

    private boolean isfull(){
        return size==data.length;
    }

    public int Size(){
        return size;
    }


    public void set(int idx,int value){
        data[idx]=value;
    }

    @Override
    public String toString(){
        return "CustomArrayList{"+Arrays.toString(data)+
                ", size= "+size+" }";
    }

    public static void main(String[] args) {
        CostomArrayList list=new CostomArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
    }
}
