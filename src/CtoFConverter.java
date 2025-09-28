import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double celsius = 0;
       boolean done = false;
       String trash;

       do {
           System.out.print("Enter temperature in Celsius : ");
           if (in.hasNextDouble()) {
               celsius = in.nextDouble();
               in.nextLine(); // clear buffer
               done = true;
           } else {
               trash = in.nextLine();
               System.out.println("You entered: " + trash);
               System.out.println("Invalid input! Please enter number.");
           }
       } while (!done);

       double fahrenheit = celsius * 9/5 + 32;

        System.out.println(celsius + " C = " + fahrenheit + " F");
    }
}