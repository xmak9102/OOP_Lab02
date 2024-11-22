package displaytriangle;
/**
 * 
 */
import java.util.Collections;
import java.util.Scanner;

public class Display_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();
        
        if (height <= 0) {
            System.out.println("Please enter a positive integer for the height.");
        } else {
            printStarTriangle(height);
        }
        
        scanner.close();
    }
    
    public static void printStarTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.print(String.join("", Collections.nCopies(height-i, " ")));
            System.out.println(String.join("", Collections.nCopies(2*i-1, "*")));         
        }
    }
}

