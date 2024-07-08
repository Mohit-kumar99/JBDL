package SimpleInterestCalculatorUsingInterface;

import java.util.Scanner;

public class InterestCalculator {
    public interface Bank {
        double calculateInterest(double amount, int months);
    }


    public static class BankOfBaroda implements Bank {
        private static final double ANNUAL_INTEREST_RATE = 5.0;

        @Override
        public double calculateInterest(double amount, int months) {
            return amount * (ANNUAL_INTEREST_RATE / 100) * (months / 12.0);
        }
    }

    public static class ICIC implements Bank {
        private static final double ANNUAL_INTEREST_RATE = 6.0;

        @Override
        public double calculateInterest(double amount, int months) {
            return amount * (ANNUAL_INTEREST_RATE / 100) * (months / 12.0);
        }
    }

    public static class StateBankOfIndia implements Bank {
        private static final double ANNUAL_INTEREST_RATE = 7.0;

        @Override
        public double calculateInterest(double amount, int months) {
            return amount * (ANNUAL_INTEREST_RATE / 100) * (months / 12.0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input in the format: BANK_NAME AMOUNT MONTH");
        String input = scanner.nextLine();

        String[] inputParts = input.split(" ");
        String bankName = inputParts[0];
        double amount = Double.parseDouble(inputParts[1]);
        int months = Integer.parseInt(inputParts[2]);

        Bank bank = null;

        switch (bankName.toUpperCase()) {
            case "BankOfBaroda":
                bank = new BankOfBaroda();
                break;
            case "ICIC":
                bank = new ICIC();
                break;
            case "StateBankOfIndia":
                bank = new StateBankOfIndia();
                break;
            default:
                System.out.println("Invalid bank name");
                System.exit(0);
        }

        double interest = bank.calculateInterest(amount, months);
        System.out.println("The calculated interest is: " + interest);
    }
}
