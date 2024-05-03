import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // איך לקלוט מערך  של מספרים בגודל שהמשתמש יחליט מהמשתמש ולשמור אותו

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to enter? ");
        int n = scanner.nextInt();

        System.out.println("Great! Enter " + n + " integers: ");
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}