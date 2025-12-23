import java.util.Scanner;
class FoodBillDiscount {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            System.out.print("Enter Bill amount: ");
            double billAmount = scanner.nextDouble();

            double finalBill = billAmount;

            if (age >= 60) {
                System.out.println("Senior Citizen");

                double discount = billAmount * 0.30;

                // Maximum discount cap of 300
                if (discount > 300) {
                    discount = 300;
                }

                finalBill = billAmount - discount;
            } else {
                System.out.println("Normal User");
            }

            System.out.println("Final Bill amount:");
            System.out.printf("%.2f", finalBill);
        }
    }
}
