import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(60);
        list.add(70);
        System.out.println(list);
        list.add(100);
        // to iterate the elements in the list
        //there are three ways to do so
        //1 For loops , 2  for each , 3 iterator
        for (int i =0 ; i< list.size(); i++){
            System.out.println( "The element in the are"  + list.get(i));

        }
        System.out.println( "This is the second method to iterate element in the ArrayList");
        for(Integer marks : list){
            System.out.println("The element in the list are " + marks);
        }
        System.out.println( "This is the third method to iterate element in the ArrayList");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
