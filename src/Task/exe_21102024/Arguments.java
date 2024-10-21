package Task.exe_21102024;

public class Arguments {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println(x > y ? x : y);
        System.out.println("The largest no is " + y);
        System.out.println("The smallest no is " + x);


    }
}
