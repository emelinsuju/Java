import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number ");
        int n= scanner.nextInt();
        
        int temp = n;
        int r= 0;
        
        
        while (temp > 0) {
            int d = temp % 10;
            r= (r* 10) + d;
            temp = temp / 10;
        }
        if (n== r) {
            System.out.println(n+ " is a palindrome.");
        } else {
            System.out.println(n+ " is not a palindrome.");
        }
        
        scanner.close();
    }
}
