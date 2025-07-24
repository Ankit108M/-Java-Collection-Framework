import java.util.HashMap;
import java.util.Map;

public class Map_framework {
    public static void main(String[] args) {
        // Create a Map to store student names and their marks
        Map<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Ankit", 85);
        studentMarks.put("Rahul", 90);
        studentMarks.put("Sneha", 78);

        // Print all key-value pairs
        System.out.println("Student Marks:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Get marks of a specific student
        System.out.println("Marks of Rahul: " + studentMarks.get("Rahul"));

        // Remove a student
        studentMarks.remove("Sneha");

        // Check if a student exists
        System.out.println("Is Ankit in the list " + studentMarks.containsKey("Ankit"));

        // Check if a marks value exists
        System.out.println("Is there any student with 90 marks? " + studentMarks.containsValue(90));

        // Print updated map
        System.out.println("Updated Student Marks:");
        System.out.println(studentMarks);
    }
}

