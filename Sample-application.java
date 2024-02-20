import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your birth year: ");
            int birthYear = scanner.nextInt();
            System.out.print("Enter your birth month: ");
            int birthMonth = scanner.nextInt();
            System.out.print("Enter your birth day: ");
            int birthDay = scanner.nextInt();

            LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
            LocalDate currentDate = LocalDate.now();

            Period agePeriod = Period.between(birthDate, currentDate);

            int years = agePeriod.getYears();
            int months = agePeriod.getMonths();

            System.out.println("Your age is: " + years + " years and " + months + " months.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers for birth year, month, and day.");
        }
    }
}
