import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab9ex3 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        map(arr);
    }
    public static void map(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            map.put(arr[i],arr[i]*arr[i]);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getKey()+" "+list.get(i).getValue());
        }
    }

}
