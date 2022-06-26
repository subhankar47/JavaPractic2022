package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("UAT");
        ll.add("QTP");
        ll.add("SELENIUM");
        ll.add("Java");
        // print
        System.out.println("print all value =" + ll);
        // addFirst
        ll.addFirst("gulu");
        // addLast
        ll.addLast("John");
        // print
        System.out.println("content of LinkedList=" + ll);
        // get
        ll.get(0);
        System.out.println(ll.get(0));
        // Set
        ll.set(0, "jacob");
        System.out.println(ll.get(0));
        // removeFirst & removeLast
        ll.removeFirst();
        ll.removeLast();
        System.out.println("content of LinkedList=" + ll);
        ll.remove(2);
        System.out.println("content of LinkedList=" + ll);
        // How to print all the value of LInkedList
        // for loop
        System.out.println("*******for loop*********");
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }
        //Advance for loop
        System.out.println("*******Advance loop********");
        for(String str:ll) {
            System.out.println(str);
        }
        //iterator
        System.out.println("*********iterator*********");
        Iterator<String> it = ll.iterator();//iterator reference
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        //while loop
        System.out.println("**********while loop*********");
        int num=0;
        while(ll.size()>num) {
            System.out.println(ll.get(num));
            num++;
        }
    }
}
