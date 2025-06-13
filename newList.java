import java.util.ArrayList;
import java.util.ListIterator;

public class newList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("reo");
        list.add("de");
        list.add("genero"); 
        list.add("reo");

        
        
       ListIterator<String> iterator=list.listIterator();
        while (iterator.hasNext()) {
            String data=iterator.next();
            System.out.println(data);
        }

        System.out.println("Mai alag hu!!!");

        while(iterator.hasPrevious())
        {
            String PrevData=iterator.previous();
            System.out.println(PrevData);

        }            
        



    }
    
}
