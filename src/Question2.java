import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        boolean go = true;

        String radiusStr;
        double radius;

        Scanner input = new Scanner(System.in);

        while (go) {
            System.out.print("Enter a radius: ");
            radiusStr = input.nextLine();

            if (radiusStr.equals("^d")) {
                go = false;
            } else {
                radius = Double.parseDouble(radiusStr);
                System.out.print("Area is: ");
                System.out.printf("%5f\n",Math.PI * Math.pow(radius, 2));
            }

        }

        System.out.println("Exiting now.");
    }
}
