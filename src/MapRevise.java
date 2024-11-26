import java.util.*;

public class MapRevise {
    public static void main(String[] args) {
        Map m = new TreeMap();
        m.put(35,"YOOO");
        m.put(12,"Age");
        m.put(45,19);
        m.put(1,"divyansh");
        m.put(100,true);
        m.put(99,86.79);
        System.out.print(m + " ");
        System.out.println();
        Set s = m.keySet();
        Iterator i = s.iterator();
        while (i.hasNext()){
            System.out.print(i.next() + " ");
        }
        System.out.println();
        Collection c = m.values();
        Iterator i1 = c.iterator();
        while (i1.hasNext()){
            System.out.print(i1.next() + " ");
        }
        System.out.println();
        Collection c1 = m.entrySet();
        Iterator i2 = c1.iterator();
        while (i2.hasNext()){
            System.out.print(i2.next() + " ");
        }
        System.out.println();
        System.out.println(m.size());
        System.out.println(m.containsKey(45));
        if (m.containsValue("divyansh")){
            m.remove(1);
        }
        System.out.print(m + " ");
        System.out.println();
        m.clear();
        System.out.println(m);
        m.put(1,"Hii");
        m.put(2,"my");
        m.put(3,"name");
        m.put(4,"is");
        m.put(5,"Divyansh");
        System.out.print(m + " ");
    }
}
