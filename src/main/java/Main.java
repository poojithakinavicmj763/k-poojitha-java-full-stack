import java.util.Scanner;
public class Main {
    public static int readAge(Scanner scanner) {
        System.out.print("Enter age:");
        return scanner.nextInt();
    }
    public static double readBillAmount(Scanner scanner) {
        System.out.print("Enter Bill amount:");
        return scanner.nextDouble();
    }
    public static boolean isSeniorCitizen(int age) {
        return age >= 60;
    }
    public static double calculateDiscount(double billAmount, boolean isSenior) {
        if (isSenior) {
            return Math.min(billAmount * 0.30, 300);
        }
        return 0.0;
    }
    public static void displayCustomerType(boolean isSenior) {
        if (isSenior) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Normal User");
        }
    }
    public static void displayFinalAmount(double finalAmount) {
        System.out.println("Final Bill amount: " + String.format("%.2f", finalAmount));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = readAge(scanner);
        double billAmount = readBillAmount(scanner);
        boolean senior = isSeniorCitizen(age);
        displayCustomerType(senior);
        double discount = calculateDiscount(billAmount, senior);
        double finalAmount = billAmount - discount;
        displayFinalAmount(finalAmount);
        scanner.close();
    }
}
