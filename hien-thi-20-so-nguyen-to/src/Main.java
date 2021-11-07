import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        int count = 0;
        int i = 2;
        while (count < number) {
            boolean check = true;
            for (int j = 2; j < (i - 1); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
