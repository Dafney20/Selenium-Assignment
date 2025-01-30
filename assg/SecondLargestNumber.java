package week5.assg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
    public static void main(String[] args) {
        // Step 1: Declare an array
        int[] numbers = {3, 2, 11, 4, 6, 7};

        // Step 2: Convert the array to a list
        List<Integer> numberList = new ArrayList<>();
        for (int num : numbers) {
            numberList.add(num);
        }

        // Step 3: Sort the list in ascending order
        Collections.sort(numberList);

        // Step 4: Get the second largest number
        int secondLargest = numberList.get(numberList.size() - 2);

        // Step 5: Print the result
        System.out.println("The second largest number is: " + secondLargest);
    }
}
