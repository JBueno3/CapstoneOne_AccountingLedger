package com.ps;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class financialTrackerCLI {

    private static final String FILE_NAME = "transactions.csv";



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        List<Transaction> transactions = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Transaction");
            System.out.println("2. View Transactions");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addTransaction(scanner, transactions);
                    break;
                case 2:
                    viewTransactions(transactions);
                    break;
                case 3:
                    saveTransactionsToFile(transactions);
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addTransaction(Scanner scanner, List<Transaction> transactions) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        System.out.print("Enter transaction description: ");
        String description = scanner.nextLine();

        System.out.print("Enter vendor: ");
        String vendor = scanner.nextLine();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        String date = dateFormat.format(new Date());
        String time = timeFormat.format(new Date());

        Transaction transaction = new Transaction(date, time, description, vendor, amount);
        transactions.add(transaction);
        System.out.println("Transaction added successfully.");
    }

    private static void viewTransactions(List<Transaction> transactions) {
        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
            return;
        }

        System.out.println("Date\tTime\tDescription\tVendor\tAmount");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    private static void saveTransactionsToFile(List<Transaction> transactions) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Transaction transaction : transactions) {
                writer.println(transaction.toCSV());
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static class Transaction {
        private String date;
        private String time;
        private String description;
        private String vendor;
        private double amount;

        public Transaction(String date, String time, String description, String vendor, double amount) {
            this.date = date;
            this.time = time;
            this.description = description;
            this.vendor = vendor;
            this.amount = amount;
        }

        public String toCSV() {
            return String.format("%s|%s|%s|%s|%.2f", date, time, description, vendor, amount);
        }

        @Override
        public String toString() {
            return String.format("%s\t%s\t%s\t%s\t%.2f", date, time, description, vendor, amount);
        }
    }
}
