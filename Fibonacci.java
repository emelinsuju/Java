import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Enter a  positive number");
        } else {
            int first = 0, second = 1;
            System.out.print("The fibonacci numbers: ");
            
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
