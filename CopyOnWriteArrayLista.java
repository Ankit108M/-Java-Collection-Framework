import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayLista {
    public static void main(String[] args) {
        // Create CopyOnWriteArrayList of Strings
        CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<>();

        // Add elements to the list
        names.add("Ankit");
        names.add("Rahul");
        names.add("Priya");

        // Print all elements
        System.out.println("Names in the list:");
        for (String name : names) {
            System.out.println(name);
        }

        // Remove an element
        names.remove("Rahul");

        // Add another element
        names.add("Sneha");


        System.out.println("Updated list:");
        for (String name : names) {
            System.out.println(name);
        }


        System.out.println("Size of list: " + names.size());


        System.out.println("Does list contain 'Priya'? " + names.contains("Priya"));
    }
}
