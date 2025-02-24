import java.util.Scanner;
public class IsoscelesTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Loop through each row of the triangle
        for (int line = 1; line <= n; line++) {
            // Calculate and print leading spaces to right-justify the triangle
            for (int space = 1; space <= (n - line) * 2; space++) {
                System.out.print(" ");
            }

            // Print numbers increasing up to the current row count
            int num = 1;
            for (int col = 1; col <= (2 * line - 1); col++) {
                System.out.print(num + " ");
                num++;
            }

            // Move to the next line after each row is printed
            System.out.println();
        }

      
    }
}
