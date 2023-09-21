import java.util.Scanner;
public class RabgyalUnit1Project {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the tip calculator! ");
        System.out.print("How many people are in your group ");





        System.out.print("Enter an EVEN integer: ");
        int number = scan.nextInt();

        while (number % 2 != 0) {
            System.out.print("No silly, i said EVEN not odd! Try again: ");
            number = scan.nextInt();
        }

        System.out.print("Done!");
    }

}
