package Collection;

import java.util.HashMap;
import java.util.Map;

public class HasMap {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // HasMap is a class implements from Map
        // HasMap extends AbstractMap
        // It contains only unique elements
        // Store the value<Key,Value> pair
        // It may have one Null key and multiples null values
        // it maintains no order
        //HasMap is non-Synchronised-->not thread safe-->
        //concurrent modificaton exception-->fail Fast condition

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "RQ");
        hm.put(2, "RA");
        hm.put(3, "Design");
        hm.put(4, "Coding");
        hm.put(5, "Testing");
        hm.put(6, "Release");
        hm.put(7, "Maintenance");
        System.out.println(hm.get(7));

        for(Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+"           "+m.getValue());
        }
        System.out.println(hm);
        hm.remove(4);
        System.out.println(hm);
        HashMap<Integer,Employee> emp = new  HashMap<Integer,Employee>();

        Employee  e1 = new Employee("Tom",23,"Test");
        Employee  e2 = new Employee("john",27,"Admin");
        Employee  e3 = new Employee("Stev",26,"Dev");

        emp.put(1, e1);
        emp.put(2, e2);
        emp.put(3, e3);

        //print everything in HashMap
        //entry is an Interface which is used traverse the HashMap
        for(Map.Entry<Integer,Employee> m : emp.entrySet()) {
            int key = m.getKey();
            Employee em = m.getValue();
            System.out.println("Empolyee "+key+" "+" key information");

            System.out.println(em.name+" "+em.age+" "+em.dept);
        }
    }
}
