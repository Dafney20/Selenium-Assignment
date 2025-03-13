package week1.day1;

public class FindOddNumbers {

    
    int maxRange = 10;

    
    public void printOddNumbers() {
       
        for (int i = 1; i <= maxRange; i++) {
           
            if (i % 2 != 0) {
                System.out.println(i); 
            }
        }
    }

    
    public static void main(String[] args) {
        
        FindOddNumbers oddNumbers = new FindOddNumbers();
        
        oddNumbers.printOddNumbers();
    }
}



