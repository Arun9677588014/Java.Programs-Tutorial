package Oct.exe_18102024;

public class TaskNested {
    public static void main(String[] args) {
        int Grade = 90;

        String result = (Grade >= 90 ) ? "A" : (Grade >= 80 ) ? "B" : (Grade >= 70 ) ? "C": "D";
        System.out.println(result);
    }
}
