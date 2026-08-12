import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = scanner.nextInt();

        System.out.println("Odd numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println(); 
        scanner.close();
    }
}
