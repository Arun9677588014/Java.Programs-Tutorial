package Task.exe_21102024;

import java.util.Scanner;

class Task_scanner {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Enter the Name :");
        System.out.println("Enter the age :");
        System.out.println("Enter the salary :");
        String name = task.next();
        int age = task.nextInt();
        int salary= task.nextInt();

        System.out.printf("%s\n", name);
        System.out.printf("%d\n %d", age,salary);



        task.close();
    }
}