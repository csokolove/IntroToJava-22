package finals;
import javax.swing.*;

public class ChrisCalc {
    static String[] buttons = { "Add", "Subtract", "Multiply", "Divide" };
    public static void main(String[] args) {
        int response = requestOp();
        double answer;

        switch(response) {
            case(0):
                answer = requestInput() + requestInput();
                JOptionPane.showMessageDialog(null, "The sum is: " + answer, "Calculator", 1);
                break;
            case(1):
                answer = requestInput() - requestInput();
                JOptionPane.showMessageDialog(null, "The difference is: " + answer, "Calculator", 1);
                break;
            case(2):
                answer = requestInput() * requestInput();
                JOptionPane.showMessageDialog(null, "The product is: " + answer, "Calculator", 1);
                break;
            case(3):
                answer = requestInput() / requestInput();
                JOptionPane.showMessageDialog(null, "The quotient is: " + answer, "Calculator", 1);
                break;
        }
    }

    public static int requestOp() {
        return JOptionPane.showOptionDialog(null, "Operation?", "Calculator", JOptionPane.DEFAULT_OPTION, 3, null, buttons, null);
    }

    public static double requestInput() {
        String value = JOptionPane.showInputDialog(null, "Enter a value: ");
        return Integer.parseInt(value);
    }
}