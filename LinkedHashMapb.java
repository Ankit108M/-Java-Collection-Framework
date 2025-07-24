import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapb{
    public static void main(String[] args) {
        // Create a LinkedHashMap to store student names and their marks
        LinkedHashMap<String, Integer> studentMarks = new LinkedHashMap<>();

        studentMarks.put("Ankit", 85);
        studentMarks.put("Rahul", 90);
        studentMarks.put("Sneha", 78);


        System.out.println("Student Marks:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + "" + entry.getValue());
        }

        // Get marks of a specific student
        System.out.println("Marks of Rahul " + studentMarks.get("Rahul"));

        // Remove a student
        studentMarks.remove("Sneha");

        // Check if a student exists
        System.out.println("Is Ankit in the list" + studentMarks.containsKey("Ankit"));

        // Check size of the map
        System.out.println("Number of students" + studentMarks.size());


        System.out.println("Updated Student Marks:");
        System.out.println(studentMarks);
    }
}
