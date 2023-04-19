package javaPractice;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class pgm {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            sum += factorial(num % 10);
            num /= 10;
        }

        return sum == originalNum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = Integer.parseInt(scanner.nextLine());
        Set<Integer> set = new TreeSet<>();
        for (int i = 1; i <= number; i++) {
            if (isStrongNumber(i)) {
                set.add(i);
            }
        }
        System.out.println("The Strong numbers between 1 and " + number + " are:");
        System.out.println(set);
        scanner.close();
    }
}
