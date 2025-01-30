package week5.assg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringCollection {
    public static void main(String[] args) {
        // Step 1: Declare a String array
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

        // Step 2: Add the array elements to a list
        List<String> companyList = new ArrayList<>();
        for (String company : companies) {
            companyList.add(company);
        }

        // Step 3: Sort the list in ascending order
        Collections.sort(companyList);
        System.out.println("Sorted List: " + companyList);

        // Step 4: Reverse the list
        Collections.reverse(companyList);

        // Step 5: Print the reversed list
        System.out.println("Reversed List:");
        for (String company : companyList) {
            System.out.println(company);
        }
    }
}
