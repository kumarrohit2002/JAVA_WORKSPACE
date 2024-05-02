package Basic_Question;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the event name: ");
        String eventName = sc.nextLine().trim();
        String[] words = eventName.split("\\s+");
        StringBuilder camelCase = new StringBuilder(words[0].substring(0, 1).toUpperCase() + words[0].substring(1));
        for (int i = 1; i < words.length; i++) {
            camelCase.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1));
        }
        System.out.println("Event name in camel case: " + camelCase);
    }
}
