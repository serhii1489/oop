package ll;

import java.util.Scanner;

public class Task10 {
    public Task10() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        for(int i = s.length() - 1; i >= 0; --i) {
            System.out.print(s.charAt(i));
        }

    }
}
