import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Launch {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(10);
        ll.add(20);
        ll.add(75);
        ll.add(105);
        ll.add(123);
        ll.add(156);

         Iterator  itr = ll.iterator();
         try {
             while (itr.hasNext()) {
                 System.out.println(itr.next());

                 ll.add(55);
             }
         } catch (Exception e) {
             System.out.println("Failfast due to concurrentModification");
         }

         }

    }

