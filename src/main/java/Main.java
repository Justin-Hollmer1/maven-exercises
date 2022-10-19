import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some text.");
        System.out.println();
        String userInput = scanner.nextLine();

        if (StringUtils.isNumeric(userInput)) {
            System.out.println(userInput + " is numeric.");
        } else {
            System.out.println(userInput + " is not numeric.");
        }

        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }
}
