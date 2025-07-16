import java.util.Arrays;
import java.util.List;


public class ArrayList {
    public static void main(String []args){
        // ArrayList <Integer> a = new ArrayList<>(1000);
        List<String> list = Arrays.asList("Apple","Banana","Mango");

        java.util.ArrayList<String> list1 =  new java.util.ArrayList<>(list);

        //list.add("orange");
        list1.add("orange");
        System.out.println(list1);

        List<Integer> app = List.of(1);
        // System.out.println(a.size());
        // System.out.println(a);


       /* a.add(1);   // for adding number in arraylist
        a.add(3);  // for adding number in arraylist
        a.add(4);  // for adding number in arraylist
        a.add(5);  // for adding number in arraylist

        System.out.println(a.get(0)); // for printing index using get() function
        System.out.println(a.get(1)); // for printing index using get() function
        System.out.println(a.get(3)); // for printing index using get() function

        System.out.println("total size of array is = "+a.size()); // know size of array with the help of size() function

        System.out.println("print all element with pointer with the heal of for loop");

        for(int i = 0; i < a.size(); i++){ // print all element present in array using pointer with for loop;
            System.out.println(a.get(i));
        }
        System.out.println("print all element withour pointer with the help of foreach loop");

        for(int x: a){  // print all element present in array without pointer with foreach loop;
            System.out.println(x);
        }

        System.out.println(a); // print all arraylist element without any loop:

        System.out.println("check number is present in the array or not");
        System.out.println(a.contains(3)); // check number is present in the array or not with the help of contains() function.
        System.out.println(a.contains(10));

        a.remove(2);  // remove element form the arraylist with the help of remove function
        for(int x: a){
            System.out.println(x);
        }



        a.add(3 ,30); // add any number any position
        System.out.println(a);

        a.set(3,40);   // replace any number any position with the help of set() function
        System.out.println(a);*/


    }

}