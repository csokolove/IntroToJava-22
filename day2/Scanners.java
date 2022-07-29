import java.util.Scanner;

class Scanners {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = input.nextLine();

        input.close();

        System.out.println("Hello " + name + "!");
    }
}