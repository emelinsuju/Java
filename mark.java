import java.util.Scanner;

class Marks {
   
    private double mark1;
    private double mark2;
    private double mark3;

    public Marks(double mark1, double double2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = double2;
        this.mark3 = mark3;
    }
    public double[] calculateTotalAndAverage() {
        double total = mark1 + mark2 + mark3;
        double average = total / 3.0;
        return new double[]{total, average};
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter marks for Subject 1: ");
        double m1 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double m2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double m3 = scanner.nextDouble();
        Marks studentMarks = new Marks(m1, m2, m3);

        double[] results = studentMarks.calculateTotalAndAverage();
        double total = results[0];
        double average = results[1];
        System.out.println("Student Results ");
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Marks: %.2f\n", average);

        scanner.close();
    }
}
