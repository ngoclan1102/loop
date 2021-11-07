import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a : ");
        int a = scanner.nextInt();
        System.out.println("nhap b : ");
        int b = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }


        System.out.println("nhap c : ");
        int c = scanner.nextInt();
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println("  ");
        }


          System.out.println("nhap d : ");
        int d = scanner.nextInt();
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        System.out.println("nhap e : ");
        int e = scanner.nextInt();
        for (int i = 0; i < e; i++) {
            for (int j = e - i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }



    }
}
