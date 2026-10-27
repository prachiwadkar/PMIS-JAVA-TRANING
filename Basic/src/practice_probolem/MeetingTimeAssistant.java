package practice_probolem;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MeetingTimeAssistant {

    // Format: 10 Nov 2026, 02:30 PM
    static DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a");

    // 1. Display meeting date and time
    static void displayMeeting(LocalDateTime meeting) {
        System.out.println("Meeting starts at: "
                + meeting.format(formatter));
    }

    // 2. Calculate meeting end time
    static void displayEndTime(LocalDateTime meeting,
                               int duration) {

        // Add duration to starting time
        LocalDateTime endTime = meeting.plusMinutes(duration);

        System.out.println("Meeting starts at: "
                + meeting.format(formatter));

        System.out.println("Meeting ends at:   "
                + endTime.format(formatter));
    }

    // 3. Display meeting in another time zone
    static void displayAnotherZone(LocalDateTime meeting) {

        // Original meeting time in India
        ZonedDateTime indiaTime =
                meeting.atZone(ZoneId.of("Asia/Kolkata"));

        // Convert India time to New York time
        ZonedDateTime newYorkTime =
                indiaTime.withZoneSameInstant(
                        ZoneId.of("America/New_York"));

        System.out.println("India time: "
                + indiaTime.format(formatter));

        System.out.println("New York time: "
                + newYorkTime.format(formatter));
    }

    // 4. Check if meeting is in the future
    static void checkFuture(LocalDateTime meeting) {

        // Current date and time in India
        LocalDateTime now =
                LocalDateTime.now(ZoneId.of("Asia/Kolkata"));

        if (meeting.isAfter(now)) {
            System.out.println("Meeting is in the future.");
        } else {
            System.out.println("Meeting is not in the future.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== MEETING TIME ASSISTANT ==========");

        // Take meeting date
        System.out.print("Enter meeting date (yyyy-MM-dd): ");
        String dateInput = sc.nextLine();

        // Convert String to LocalDate
        LocalDate date = LocalDate.parse(dateInput);

        // Take meeting time
        System.out.print("Enter meeting time (HH:mm): ");
        String timeInput = sc.nextLine();

        // Convert String to LocalTime
        LocalTime time = LocalTime.parse(timeInput);

        // Take meeting duration
        System.out.print("Enter meeting duration in minutes: ");
        int duration = sc.nextInt();

        // Combine date and time
        LocalDateTime meeting = LocalDateTime.of(date, time);

        int choice;

        // Repeat menu until user chooses Exit
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display meeting date and time");
            System.out.println("2. Display meeting end time");
            System.out.println("3. Display meeting time in another zone");
            System.out.println("4. Check whether the meeting is in the future");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    displayMeeting(meeting);
                    break;

                case 2:
                    displayEndTime(meeting, duration);
                    break;

                case 3:
                    displayAnotherZone(meeting);
                    break;

                case 4:
                    checkFuture(meeting);
                    break;

                case 5:
                    System.out.println("Exiting Meeting Time Assistant...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
