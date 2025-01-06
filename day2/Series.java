package week1.day2;  

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range for Fibonacci series: ");
        int range = scanner.nextInt();  
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci series up to " + range + ": ");
        System.out.print(first + ", " + second);
        
        int next;
        while (true) {
            next = first + second;  
            if (next > range) {
                break;  
            }
            System.out.print(", " + next); 
            first = second;  
            second = next;   
        }
        scanner.close(); 
    }
}