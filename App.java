import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next(); //до первого пробела, nextLine - до Enter
        boolean result = true;

        for (int i = 0; i < s.length() / 2; i++) {

            char first = s.charAt(i);

            char second = s.charAt((s.length() - 1) - i);

            boolean k = first - second == 32 || second - first == 32 || first == second;
            if (!k) {
                result = false;
                break;
            }
        }
        System.out.print(result);
    }
}