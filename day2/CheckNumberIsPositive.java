package week1.day2;
public class CheckNumberIsPositive {
    public static void main(String[] args) {
        int version = 10;  

        if (version > 0) {
            System.out.println(version + " is a positive number.");
        } else if (version < 0) {
            System.out.println(version + " is a negative number.");
        } else {
            System.out.println(version + " is neither positive nor negative.");
        }
    }
}

