import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age:");
        int age = scanner.nextInt();
        System.out.print("Enter Bill amount:");
        double billAmount = scanner.nextDouble();
        double discount = 0.0;
        if (age >= 60) {
            System.out.println("Senior Citizen");
            discount = Math.min(billAmount * 0.30, 300);
        } else {
            System.out.println("Normal User");
        }
        double finalBillAmount = billAmount - discount;
        System.out.println("Final Bill amount: " + String.format("%.2f", finalBillAmount));
        scanner.close();
    }
}