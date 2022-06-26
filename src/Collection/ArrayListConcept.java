package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = new int[3];// Static Array Size is fixed
        // Dynamic Array---->ArrayList
        // It can contain duplicates values/elements
        // It maintains Insertion Order
        // It Synchronized
        // it allows the random access to fetch the elements because it stores the
        // values in the basic of indexes
        //


        ArrayList ar = new ArrayList();
        ar.add(19);// 0
        ar.add(20);// 1
        ar.add(38);// 2
        System.out.println(ar.size());
        ar.add(45.00);// 3
        ar.add(55);// 4
        ar.add(55);// 5
        ar.add("string");
        ar.add(true);
        System.out.println(ar.size());// Size of ArrayList

        System.out.println(ar.get(3));// to get the value from an index
        // if you want to print all the values from arraylist----> For loop
        // 1.For loop
        // 2.iterator
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        // Non-generic vs generic
        // before JDK 1.5 generic will not supported
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(10);
        ar1.add(45);
        // ar1.add('char');
        //ArrayList<E> ea= new ArrayList<E>();

        // how to store the specific userdefined class object in perticular
        // ArrayList...????
        // create ArrayList

        // Employee class Object
        Employee e1 = new Employee("Subhankar", 23, "QA");
        Employee e2 = new Employee("james", 27, "Dev");
        Employee e3 = new Employee("john", 25, "UAT");

        ArrayList<Employee> ar3 = new ArrayList<Employee>();
        ar3.add(e1);
        ar3.add(e2);
        ar3.add(e3);

        // iterator to traverse the values
        Iterator<Employee> it = ar3.iterator();
        while (it.hasNext()) {
            Employee emp = it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }
        System.out.println("***************");
        // *******************************************
        //addAll();
        ArrayList<String> ar4 = new ArrayList<String>();
        ar4.add("selenium");
        ar4.add("UAT");
        ar4.add("Test");

        ArrayList<String> ar5 = new ArrayList<String>();
        ar5.add("Dev");
        ar5.add("TesteEnv");
        ar5.add("admin");

        ar4.addAll(ar5);
        for(int i=0;i<ar5.size();i++){
            System.out.println(ar4.get(i));
        }
        System.out.println("**********************");
        //removeAll
        ar4.removeAll(ar5);
        for(int i=0;i<ar5.size();i++){
            System.out.println(ar4.get(i));
        }
        //retainAll
        System.out.println("**********************");
        ArrayList<String> ar6 = new ArrayList<String>();
        ar6.add("jacob");
        ar6.add("john");
        ar6.add("jeni");

        ArrayList<String> ar7 = new ArrayList<String>();
        ar7.add("sony");
        ar7.add("john");
        ar7.add("fun");

        ar6.retainAll(ar7);
        for(int i=0;i<ar7.size();i++){
            System.out.println(ar6.get(i));
        }
    }
}
