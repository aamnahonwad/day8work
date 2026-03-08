import java.util.HashMap;

public class StudentMarks {
    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        // Adding students and marks
        marks.put("Aamna", 90);
        marks.put("Rahul", 85);
        marks.put("Sara", 88);
        marks.put("Ali", 76);
        marks.put("John", 92);

        // Printing all student marks
        for (String name : marks.keySet()) {
            System.out.println(name + " : " + marks.get(name));
        }
    }
}