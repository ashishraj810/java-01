import java.util.HashMap;

public class SetMap {
    public static void main(String[] args) {
        
        HashMap<String , Integer> map=new HashMap<>();
        map.put("id0", 1);
        map.put("id1", 23);
        map.put("id2", 5);

        System.out.println(map.get("id1"));
        System.out.println(map.get("id6"));

    }
    
}
