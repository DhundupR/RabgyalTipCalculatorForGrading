import java.util.Scanner;
public class RabgyalUnit1Project {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator! ");
        System.out.println("How many people are in your group ");  // num of people
        int numPeople = scan.nextInt();

        System.out.println("What's the tip percentage? (0-100): "); // tip percentage
        int tipPercent = scan.nextInt();

        System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double cost = scan.nextDouble();
        double total = 0;
        total = total + cost; //added cost to total

        while (cost != 1) {
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            total = total + cost; // added cost to total
        }
        total ++;

        double tipTotal = tipPercent * 0.01;
        tipTotal = total * tipTotal;
        double fullBill = total + tipTotal;

        double perPersonTip = tipTotal/numPeople;
        double perPersonBill = total/numPeople;
        double totalPerPerson = perPersonBill + perPersonTip;
        System.out.println("---------------------------");
        System.out.println("Total bill before tip: $" + total);
        System.out.println("Total Tip Percentage: %" + tipPercent);
        System.out.println("Total Tip : $" + tipTotal);
        System.out.println("Total bill with tip: $" + fullBill);
        System.out.println("Per Person Bill Before Tip: $" + perPersonBill);
        System.out.println("Tip Per Person: $" + perPersonTip);
        System.out.println("Total Cost Per Person: $" + totalPerPerson);

    }


}
