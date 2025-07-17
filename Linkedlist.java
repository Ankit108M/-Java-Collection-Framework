import java.util.Arrays;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String [] args){
        LinkedList<Integer> a = new LinkedList<>(); // all function are already inbuilt in java linkedlist or list package like
        // insertion ,deletion,addition,or something else

        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(3,8);
        a.add(6);
        a.get(3);
        a.addLast(10);
        a.addFirst(1);
        a.remove(1); // 3 is deleted because index is 1.

        System.out.println(a);
        a.removeIf(x -> x % 2 == 0); // this is conditional remove function;
        System.out.println(a);
        // Java only provides a doubly linked list, if we want a singly and circular
        // linked list then we have to create the custom of  singly and circular linked list ourselves.

        LinkedList<String> animal = new LinkedList<>(Arrays.asList("cat", "Dog", "elephant"));
        LinkedList<String> animaltoremove = new LinkedList<>(Arrays.asList("cat" , "lion"));
        animal.removeAll(animaltoremove);
        System.out.println(animal);
    }


}

