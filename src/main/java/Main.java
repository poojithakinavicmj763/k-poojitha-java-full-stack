import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter Bill amount: ");
        double billAmount = sc.nextDouble();
        double finalBill = billAmount;
        if (age >= 60) {
            System.out.println("Senior Citizen");
            finalBill = billAmount - 300;
        } else {
            System.out.println("Normal User");
        }
        System.out.printf("Final Bill amount: %.2f", finalBill);
        sc.close();
    }
}