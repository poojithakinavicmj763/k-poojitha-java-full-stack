import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter bill amount: ");
        double billAmount = scanner.nextDouble();
        double discount = 0.0;
        double finalBill;
        if (age >= 60) {
            System.out.println("Senior Citizen");
            discount = billAmount * 0.30;
            if (discount > 300) {
                discount = 300;
            }
        } else {
            System.out.println("Normal User");
        }
        finalBill = billAmount - discount;
        System.out.println("Final Bill Amount:");
        System.out.printf("%.2f%n", finalBill);
        scanner.close();
    }
}