package BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, BankAccount> bankAccounts = new HashMap<>();
        String input;
        while (!(input = scanner.nextLine()).equals("End")) {
            String command = input.split("\\s+")[0];

            if (command.equals("Create")) {
                BankAccount bankAccount = new BankAccount();
                System.out.printf("Account ID%d created%n", bankAccount.getId());
                bankAccounts.put(bankAccount.getId(), bankAccount);

            } else if (command.equals("Deposit")) {

                int ID = Integer.parseInt(input.split("\\s+")[1]);
                double amount = Double.parseDouble(input.split("\\s+")[2]);

                if (!bankAccounts.containsKey(ID)) {
                    System.out.println("Account does not exist");
                } else {
                    bankAccounts.get(ID).deposit(amount);
                    System.out.printf("Deposited %.0f to ID%d%n", amount, ID);
                }


            } else if (command.equals("SetInterest")) {
                double interest = Double.parseDouble(input.split("\\s+")[1]);
                BankAccount.setInterestRate(interest);


            } else if (command.equals("GetInterest")) {
                int id = Integer.parseInt(input.split("\\s+")[1]);
                int years = Integer.parseInt(input.split("\\s+")[2]);
                if (!bankAccounts.containsKey(id)) {
                    System.out.println("Account does not exist");
                } else {
                    bankAccounts.get(id).getInterest(years);
                    System.out.printf("%.2f%n", bankAccounts.get(id).getInterest(years));
                }
            }
        }
    }
}
