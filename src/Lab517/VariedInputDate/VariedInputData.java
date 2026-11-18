package Lab517.VariedInputDate;

import java.util.Scanner;

public class VariedInputData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        int total = 0;
        int max = num;

        while (num >= 0) {
            total += num;
            count++;

            if (num > max) {
                max = num;
            }

            num = scanner.nextInt();
        }

        System.out.println((total / count) + " " + max);


    }
}

