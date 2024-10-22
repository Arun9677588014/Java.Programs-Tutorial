package Task.exe_21102024;

import java.util.Scanner;

public class If_Condition {
    public static void main(String[] args) {
        Scanner Mark = new Scanner(System.in);
        System.out.println("Enter you score:");
        int score = Mark.nextInt();
        if (score >= 90){
            System.out.println("Your Grade is A");
        } else if (score >= 80 ) {
            System.out.println("Your Grade is B");

        } else if (score >= 70 ) {
            System.out.println("Your Grade is C");
        } else if (score >= 60 ) {
            System.out.println("Your Grade is D");
        } else if (score >= 50 ) {
            System.out.println("Your Grade is E");
        }else {
            System.out.println(" Need to Study Hard ");
        }
        Mark.close();
    }
}
