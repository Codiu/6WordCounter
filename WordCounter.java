/* Hi there. I suspect the goal of this app is to count how many words being printed.

 */
import java.util.Scanner;

public class WordCounter {
    public static int count(String text) {
        String[] arr = text.split(" ");
        return arr.length;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Write text and app will count how many words there: ");
        String text = myObj.nextLine();
        System.out.println(count(text));

    }
}
