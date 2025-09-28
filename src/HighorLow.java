import java.util.Random;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HighorLow {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random gen = new Random();

    int number = gen.nextInt(10) + 1; // random 1-10
        int guess = 0;
        boolean done = false;
        String trash;

        do {
            System.out.print("Guess the nyumber (1-10): ");
            if (in.hasNextInt()){
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Invalid guess! Choose a number between 1 and 10");
                }                }
            }while (!done);

        System.out.println("Random number: " + number);
        if (guess < number) {
            System.out.println("You guessed too low!");
        } else if (guess > number) {
            System.out.println("You guessed too high!");
        } else {
            System.out.println("You guessed correctly!");
        }
    }

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static class RectangleInfo {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            double width = 0, height = 0;
            boolean done;
            String trash;

            //Width
            done = false;
            do {
                System.out.print("Enter width: ");
                if (in.hasNextDouble()) {
                    width = in.nextDouble();
                    in.nextLine();
                    done = true;
                } else {
                    trash = in.nextLine();
                    System.out.println("Invalid input: " + trash);
                }
            } while (!done);
            // Height
            done = false;
            do {
                System.out.print("Enter height: ");
                if (in.hasNextDouble()) {
                    height = in.nextDouble();
                    in.nextLine();
                    done = true;
                } else {
                    trash = in.nextLine();
                    System.out.println("Invalid input: " + trash);
                }
            } while (!done);
            double area = width * height;
            double perimeter = 2 * (width + height);
            double diagonal = Math.sqrt(width * width + height * height);

            System.out.println("Area of rectangle: " + area);
            System.out.println("Perimeter of rectangle: " + perimeter);
            System.out.println("Diagonal of rectangle: " + diagonal);
        }
    }
}