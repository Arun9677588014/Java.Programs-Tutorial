package Task.exe_21102024.Switch;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner calci = new Scanner(System.in);
        System.out.println("Enter the number 1");
        System.out.println("Enter the number 2");
        System.out.println("Enter the operation");
        int num1 = calci.nextInt();
        int num2 = calci.nextInt();
        String Operation = calci.next();

        switch (Operation)
        {
            case "add" :
                System.out.println(num1 + num2);
                break;
            case "sub" :
                System.out.println(num1 - num2);
                break;
            case "multiply" :
                System.out.println(num1 * num2);
                break;
            case "modulud" :
                System.out.println(num1 % num2);
                break;
            default :
                System.out.println("Invalid operator");

        }
        calci.close();
    }
}
