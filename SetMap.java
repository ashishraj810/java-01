import java.util.HashMap;

public class SetMap {
    public static void main(String[] args) {
        
        HashMap<String , Integer> map=new HashMap<>();
        map.put("id0", 1);
        map.put("id1", 23);
        map.put("id2", 5);
        map.remove("id1");

        System.out.println(map.get("id1"));
        System.out.println(map.get("id6"));
        for(String key : map.keySet()){
            System.out.println(key);

        }

        for(map.keySet()){
            System.out.println(key);
        }
       

    }
    
}
