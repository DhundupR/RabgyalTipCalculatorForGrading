import java.util.Scanner;
public class RabgyalUnit1Project {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the tip calculator! ");
        System.out.print("How many people are in your group ");  // num of people
        int numPeople = scan.nextInt();

        System.out.print("What's the tip percentage? (0-100): "); // tip percentage
        int tipPercent = scan.nextInt();

        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double cost = scan.nextInt();
        double total = 0;
        total = total + cost; //added cost to total

        while (cost != 1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextInt();
            total = total + cost; // added cost to total
        }
        total ++;

        double tipTotal = tipPercent * 0.01;
        tipTotal = total * tipTotal;
        double fullBill = total + tipTotal;

        double perPersonTip = tipTotal/numPeople;
        double perPersonBill = total/numPeople;
        double totalPerPerson = perPersonBill + perPersonTip;
        System.out.print("---------------------------");
        System.out.print("Total bill before tip: $" + total);
        System.out.print("Total Tip Percentage: %" + tipPercent);
        System.out.print("Total Tip : $" + tipTotal);
        System.out.print("Total bill with tip: $" + fullBill);
        System.out.print("Per Person Bill Before Tip: $" + perPersonBill);
        System.out.print("Tip Per Person: $" + perPersonTip);
        System.out.print("Total Cost Per Person: $" + totalPerPerson);

    }


}
