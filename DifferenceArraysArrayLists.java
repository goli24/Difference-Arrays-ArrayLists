import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Example using an Array (fixed size)
        String[] nameArray = new String[3];
        nameArray[0] = "Amy";
        nameArray[1] = "Ben";
        nameArray[2] = "Chloe";

        System.out.println("Array values:");
        for (String name : nameArray) {
            System.out.println(name);
        }

        // Example using an ArrayList (flexible size)
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Amy");
        nameList.add("Ben");
        nameList.add("Chloe");
        nameList.add("David"); // ArrayList allows adding more easily

        System.out.println("\nArrayList values:");
        for (String name : nameList) {
            System.out.println(name);
        }

        // Removing a value from ArrayList
        nameList.remove("Ben");
        System.out.println("\nArrayList after removing 'Ben':");
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}