package Task.exe_21102024;

import java.util.Scanner;

public class Task_scanner {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Enter the Name :");
        System.out.println("Enter the age :");
        System.out.println("Enter the salary :");
        String Name = task.next();
        int age = task.nextInt();
        int salary= task.nextInt();

        System.out.println(Name + age + salary);
    }
}
