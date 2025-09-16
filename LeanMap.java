import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LeanMap {
    public static void main(String[] args) {
        Map<String, Integer> list  = new TreeMap<>();
        list.put("Suryansh" , 1012);
        list.put("Atul" , 2121);
        list.put("Shivam " , 20232);
        list.put("Krishna", 20324);

        System.out.println(list);
//        if(!list.containsKey("Rahul")){
//            list.put("Rahul", 2321);
//        }
        list.putIfAbsent("Bhure", 20323);
        System.out.println(list);
        for(Map.Entry<String, Integer> e:list.entrySet()){
            System.out.println(e.getValue());
        }
        for(String key : list.keySet()){
            System.out.println(key);
        }
        System.out.println(list.isEmpty());
        System.out.println(list.containsValue(20323));
    }
}
