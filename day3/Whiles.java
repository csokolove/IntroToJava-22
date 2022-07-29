import java.util.Scanner;

public class Whiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean userLikes = true;

        while(userLikes == true) {
            System.out.print("Input 1 to stop: ");
            int userNumber = input.nextInt();

            if(userNumber == 1) {
                userLikes = false;
            }
        }
        input.close();
    }
}
