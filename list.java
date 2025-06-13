import java.util.ArrayList;
import java.util.Iterator;


public class list {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("teja");
        list.add("tara");
        list.add("Rony");

        System.out.println(list);
        Iterator<String> iterator=list.iterator();

        while(iterator.hasNext())
        {
            String data = iterator.next();
            if(data.startsWith("R"))
            {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
     
}
