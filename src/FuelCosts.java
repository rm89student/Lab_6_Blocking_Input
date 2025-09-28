import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons = 0, mpg = 0, price = 0;
        boolean done;
        String trash;

        // Gallons

        done = false;

        do {
            System.out.print("Enter gallons of gas in tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);

        // MPG
        done = false;
        do {
            System.out.print("Enter mpg of gas in tank: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);

        // Price
        done = false;
        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }while (!done);

        double cost100 = (100 / mpg) * price;
        double distance = gallons * mpg;

        System.out.println("The Cost to drive 100 miles is $" + cost100);
        System.out.println("The Distance with full tank is " + distance + " miles");
    }
}