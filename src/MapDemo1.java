import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
        Map m = new TreeMap();
        m.put(3,"Hello World");
        m.put(1,100);
        m.put(9,10.5);
        m.put(10,true);
        m.put(5,"Divyansh");
        System.out.println(m);

        Set s = m.keySet();
        Iterator i = s.iterator();
        while (i.hasNext()){
            System.out.print(i.next() + " ");
        }
        System.out.println();
        Collection li = m.values();
        Iterator i1 = li.iterator();
        while (i1.hasNext()){
            System.out.print(i1.next() + " ");
        }
        System.out.println();
        Collection c = m.entrySet();
        Iterator i2 = c.iterator();
        while (i2.hasNext()){
            System.out.print(i2.next() + " ");
        }
    }
}
