package Task.exe_21102024.For;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int reverse = 0;


        for (int i = 0; number != 0; i++) {
            int rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;

        }System.out.println("The reverse is " + reverse);
        sc.close();
    }
}