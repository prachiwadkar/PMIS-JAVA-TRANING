package practice_probolem;

import java.time.LocalDate;
import java.util.Scanner;

    public class DateExplorer {

        // Display month
        static void displayMonth(LocalDate date) {
            System.out.println("Month: " + date.getMonth());
        }

        // Display year
        static void displayYear(LocalDate date) {
            System.out.println("Year: " + date.getYear());
        }

        // Display day of the week
        static void displayDay(LocalDate date) {
            System.out.println("Day: " + date.getDayOfWeek());
        }

        // Check leap year using if-else
        static void checkLeapYear(LocalDate date) {
            if (date.isLeapYear()) {
                System.out.println("It is a leap year.");
            } else {
                System.out.println("It is not a leap year.");
            }
        }

        // Go back by a number of months
        static void lookBackMonths(LocalDate date, Scanner sc) {
            System.out.print("Enter number of months: ");
            int months = sc.nextInt();

            LocalDate pastDate = date.minusMonths(months);

            System.out.println("Previous date: " + pastDate);
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Take date input
            System.out.print("Enter date (yyyy-MM-dd): ");
            String input = sc.nextLine();

            // Convert String into LocalDate
            LocalDate date = LocalDate.parse(input);

            int choice;

            // Repeat menu until Exit
            do {
                System.out.println("\n----- DATE EXPLORER -----");
                System.out.println("1. Display Month");
                System.out.println("2. Display Year");
                System.out.println("3. Display Day of Week");
                System.out.println("4. Check Leap Year");
                System.out.println("5. Look Back Months");
                System.out.println("6. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        displayMonth(date);
                        break;

                    case 2:
                        displayYear(date);
                        break;

                    case 3:
                        displayDay(date);
                        break;

                    case 4:
                        checkLeapYear(date);
                        break;

                    case 5:
                        lookBackMonths(date, sc);
                        break;

                    case 6:
                        System.out.println("Exiting Date Explorer...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 6);

            sc.close();
        }
    }

