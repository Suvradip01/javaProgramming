import java.util.ArrayList;

public class ArraylistMethods {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add element at the end
        numbers.add(10);               // List: [10]
        numbers.add(20);               // List: [10, 20]

        // Add element at specific index
        numbers.add(1, 15);            // List: [10, 15, 20]

        // Get element at index
        int num = numbers.get(1);      // num = 15

        // Set/replace element at index
        numbers.set(2, 25);            // List: [10, 15, 25]

        // Remove element by index
        numbers.remove(0);             // List: [15, 25]

        // Remove element by value (first occurrence)
        numbers.remove(Integer.valueOf(15));  // List: [25]

        // Check size of list
        int size = numbers.size();     // size = 1

        // Check if list contains an element
        boolean has25 = numbers.contains(25);  // true

        // Check if list is empty
        boolean empty = numbers.isEmpty();      // false

        // Clear all elements
        numbers.clear();              // List is now empty []

        // Convert ArrayList to array
        Object[] arr = numbers.toArray();  // Empty array since list is cleared

        // Find index of element (-1 if not found)
        int idx = numbers.indexOf(25);   // -1 because list is empty

        // Print results
        System.out.println("List: " + numbers);
        System.out.println("Size: " + size);
        System.out.println("Contains 25? " + has25);
        System.out.println("Is empty? " + empty);
        System.out.println("Index of 25: " + idx);
    }
}
