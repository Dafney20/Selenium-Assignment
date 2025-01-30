package week5.assg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementFinder {
    public static void main(String[] args) {
        // Step 1: Declare an array
        int[] numbers = {1, 2, 3, 4, 10, 6, 8};

        // Step 2: Convert the array to a list
        List<Integer> numberList = new ArrayList<>();
        for (int num : numbers) {
            numberList.add(num);
        }

        // Step 3: Sort the list in ascending order
        Collections.sort(numberList);

        System.out.println("Sorted List: " + numberList);

        // Step 4: Find the missing numbers
        System.out.println("Missing numbers are:");
        for (int i = 0; i < numberList.size() - 1; i++) {
            int current = numberList.get(i);
            int next = numberList.get(i + 1);

            // Check if there's a gap between the current and next number
            while (current + 1 < next) {
                System.out.println(current + 1);
                current++;
            }
        }
    }
}
