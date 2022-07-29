// import java.util.Scanner;

// public class AdvCalculator {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("What action do you want to do (m, d, a, s): ");

//         String prefix = "What action do you want to do (m, d, a, s): ";

//         String action = input.nextLine();

//         System.out.println(action);

//         System.out.print("Enter first value: ");

//         double val1 = input.nextDouble();

//         System.out.print("Enter second value: ");

//         double val2 = input.nextDouble();

//         input.close();

//         double total;

//         if(action == "m") {
//             total = val1 * val2;
//             System.out.println(val1 + " * " + val2 + " = " + total);
//         } else if (action == "d") {
//             total = val1 / val2;
//             System.out.println(val1 + " / " + val2 + " = " + total);
//         } else if (action == "a") {
//             total = val1 + val2;
//             System.out.println(val1 + " + " + val2 + " = " + total);
//         } else if (action == "s") {
//             total = val1 - val2;
//             System.out.println(val1 + " - " + val2 + " = " + total);
//         } else {
//             System.out.println("Not a valid operation!");
//         }
//     }
// }

import java.util.Scanner;

class AdvCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first value: ");
        
        double value1 = input.nextDouble();

        System.out.print("Enter second value: ");

        double value2 = input.nextDouble();

        input.close();

        double sum = value1 + value2;

        System.out.println(value1 + " + " + value2 + " = " + sum);
    }
}