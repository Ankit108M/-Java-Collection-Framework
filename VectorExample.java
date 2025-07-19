
    import java.util.Vector;

    public class VectorExample {
        public static void main(String[] args) {

            // Create a Vector of String type
            Vector<String> fruits = new Vector<>();

            // Add elements to the vector
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Mango");

            // Insert an element at a specific index
            fruits.add(1, "Orange");

            // Print all elements
            System.out.println("Fruits in the vector:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }

            // Remove an element
            fruits.remove("Banana");

            // Access an element by index
            System.out.println("First fruit: " + fruits.get(0));

            // Check size
            System.out.println("Size of vector: " + fruits.size());

            // Check if vector contains a value
            if (fruits.contains("Mango")) {
                System.out.println("Mango is in the vector!");
            }
        }
    }


