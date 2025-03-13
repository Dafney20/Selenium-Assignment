package week3.day1;

public class DuplicateArray {
       
       public static void main(String[] args) {
    // Define the array with duplicate values
    int[] num = {2, 5, 7, 7, 5, 9, 2, 3, 3};
    
    // Sort the array
    java.util.Arrays.sort(num);
    
    System.out.println("Duplicate values are:");
    
    // Iterate through the array to find duplicates
    for (int i = 0; i < num.length - 1; i++) {
        if (num[i] == num[i + 1]) {
            System.out.println(num[i]);
            // Skip the next iteration if consecutive duplicates exist
            
            while (i < num.length - 2 && num[i] == num[i + 1]) {
                i++;
            }
        }
    }
}
}
