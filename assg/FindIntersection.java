package week5.assg;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
    public static void main(String[] args) {
        // Declare two arrays
        int[] array1 = {3, 2, 11, 4, 6, 7};
        int[] array2 = {1, 2, 8, 4, 9, 7};

        // Create lists to hold the array elements
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Add array elements to the lists
        for (int num : array1) {
            list1.add(num);
        }
        for (int num : array2) {
            list2.add(num);
        }

        // Find and print the intersection
        System.out.println("Intersection of the arrays:");
        for (int num : list1) {
            if (list2.contains(num)) {
                System.out.println(num);
            }
        }
    }
}
