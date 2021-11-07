import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount : ");
        double money = scanner.nextDouble();
        System.out.println("Enter annual interest rate in percentage : ");
        double totalInterestRate = scanner.nextDouble();
        System.out.println("Enter number of months : ");
        int month = scanner.nextInt();
        int totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (totalInterestRate / 100) / 12 * month;
        }
        System.out.println(totalInterest);
    }
}
