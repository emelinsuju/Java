import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {12, 45, 7, 23, 56, 89, 34}; 
        
        System.out.print("Enter the number to search for: ");
        int n= scanner.nextInt();
        
        int position = -1; 
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                position = i; 
                break;        
            }
        }
        
        if (position != -1) {
            System.out.println("Number found at index position: " + position);
        } else {
            System.out.println("The number is not found");
        }
        scanner.close();
    }
}
