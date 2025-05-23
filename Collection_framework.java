import java.util.ArrayList;

public class Collection_framework {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Ashish");
        arr.add("Raj");
        arr.add("comet");
        arr.add("Trip");
       
        
        System.out.println(arr);
        System.out.println(arr.get(2));
        System.out.println(arr.get(3));

        arr.set(2,"real");
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
    } 
    
}
