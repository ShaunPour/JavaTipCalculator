import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TipCalc();
    }

    static void TipCalc() {
        final DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        Currency usd = Currency.getInstance("USD");

        System.out.println("Bill: ");
        double bill = Integer.parseInt(scanner.nextLine());

        System.out.println("Party Size: ");
        int partySize = Integer.parseInt(scanner.nextLine());

        System.out.println("Tip: ");
        double tipAmount = Integer.parseInt(scanner.nextLine());

        double tipPercentage = (double) tipAmount / 100;
        double totalTip = bill * tipPercentage;
        double tipPerPerson = totalTip/partySize;
        System.out.println(df.format(tipPerPerson));
    }
}